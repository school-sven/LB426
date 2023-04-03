package ch.bbbaden.game;

public interface Game {

    /**
     * Initializes the players for a specific game.
     */
    void initializePlayers();

    /**
     * Starts the game.
     */
    void startGame();

    /**
     * Evaluates the winner of the game.
     * Adds the stake of the other players to the winner's balance.
     */
    void evaluateWinner();

}
