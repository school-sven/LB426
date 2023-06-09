package ch.bbbaden.player;

import java.util.Random;

public class ComputerPlayer extends Player {

    private static final int COMPUTER_PLAYER_BALANCE = 100;
    private static final Random RANDOM = new Random();

    public ComputerPlayer(String name) {
        super(name, COMPUTER_PLAYER_BALANCE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getPlayerStake() {
        return Math.round(RANDOM.nextInt(balance.getSum()));
    }

}
