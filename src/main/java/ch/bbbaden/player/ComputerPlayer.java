package ch.bbbaden.player;

import ch.bbbaden.random.Random;
import ch.bbbaden.random.RandomImpl;

public class ComputerPlayer extends Player {

    private static final int COMPUTER_PLAYER_BALANCE = 100;
    private static final Random random = RandomImpl.getInstance();

    /**
     * The Random object to generate random numbers
     */

    public ComputerPlayer(String name) {
        super(name, COMPUTER_PLAYER_BALANCE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double getPlayerStake() {
        return Math.round(random.nextDouble(balance));
    }

}
