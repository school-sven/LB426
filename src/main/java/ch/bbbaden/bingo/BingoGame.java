package ch.bbbaden.bingo;

import ch.bbbaden.game.Game;
import ch.bbbaden.player.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BingoGame implements Game {

    private static final int MAX_NUMBER = 75;
    private static final Random RANDOM = new Random();

    private final List<Player> players;
    private final List<Integer> bingoNumbers;
    private final List<BingoObserver> observers = new ArrayList<>();

    public BingoGame(List<Player> players) {
        this.players = players;
        addObserver(new BingoGui());
        bingoNumbers = IntStream.rangeClosed(1, MAX_NUMBER).boxed().collect(Collectors.toList());
    }

    public void initializePlayers() {
        players.forEach(player -> {
            player.setStake(player.getPlayerStake());
            player.subtractBalance(player.getStake());
            player.setBingoCard(new BingoCard(MAX_NUMBER));
        });
    }

    /**
     * {@inheritDoc}
     */
    public void startGame() {
        notifyPlayerInformation();
        do {
            int currentNumber = bingoNumbers.remove(RANDOM.nextInt(bingoNumbers.size()));
            notifyChosenNumber(currentNumber);
            System.lineSeparator();

            for (Player player : players) {
                if (player.getBingoCard().isNumberOnCard(currentNumber)) {
                    notifyPlayerHasNumber(player.getName());
                }
                notifyBingoCard(player);
            }
        } while (players.stream().noneMatch(player -> player.getBingoCard().hasWon()));
    }

    public void evaluateWinner() {
        Player winner = getWinner();
        int sum = players.stream().mapToInt(Player::getStake).sum();
        winner.addBalance(sum);
        players.forEach(player -> player.setStake(0));
        notifyPlayerInformation();
    }

    public void addObserver(BingoObserver observer) {
        observers.add(observer);
    }

    private void notifyChosenNumber(int number) {
        for (BingoObserver observer : observers) {
            observer.updateChosenNumber(number);
        }
    }

    private void notifyPlayerHasNumber(String playerName) {
        for (BingoObserver observer : observers) {
            observer.updatePlayerHasNumber(playerName);
        }
    }

    private void notifyBingoCard(Player player) {
        for (BingoObserver observer : observers) {
            observer.updateBingoCard(player);
        }
    }

    private void notifyPlayerInformation() {
        for (BingoObserver observer : observers) {
            observer.updatePlayerInformation(players);
        }
    }

    private Player getWinner() {
        return players.stream().filter(player -> player.getBingoCard().hasWon()).findFirst().orElseThrow(() -> new RuntimeException("Could not find winner"));
    }

}
