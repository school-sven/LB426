package ch.bbbaden.roulette;

public enum RouletteNumbers {

    ZERO("0", "GRÜN"),
    ONE("1", "ROT"),
    TWO("2", "SCHWARZ"),
    THREE("3", "ROT"),
    FOUR("4", "SCHWARZ"),
    FIVE("5", "ROT"),
    SIX("6", "SCHWARZ"),
    SEVEN("7", "ROT"),
    EIGHT("8", "SCHWARZ"),
    NINE("9", "ROT"),
    TEN("10", "SCHWARZ"),
    ELEVEN("11", "ROT"),
    TWELVE("12", "SCHWARZ"),
    THIRTEEN("13", "ROT"),
    FOURTEEN("14", "SCHWARZ"),
    FIFTEEN("15", "ROT"),
    SIXTEEN("16", "SCHWARZ"),
    SEVENTEEN("17", "ROT"),
    EIGHTEEN("18", "SCHWARZ"),
    NINETEEN("19", "ROT"),
    TWENTY("20", "SCHWARZ"),
    TWENTY_ONE("21", "ROT"),
    TWENTY_TWO("22", "SCHWARZ"),
    TWENTY_THREE("23", "ROT"),
    TWENTY_FOUR("24", "SCHWARZ"),
    TWENTY_FIVE("25", "ROT"),
    TWENTY_SIX("26", "SCHWARZ"),
    TWENTY_SEVEN("27", "ROT"),
    TWENTY_EIGHT("28", "SCHWARZ"),
    TWENTY_NINE("29", "ROT"),
    THIRTY("30", "SCHWARZ"),
    THIRTY_ONE("31", "ROT"),
    THIRTY_TWO("32", "SCHWARZ"),
    THIRTY_THREE("33", "ROT"),
    THIRTY_FOUR("34", "SCHWARZ"),
    THIRTY_FIVE("35", "ROT"),
    THIRTY_SIX("36", "SCHWARZ");

    private final String number;
    private final String color;

    RouletteNumbers(String number, String color) {
        this.number = number;
        this.color = color;
    }

    public static RouletteNumbers getByNumber(String number) {
        for (RouletteNumbers rouletteNumber : values()) {
            if (rouletteNumber.getNumber().equalsIgnoreCase(number)) {
                return rouletteNumber;
            }
        }
        return null;
    }

    public String getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }

}
