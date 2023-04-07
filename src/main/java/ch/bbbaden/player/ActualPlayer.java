package ch.bbbaden.player;

public class ActualPlayer extends Player {

    public ActualPlayer(String name, int balance) {
        super(name, balance);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getPlayerStake() {
        int selectedStake = PlayerGui.getPlayerStake();
        if (selectedStake > balance.getSum()) {
            System.out.println("Du kannst nicht mehr setzen als du besitzt!");
            return getPlayerStake();
        }
        return selectedStake;
    }

}
