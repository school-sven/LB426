package ch.bbbaden.player;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayerTest {

    private Player player;

    @BeforeEach
    void setUp() {
        player = new ActualPlayer("Test Player", 100);
    }

    @Test
    public void testAddBalance() {
        player.addBalance(50);
        assertEquals(150, player.getBalance());
    }

    @Test
    public void testSubtractBalance() {
        player.subtractBalance(50);
        assertEquals(50, player.getBalance());
    }

    @Test
    public void testToString() {
        // given
        player.setStake(10);
        String expectedOutput = player.getName() + "\n" +
                "Guthaben: 100.0\n" +
                "Einsatz: 10.0";

        // when
        String actualOutput = player.toString();

        // then
        assertEquals(expectedOutput, actualOutput);
    }

}