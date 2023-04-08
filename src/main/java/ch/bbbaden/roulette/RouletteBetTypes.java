package ch.bbbaden.roulette;

public enum RouletteBetTypes {

    RED("ROT", 2),
    BLACK("SCHWARZ", 2),

    ZERO("0", 35),
    ONE("1", 35),
    TWO("2", 35),
    THREE("3", 35),
    FOUR("4", 35),
    FIVE("5", 35),
    SIX("6", 35),
    SEVEN("7", 35),
    EIGHT("8", 35),
    NINE("9", 35),
    TEN("10", 35),
    ELEVEN("11", 35),
    TWELVE("12", 35),
    THIRTEEN("13", 35),
    FOURTEEN("14", 35),
    FIFTEEN("15", 35),
    SIXTEEN("16", 35),
    SEVENTEEN("17", 35),
    EIGHTEEN("18", 35),
    NINETEEN("19", 35),
    TWENTY("20", 35),
    TWENTY_ONE("21", 35),
    TWENTY_TWO("22", 35),
    TWENTY_THREE("23", 35),
    TWENTY_FOUR("24", 35),
    TWENTY_FIVE("25", 35),
    TWENTY_SIX("26", 35),
    TWENTY_SEVEN("27", 35),
    TWENTY_EIGHT("28", 35),
    TWENTY_NINE("29", 35),
    THIRTY("30", 35),
    THIRTY_ONE("31", 35),
    THIRTY_TWO("32", 35),
    THIRTY_THREE("33", 35),
    THIRTY_FOUR("34", 35),
    THIRTY_FIVE("35", 35),
    THIRTY_SIX("36", 35);

    private final String key;
    private final int multiplier;

    RouletteBetTypes(String key, int multiplier) {
        this.key = key;
        this.multiplier = multiplier;
    }

    /**
     * Returns the bet with the given key.
     *
     * @param key the key of the bet
     * @return the bet with the given key
     */
    public static RouletteBetTypes getBet(String key) {
        for (RouletteBetTypes bet : values()) {
            if (bet.getKey().equals(key)) {
                return bet;
            }
        }
        return null;
    }

    public String getKey() {
        return key;
    }

    public int getMultiplier() {
        return multiplier;
    }

}
