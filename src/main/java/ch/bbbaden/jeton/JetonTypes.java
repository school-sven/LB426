package ch.bbbaden.jeton;

public enum JetonTypes {

    /**
     * The jeton type for the 1 CHF jeton.
     */
    ONE(1),

    /**
     * The jeton type for the 2 CHF jeton.
     */
    TWO(2),

    /**
     * The jeton type for the 5 CHF jeton.
     */
    FIVE(5),

    /**
     * The jeton type for the 10 CHF jeton.
     */
    TEN(10),

    /**
     * The jeton type for the 20 CHF jeton.
     */
    TWENTY(20),

    /**
     * The jeton type for the 50 CHF jeton.
     */
    FIFTY(50),

    /**
     * The jeton type for the 100 CHF jeton.
     */
    HUNDRED(100);

    private final int value;

    JetonTypes(int value) {
        this.value = value;
    }

    public static JetonTypes[] getReversedValues() {
        JetonTypes[] jetonTypes = values();
        JetonTypes[] reversed = new JetonTypes[jetonTypes.length];
        for (int i = 0; i < jetonTypes.length; i++) {
            reversed[i] = jetonTypes[jetonTypes.length - i - 1];
        }
        return reversed;
    }

    public int getValue() {
        return value;
    }

}
