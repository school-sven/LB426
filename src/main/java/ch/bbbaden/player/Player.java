package ch.bbbaden.player;

import ch.bbbaden.bingo.BingoCard;

public abstract class Player {

    /**
     * The name of the Player
     */
    protected final String name;
    /**
     * The balance of the Player
     */
    protected double balance;
    /**
     * The stake of the Player
     */
    protected double stake;
    /**
     * The BingoCard of the Player for the Bingo game
     */
    protected BingoCard bingoCard;


    public Player(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    /**
     * Gets the stake of the player.
     *
     * @return the stake of the player
     */
    public abstract double getPlayerStake();

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public double getStake() {
        return stake;
    }

    public void setStake(double stake) {
        this.stake = stake;
    }

    public BingoCard getBingoCard() {
        return bingoCard;
    }

    public void setBingoCard(BingoCard bingoCard) {
        this.bingoCard = bingoCard;
    }

    public void addBalance(double balance) {
        this.balance += balance;
    }

    public void subtractBalance(double balance) {
        this.balance -= balance;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(System.lineSeparator());
        sb.append("Guthaben: ").append(balance).append(System.lineSeparator());
        sb.append("Einsatz: ").append(stake);
        return sb.toString();
    }
}
