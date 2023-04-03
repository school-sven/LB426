package ch.bbbaden.bingo;

import ch.bbbaden.player.Player;

import java.util.List;

public class BingoGui {

    public static void printChosenNumber(int number) {
        System.out.println("Die gezogene Nummer ist: " + number);
    }

    public static void printPlayerHasNumber(String playerName) {
        System.out.println(playerName + " hat die Zahl auf seiner Karte!");
    }

    public static void printBingoCard(Player player) {
        System.out.println(player.getName() + ":");
        System.out.println(player.getBingoCard());
        printSeparator();
    }

    public static void printPlayerInformation(List<Player> players) {
        for (Player player : players) {
            System.out.println(player.toString());
            printSeparator();
        }
    }

    public static void printSeparator() {
        System.out.println("--------------------");
    }
}
