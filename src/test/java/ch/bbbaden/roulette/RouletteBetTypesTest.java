package ch.bbbaden.roulette;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class RouletteBetTypesTest {

    @Test
    public void testGetBetWhenBetExists() {
        // given
        String bet = "ROT";
        RouletteBetTypes expected = RouletteBetTypes.RED;

        // when
        RouletteBetTypes actual = RouletteBetTypes.getBet(bet);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void testGetBetWhenBetDoesNotExist() {
        // given
        String bet = "DUMMY";

        // when
        RouletteBetTypes actual = RouletteBetTypes.getBet(bet);

        // then
        assertNull(actual);
    }

    @Test
    public void testKeyRed() {
        // given
        RouletteBetTypes rouletteBet = RouletteBetTypes.RED;
        String expectedKey = "ROT";
        int expectedMultiplier = 2;

        // when
        String actualKey = rouletteBet.getKey();
        int actualMultiplier = rouletteBet.getMultiplier();

        // then
        assertEquals(expectedKey, actualKey);
        assertEquals(expectedMultiplier, actualMultiplier);
    }

    @Test
    public void testKeyBlack() {
        // given
        RouletteBetTypes rouletteBet = RouletteBetTypes.BLACK;
        String expectedKey = "SCHWARZ";
        int expectedMultiplier = 2;

        // when
        String actualKey = rouletteBet.getKey();
        int actualMultiplier = rouletteBet.getMultiplier();

        // then
        assertEquals(expectedKey, actualKey);
        assertEquals(expectedMultiplier, actualMultiplier);
    }

    @Test
    public void testKeyNumber() {
        // given
        RouletteBetTypes rouletteBet = RouletteBetTypes.TEN;
        String expectedKey = "10";
        int expectedMultiplier = 35;

        // when
        String actualKey = rouletteBet.getKey();
        int actualMultiplier = rouletteBet.getMultiplier();

        // then
        assertEquals(expectedKey, actualKey);
        assertEquals(expectedMultiplier, actualMultiplier);
    }

}