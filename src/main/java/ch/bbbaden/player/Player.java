package ch.bbbaden.player;

import ch.bbbaden.bingo.BingoCard;
import ch.bbbaden.jeton.Jeton;

public abstract class Player {

    protected final String name;

    protected Jeton balance;
    protected Jeton stake;
    protected BingoCard bingoCard;

    public Player(String name, int balance) {
        this.name = name;
        this.balance = new Jeton(balance);
        this.stake = new Jeton(0);
    }

    /**
     * Gets the stake of the player.
     *
     * @return the stake of the player
     */
    public abstract int getPlayerStake();

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance.getSum();
    }

    public int getStake() {
        return stake.getSum();
    }

    public void setStake(int stake) {
        this.stake.add(stake);
    }

    public BingoCard getBingoCard() {
        return bingoCard;
    }

    public void setBingoCard(BingoCard bingoCard) {
        this.bingoCard = bingoCard;
    }

    public void addBalance(int balance) {
        this.balance.add(balance);
    }

    public void subtractBalance(int balance) {
        this.balance.remove(balance);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(System.lineSeparator());
        sb.append("Guthaben: ").append(balance.getSum()).append(System.lineSeparator());
        sb.append("Einsatz: ").append(stake.getSum());
        return sb.toString();
    }

}
