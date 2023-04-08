package ch.bbbaden.roulette;

import ch.bbbaden.game.Game;
import ch.bbbaden.player.ActualPlayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RouletteGame implements Game {

    private static final Random RANDOM = new Random();

    private final ActualPlayer actualPlayer;
    private final List<RouletteObserver> observers = new ArrayList<>();

    private RouletteNumbers rouletteNumber;

    public RouletteGame(ActualPlayer actualPlayer) {
        this.actualPlayer = actualPlayer;
        addObserver(new RouletteGui());
    }

    /**
     * {@inheritDoc}
     */
    public void initializePlayers() {
        do {
            RouletteBet bet = new RouletteBet(RouletteGui.getPlayerBet(), actualPlayer.getPlayerStake());
            actualPlayer.subtractBalance(bet.betValue());
            actualPlayer.addBet(bet);
        } while (RouletteGui.addAnotherBet());
        updateShowAllBets();
    }

    /**
     * {@inheritDoc}
     */
    public void startGame() {
        rouletteNumber = getRandomNumber();
        updateChosenNumber();
    }

    @Override
    public void evaluateWinner() {
        for (RouletteBet bet : actualPlayer.getBets()) {
            if (bet.betType().getKey().equalsIgnoreCase(rouletteNumber.getNumber())) {
                actualPlayer.addBalance(bet.betValue() * bet.betType().getMultiplier());
                updatePlayerWonBet(bet);
            } else if (bet.betType().getKey().equalsIgnoreCase(rouletteNumber.getColor())) {
                actualPlayer.addBalance(bet.betValue() * bet.betType().getMultiplier());
                updatePlayerWonBet(bet);
            }
        }
        actualPlayer.clearBets();
        rouletteNumber = null;
        updatePlayerInformation();
    }

    public void addObserver(RouletteObserver observer) {
        observers.add(observer);
    }

    private void updateShowAllBets() {
        observers.forEach(observer -> observer.showAllBets(actualPlayer.getBets()));
    }

    private void updateChosenNumber() {
        observers.forEach(observer -> observer.updateChosenNumber(rouletteNumber));
    }

    private void updatePlayerWonBet(RouletteBet bet) {
        observers.forEach(observer -> observer.updatePlayerWonBet(actualPlayer.getName(), bet.betValue()));
    }

    private void updatePlayerInformation() {
        observers.forEach(observer -> observer.updatePlayerInformation(actualPlayer));
    }

    private RouletteNumbers getRandomNumber() {
        return RouletteNumbers.values()[RANDOM.nextInt(RouletteNumbers.values().length)];
    }

}
