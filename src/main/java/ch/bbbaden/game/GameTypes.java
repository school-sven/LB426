package ch.bbbaden.game;

public enum GameTypes {

    /**
     * The game type for the bingo game.
     */
    BINGO("Bingo"),

    /**
     * The game type for the roulette game.
     */
    ROULETTE("Roulette");

    private final int id = ordinal() + 1;
    private final String name;

    GameTypes(String name) {
        this.name = name;
    }

    /**
     * Returns the game type for the given id.
     *
     * @param id the id
     * @return the game type
     */
    public static GameTypes getById(int id) {
        for (GameTypes gameType : values()) {
            if (gameType.getId() == id) {
                return gameType;
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
