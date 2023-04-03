package ch.bbbaden.roulette;

import ch.bbbaden.game.Game;
import ch.bbbaden.player.Player;

import java.util.List;

public class RouletteGame implements Game {

    private final List<Player> players;

    public RouletteGame(List<Player> players) {
        this.players = players;
    }

    /**
     * {@inheritDoc}
     */
    public void initializePlayers() {
        System.out.println("Roulette wird gestartet!");
    }

    /**
     * {@inheritDoc}
     */
    public void startGame() {
        System.out.println("Roulette wird gestartet!");
    }

    @Override
    public void evaluateWinner() {
        System.out.println("Roulette wird beendet!");
    }

}
