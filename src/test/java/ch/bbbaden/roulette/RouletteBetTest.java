package ch.bbbaden.roulette;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RouletteBetTest {

    @Test
    public void testRouletteBet() {
        // given
        RouletteBetTypes betType = RouletteBetTypes.RED;
        int betValue = 10;

        // when
        RouletteBet bet = new RouletteBet(betType, betValue);

        // then
        assertEquals(betType, bet.betType());
        assertEquals(betValue, bet.betValue());
    }

}