package ch.bbbaden.random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RandomImplTest {

    private static final Random RANDOM = RandomImpl.getInstance();

    @Test
    void nextInt() {
        assertTrue(RANDOM.nextInt(10) >= 0 && RANDOM.nextInt(10) < 10);
    }

    @Test
    void nextDouble() {
        assertTrue(RANDOM.nextDouble(10) >= 0 && RANDOM.nextDouble(10) < 10);
    }

}