package ch.bbbaden.player;

import java.util.Scanner;

public class PlayerGui {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static int getPlayerStake() {
        while (true) {
            System.out.println("Bitte gib deinen Einsatz ein:");
            try {
                return SCANNER.nextInt();
            } catch (RuntimeException e) {
                System.out.println("Ungültige Eingabe! Bitte gib eine Zahl ein!");
            } finally {
                SCANNER.nextLine();
            }
        }
    }

}
