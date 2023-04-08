package ch.bbbaden.game;

import ch.bbbaden.bingo.BingoGame;
import ch.bbbaden.player.ActualPlayer;
import ch.bbbaden.player.Player;
import ch.bbbaden.roulette.RouletteGame;

import java.util.List;
import java.util.stream.Stream;

public class GameFactory {

    /**
     * Creates a new game.
     *
     * @param selectedGame the game type
     * @param actualPlayer the actual player
     * @param players      the players
     * @return the chosen game instance or null, if the game type is not supported
     */
    public static Game createGame(GameTypes selectedGame, ActualPlayer actualPlayer, List<Player> players) {
        switch (selectedGame) {
            case BINGO:
                return new BingoGame(Stream.concat(Stream.of(actualPlayer), players.stream()).toList());
            case ROULETTE:
                return new RouletteGame(actualPlayer);
            default:
                return null;
        }
    }

}
