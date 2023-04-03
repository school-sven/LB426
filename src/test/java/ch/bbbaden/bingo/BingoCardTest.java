package ch.bbbaden.bingo;

import ch.bbbaden.random.Random;
import ch.bbbaden.random.RandomMock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BingoCardTest {

    /* private static final Random RANDOM = new RandomMock();

    @Test
    public void testBingoCardWithNoNumber() {
        // given
        BingoCard bingoCard = new BingoCard(75);

        // when
        boolean isOnCard = bingoCard.isNumberOnCard(1);

        // then
        assertFalse(isOnCard);

        assertFalse(bingoCard.hasWon());
    }

    @Test
    public void testBingoCardWithNumber() {
        // given
        BingoCard bingoCard = new BingoCard(75);

        // when
        boolean isOnCard = bingoCard.isNumberOnCard(17);

        // then
        assertTrue(isOnCard);

        assertFalse(bingoCard.hasWon());
    }

    @Test
    public void testBingoCardWithNumberTwice() {
        // given
        BingoCard bingoCard = new BingoCard(75);

        // when
        boolean isOnCard = bingoCard.isNumberOnCard(17);
        boolean isOnCardAgain = bingoCard.isNumberOnCard(17);

        // then
        assertTrue(isOnCard);
        assertFalse(isOnCardAgain);

        assertFalse(bingoCard.hasWon());
    }

    @Test
    public void testBingoCardWithAllNumbers() {
        // given
        BingoCard bingoCard = new BingoCard(75);

        // when
        boolean isOnCard1 = bingoCard.isNumberOnCard(17);
        boolean isOnCard2 = bingoCard.isNumberOnCard(18);
        boolean isOnCard3 = bingoCard.isNumberOnCard(19);
        boolean isOnCard4 = bingoCard.isNumberOnCard(20);
        boolean isOnCard5 = bingoCard.isNumberOnCard(21);
        boolean isOnCard6 = bingoCard.isNumberOnCard(22);
        boolean isOnCard7 = bingoCard.isNumberOnCard(23);
        boolean isOnCard8 = bingoCard.isNumberOnCard(24);
        boolean isOnCard9 = bingoCard.isNumberOnCard(25);
        boolean isOnCard10 = bingoCard.isNumberOnCard(26);
        boolean isOnCard11 = bingoCard.isNumberOnCard(27);
        boolean isOnCard12 = bingoCard.isNumberOnCard(28);
        boolean isOnCard13 = bingoCard.isNumberOnCard(29);
        boolean isOnCard14 = bingoCard.isNumberOnCard(30);
        boolean isOnCard15 = bingoCard.isNumberOnCard(31);
        boolean isOnCard16 = bingoCard.isNumberOnCard(32);
        boolean isOnCard17 = bingoCard.isNumberOnCard(33);
        boolean isOnCard18 = bingoCard.isNumberOnCard(34);
        boolean isOnCard19 = bingoCard.isNumberOnCard(35);
        boolean isOnCard20 = bingoCard.isNumberOnCard(36);
        boolean isOnCard21 = bingoCard.isNumberOnCard(37);
        boolean isOnCard22 = bingoCard.isNumberOnCard(38);
        boolean isOnCard23 = bingoCard.isNumberOnCard(39);
        boolean isOnCard24 = bingoCard.isNumberOnCard(40);
        boolean isOnCard25 = bingoCard.isNumberOnCard(41);

        // then
        Assertions.assertAll(
                () -> assertTrue(isOnCard1),
                () -> assertTrue(isOnCard2),
                () -> assertTrue(isOnCard3),
                () -> assertTrue(isOnCard4),
                () -> assertTrue(isOnCard5),
                () -> assertTrue(isOnCard6),
                () -> assertTrue(isOnCard7),
                () -> assertTrue(isOnCard8),
                () -> assertTrue(isOnCard9),
                () -> assertTrue(isOnCard10),
                () -> assertTrue(isOnCard11),
                () -> assertTrue(isOnCard12),
                () -> assertTrue(isOnCard13),
                () -> assertTrue(isOnCard14),
                () -> assertTrue(isOnCard15),
                () -> assertTrue(isOnCard16),
                () -> assertTrue(isOnCard17),
                () -> assertTrue(isOnCard18),
                () -> assertTrue(isOnCard19),
                () -> assertTrue(isOnCard20),
                () -> assertTrue(isOnCard21),
                () -> assertTrue(isOnCard22),
                () -> assertTrue(isOnCard23),
                () -> assertTrue(isOnCard24),
                () -> assertTrue(isOnCard25)
        );

        assertTrue(bingoCard.hasWon());
    } */

}
