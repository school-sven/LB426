package ch.bbbaden.player;

public class ActualPlayer extends Player {

    public ActualPlayer(String name, double balance) {
        super(name, balance);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double getPlayerStake() {
        double selectedStake = PlayerGui.getPlayerStake();
        if (selectedStake > balance) {
            System.out.println("Du kannst nicht mehr setzen als du besitzt!");
            return getPlayerStake();
        }
        return selectedStake;
    }

}
