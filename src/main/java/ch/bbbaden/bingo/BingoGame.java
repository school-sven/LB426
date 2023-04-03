package ch.bbbaden.bingo;

import ch.bbbaden.game.Game;
import ch.bbbaden.player.Player;
import ch.bbbaden.random.Random;
import ch.bbbaden.random.RandomImpl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BingoGame implements Game {

    private static final int MAX_NUMBER = 75;
    private static final Random RANDOM = RandomImpl.getInstance();

    private final List<Player> players;
    private final List<Integer> bingoNumbers;

    public BingoGame(List<Player> players) {
        this.players = players;

        bingoNumbers = IntStream.rangeClosed(1, MAX_NUMBER)
                .boxed()
                .collect(Collectors.toList());
    }

    /**
     * {@inheritDoc}
     */
    public void startGame() {
        BingoGui.printPlayerInformation(players);
        do {
            int currentNumber = bingoNumbers.remove(RANDOM.nextInt(bingoNumbers.size()));
            BingoGui.printChosenNumber(currentNumber);
            System.lineSeparator();

            for (Player player : players) {
                if (player.getBingoCard().isNumberOnCard(currentNumber)) {
                    BingoGui.printPlayerHasNumber(player.getName());
                }
                BingoGui.printBingoCard(player);
            }
        } while (players.stream().noneMatch(player -> player.getBingoCard().hasWon()));
    }

    public void initializePlayers() {
        players.forEach(player -> {
            player.setStake(player.getPlayerStake());
            player.subtractBalance(player.getStake());
            player.setBingoCard(new BingoCard(MAX_NUMBER));
        });
    }

    public void evaluateWinner() {
        Player winner = getWinner();

        double sum = players.stream()
                .mapToDouble(Player::getStake)
                .sum();

        players.forEach(player -> {
            if (player.equals(winner)) {
                player.addBalance(sum);
            }
        });

        BingoGui.printPlayerInformation(players);
    }

    private Player getWinner() {
        return players.stream()
                .filter(player -> player.getBingoCard().hasWon())
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Could not find winner"));
    }

}
