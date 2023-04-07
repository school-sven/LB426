package ch.bbbaden.jeton;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class JetonTest {

    private Jeton jeton;

    @BeforeEach
    public void setUp() {
        jeton = new Jeton(0);
    }

    @Test
    public void testAdd() {
        // when
        jeton.add(50);
        jeton.add(20);
        jeton.add(10);

        // then
        assertEquals(80, jeton.getSum());
    }

    @Test
    public void testRemove() {
        // when
        jeton.add(100000050);
        jeton.add(50);
        jeton.add(20);
        jeton.add(10);
        jeton.remove(100);

        // then
        assertEquals(100000030, jeton.getSum());
    }

    @Test
    public void testClear() {
        // when
        jeton.add(50);
        jeton.add(20);
        jeton.add(10);
        jeton.clear();
        List<JetonTypes> jetons = jeton.getJetons();

        // then
        assertTrue(jetons.isEmpty());
        assertEquals(0, jeton.getSum());
    }

}