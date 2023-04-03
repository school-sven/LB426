package ch.bbbaden.game;

import ch.bbbaden.bingo.BingoGame;
import ch.bbbaden.player.Player;
import ch.bbbaden.roulette.RouletteGame;

import java.util.List;

public class GameFactory {

    /**
     * Creates a new game.
     *
     * @param selectedGame the game type
     * @param players      the players
     * @return the chosen game instance or null, if the game type is not supported
     */
    public static Game createGame(GameTypes selectedGame, List<Player> players) {
        switch (selectedGame) {
            case BINGO:
                return new BingoGame(players);
            case ROULETTE:
                return new RouletteGame(players);
            default:
                return null;
        }
    }
}
