package ch.bbbaden.bingo;

import ch.bbbaden.player.Player;

import java.util.List;

public class BingoGui implements BingoObserver {

    public void updateChosenNumber(int number) {
        System.out.println("Die gezogene Nummer ist: " + number);
        System.out.println("--------------------");
    }

    public void updatePlayerHasNumber(String playerName) {
        System.out.println(playerName + " hat die Zahl auf seiner Karte!");
    }

    public void updateBingoCard(Player player) {
        System.out.println(player.getName() + ":");
        System.out.println(player.getBingoCard());
        System.out.println("--------------------");
    }

    public void updatePlayerInformation(List<Player> players) {
        for (Player player : players) {
            System.out.println(player.toString());
            System.out.println("--------------------");
        }
    }

}
