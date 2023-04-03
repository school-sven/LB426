package ch.bbbaden.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class GameTypesTest {

    @Test
    public void testGetByIdWithValidGameTypes() {
        assertNotNull(GameTypes.getById(1));
        assertNotNull(GameTypes.getById(2));
    }

    @Test
    public void testGetByIdWithInvalidGameTypes() {
        assertNull(GameTypes.getById(0));
        assertNull(GameTypes.getById(3));
    }

    @Test
    public void testGetId() {
        assertEquals(1, GameTypes.BINGO.getId());
        assertEquals(2, GameTypes.ROULETTE.getId());
    }

    @Test
    public void testGetName() {
        assertEquals("Bingo", GameTypes.BINGO.getName());
        assertEquals("Roulette", GameTypes.ROULETTE.getName());
    }

}