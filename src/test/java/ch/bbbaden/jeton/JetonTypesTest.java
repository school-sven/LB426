package ch.bbbaden.jeton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JetonTypesTest {

    @Test
    public void testGetValue() {
        assertEquals(1, JetonTypes.ONE.getValue());
        assertEquals(2, JetonTypes.TWO.getValue());
        assertEquals(5, JetonTypes.FIVE.getValue());
        assertEquals(10, JetonTypes.TEN.getValue());
        assertEquals(20, JetonTypes.TWENTY.getValue());
        assertEquals(50, JetonTypes.FIFTY.getValue());
        assertEquals(100, JetonTypes.HUNDRED.getValue());
    }

    @Test
    public void testGetReversedValues() {
        JetonTypes[] reversed = JetonTypes.getReversedValues();
        assertEquals(JetonTypes.HUNDRED, reversed[0]);
        assertEquals(JetonTypes.FIFTY, reversed[1]);
        assertEquals(JetonTypes.TWENTY, reversed[2]);
        assertEquals(JetonTypes.TEN, reversed[3]);
        assertEquals(JetonTypes.FIVE, reversed[4]);
        assertEquals(JetonTypes.TWO, reversed[5]);
        assertEquals(JetonTypes.ONE, reversed[6]);
    }

}