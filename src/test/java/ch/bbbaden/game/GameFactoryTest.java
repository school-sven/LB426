package ch.bbbaden.game;

import ch.bbbaden.player.ActualPlayer;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class GameFactoryTest {

    private static final int MAX_NUMBER = 75;

    @Test
    public void testCreateGameWithBingo() {
        // given
        var gameType = GameTypes.BINGO;
        var player = new ActualPlayer("Test Name", 100);

        // when
        Game game = GameFactory.createGame(gameType, List.of(player));

        // then
        assertNotNull(game);
    }

    @Test
    public void testCreateGameWithRoulette() {
        // given
        var gameType = GameTypes.ROULETTE;
        var player = new ActualPlayer("Test Name", 100);

        // when
        Game game = GameFactory.createGame(gameType, List.of(player));

        // then
        assertNotNull(game);
    }

}