package ch.bbbaden.roulette;

import ch.bbbaden.player.ActualPlayer;

import java.util.List;

public interface RouletteObserver {

    void showAllBets(List<RouletteBet> bets);

    void updateChosenNumber(RouletteNumbers number);

    void updatePlayerWonBet(String playerName, int wonAmount);

    void updatePlayerInformation(ActualPlayer player);

}
