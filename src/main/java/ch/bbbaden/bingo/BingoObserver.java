package ch.bbbaden.bingo;

import ch.bbbaden.player.Player;

import java.util.List;

public interface BingoObserver {

    void updateChosenNumber(int number);

    void updatePlayerHasNumber(String playerName);

    void updateBingoCard(Player player);

    void updatePlayerInformation(List<Player> players);

}
