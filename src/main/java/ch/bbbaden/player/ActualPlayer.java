package ch.bbbaden.player;

import ch.bbbaden.roulette.RouletteBet;

import java.util.ArrayList;
import java.util.List;

public class ActualPlayer extends Player {

    private final List<RouletteBet> bet = new ArrayList<>();

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

    public List<RouletteBet> getBets() {
        return bet;
    }

    public void addBet(RouletteBet bet) {
        this.bet.add(bet);
    }

    public void clearBets() {
        this.bet.clear();
    }

}
