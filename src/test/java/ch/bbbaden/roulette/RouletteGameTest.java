package ch.bbbaden.roulette;

import ch.bbbaden.player.ActualPlayer;
import org.junit.jupiter.api.Test;

class RouletteGameTest {

    @Test
    void testStartGame() {
        // given
        RouletteGame rouletteGame = new RouletteGame(new ActualPlayer("Test", 1000));

        // when
        rouletteGame.startGame();
    }

    @Test
    void testEvaluateWinner() {
        // given
        RouletteGame rouletteGame = new RouletteGame(new ActualPlayer("Test", 1000));

        // when
        rouletteGame.evaluateWinner();
    }

    @Test
    void testAddObserver() {
        // given
        RouletteGame rouletteGame = new RouletteGame(new ActualPlayer("Test", 1000));

        // when
        rouletteGame.addObserver(new RouletteGui());
    }

}