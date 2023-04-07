package ch.bbbaden.casino;

import java.util.Scanner;

public class CasinoGui {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static int showContextMenu() {
        while (true) {
            System.out.println("Willkommen zum Casino! Welches Spiel möchtest du spielen?");
            System.out.println("1 - Bingo");
            System.out.println("2 - Roulette");
            System.out.println("3 - Beenden");

            try {
                return SCANNER.nextInt();
            } catch (RuntimeException e) {
                System.out.println("Ungültige Eingabe! Bitte gib eine Zahl zwischen 1 und 3 ein!");
            } finally {
                SCANNER.nextLine();
            }
        }
    }

    public static String getPlayerName() {
        System.out.println("Bitte gib deinen Namen ein:");
        return SCANNER.nextLine();
    }


    public static int getNumberOfPlayers() {
        while (true) {
            System.out.println("Bitte gib die Anzahl der Spieler ein:");
            try {
                int numberOfPlayers = SCANNER.nextInt();
                if (numberOfPlayers > 0) {
                    return numberOfPlayers;
                } else {
                    System.out.println("Ungültige Eingabe! Bitte gib eine Zahl grösser als 0 ein!");
                }
            } catch (RuntimeException e) {
                System.out.println("Ungültige Eingabe! Bitte gib eine Zahl ein!");
            } finally {
                SCANNER.nextLine();
            }
        }
    }

    public static double getPlayerBalance() {
        while (true) {
            System.out.println("Bitte gib dein Startguthaben ein:");
            try {
                return SCANNER.nextDouble();
            } catch (RuntimeException e) {
                System.out.println("Ungültige Eingabe! Bitte gib eine Zahl ein!");
            } finally {
                SCANNER.nextLine();
            }
        }
    }

    public Scanner getScanner() {
        return SCANNER;
    }
}
