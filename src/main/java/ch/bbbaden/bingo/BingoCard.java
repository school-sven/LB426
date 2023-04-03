package ch.bbbaden.bingo;

import ch.bbbaden.random.Random;
import ch.bbbaden.random.RandomImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BingoCard {

    private static final int CARD_SIZE = 25;
    private static final int NUMBERS_PER_ROW = 5;
    private static final Random RANDOM = RandomImpl.getInstance();

    private final int maxNumber;
    private final int[] numbers;

    public BingoCard(int maxNumber) {
        this.maxNumber = maxNumber;
        this.numbers = new int[CARD_SIZE];
        initializeRemainingNumbers();
    }

    /**
     * Checks if the given number is on the card and replaces it with 0 if it is.
     *
     * @param number The number to check for
     * @return True if the number was on the card, false otherwise
     */
    public boolean isNumberOnCard(int number) {
        for (int i = 0; i < CARD_SIZE; i++) {
            if (numbers[i] == number) {
                numbers[i] = 0;
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    /**
     * Checks if the card has won (e.g. "Super Bingo").
     *
     * @return True if the card has won, false otherwise
     */
    public boolean hasWon() {
        return !Arrays.stream(numbers)
                .filter(number -> number != 0)
                .findFirst()
                .isPresent();
    }

    /**
     * Returns a string representation of the card.
     *
     * @return A string representation of the card
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < CARD_SIZE; i++) {
            if (i % NUMBERS_PER_ROW == 0 && i != 0) {
                sb.append(System.lineSeparator());
            }
            if (numbers[i] == 0) {
                sb.append("[X]");
            } else {
                sb.append(String.format("[%2d]", numbers[i]));
            }
        }
        return sb.toString();
    }

    private void initializeRemainingNumbers() {
        List<Integer> remainingNumbers = new ArrayList<>();
        for (int i = 1; i <= maxNumber; i++) {
            remainingNumbers.add(i);
        }
        for (int i = 0; i < CARD_SIZE; i++) {
            int randomIndex = (int) (RANDOM.nextDouble(1) * remainingNumbers.size());
            numbers[i] = remainingNumbers.remove(randomIndex);
        }
        Arrays.sort(numbers);
    }

}
