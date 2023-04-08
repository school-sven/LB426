package ch.bbbaden.game;

import ch.bbbaden.bingo.BingoGame;
import ch.bbbaden.player.ActualPlayer;
import ch.bbbaden.roulette.RouletteGame;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GameFactoryTest {

    @Test
    public void testCreateGameWithBingo() {
        // given
        var gameType = GameTypes.BINGO;
        var player = new ActualPlayer("Test Name", 100);

        // when
        Game game = GameFactory.createGame(gameType, player, new ArrayList<>());

        // then
        assertNotNull(game);
        assertTrue(game instanceof BingoGame);
    }

    @Test
    public void testCreateGameWithRoulette() {
        // given
        var gameType = GameTypes.ROULETTE;
        var player = new ActualPlayer("Test Name", 100);

        // when
        Game game = GameFactory.createGame(gameType, player, new ArrayList<>());

        // then
        assertNotNull(game);
        assertTrue(game instanceof RouletteGame);
    }

    @Test
    public void testCreateGameWithUnknownGameType() {
        // given
        var player = new ActualPlayer("Test Name", 100);

        // when
        // then
        assertThrows(NullPointerException.class, () -> GameFactory.createGame(null, player, new ArrayList<>()));
    }

}