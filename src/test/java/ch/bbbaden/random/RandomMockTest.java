package ch.bbbaden.random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RandomMockTest {

    @Test
    void nextInt() {
        Random random = new RandomMock();
        assertEquals(5, random.nextInt(10));
    }

    @Test
    void nextDouble() {
        Random random = new RandomMock();
        assertEquals(0.3242345, random.nextDouble(10));
    }

}