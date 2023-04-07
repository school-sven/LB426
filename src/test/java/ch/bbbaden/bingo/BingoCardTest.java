package ch.bbbaden.bingo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BingoCardTest {

    @Test
    public void testHasWonFalse() {
        // given
        BingoCard bingoCard = new BingoCard(75);

        // when
        bingoCard.isNumberOnCard(1);

        // then
        assertFalse(bingoCard.hasWon());
    }

    @Test
    public void testHasWonTrue() {
        // given
        BingoCard bingoCard = new BingoCard(75);

        // when
        for (int i = 1; i <= 75; i++) {
            bingoCard.isNumberOnCard(i);
        }

        // then
        assertTrue(bingoCard.hasWon());
    }

}