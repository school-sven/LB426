package ch.bbbaden.player;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ComputerPlayerTest {

    @Test
    public void testGetPlayerStakeWithImpl() {
        // given
        ComputerPlayer computerPlayer = new ComputerPlayer("Test Name");

        // when
        double actualStake = computerPlayer.getPlayerStake();

        // then
        assertTrue(actualStake >= 0 && actualStake <= 100);
    }
}