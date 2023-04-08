package ch.bbbaden.roulette;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class RouletteNumbersTest {

    @Test
    public void testGetByNumberWhenNumberExists() {
        // given
        String number = "7";
        RouletteNumbers expected = RouletteNumbers.SEVEN;

        // when
        RouletteNumbers actual = RouletteNumbers.getByNumber(number);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void testGetByNumberWhenNumberDoesNotExist() {
        // given
        String number = "-1";

        // when
        RouletteNumbers actual = RouletteNumbers.getByNumber(number);

        // then
        assertNull(actual);
    }

    @Test
    public void testGetNumberRed() {
        // given
        RouletteNumbers rouletteNumber = RouletteNumbers.ONE;
        String expectedNumber = "1";
        String expectedColor = "ROT";

        // when
        String actualNumber = rouletteNumber.getNumber();
        String actualColor = rouletteNumber.getColor();

        // then
        assertEquals(expectedNumber, actualNumber);
        assertEquals(expectedColor, actualColor);
    }

    @Test
    public void testGetColorBlack() {
        // given
        RouletteNumbers rouletteNumber = RouletteNumbers.TWO;
        String expectedNumber = "2";
        String expectedColor = "SCHWARZ";

        // when
        String actualNumber = rouletteNumber.getNumber();
        String actualColor = rouletteNumber.getColor();

        // then
        assertEquals(expectedNumber, actualNumber);
        assertEquals(expectedColor, actualColor);
    }

}