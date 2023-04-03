package ch.bbbaden.player;

import ch.bbbaden.casino.CasinoGui;

public class ActualPlayer extends Player {

    public ActualPlayer(String name, double balance) {
        super(name, balance);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double getPlayerStake() {
        double selectedStake = CasinoGui.getPlayerStake();
        if (selectedStake > balance) {
            System.out.println("Du kannst nicht mehr setzen als du besitzt!");
            return getPlayerStake();
        }
        return selectedStake;
    }

}
