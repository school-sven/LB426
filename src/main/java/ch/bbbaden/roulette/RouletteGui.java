package ch.bbbaden.roulette;

import ch.bbbaden.player.ActualPlayer;

import java.util.List;
import java.util.Scanner;

public class RouletteGui implements RouletteObserver {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static RouletteBetTypes getPlayerBet() {
        do {
            System.out.println("Bitte gib eine Zahl von 0 - 36 ein oder die Farbe 'rot' oder 'schwarz'");
            String bet = SCANNER.nextLine();
            RouletteBetTypes betType = RouletteBetTypes.getBet(bet.toUpperCase());
            if (betType != null) {
                return betType;
            } else {
                System.out.println("Deine Eingabe war ungültig!");
            }
        } while (true);
    }

    public static boolean addAnotherBet() {
        do {
            System.out.println("Möchtest du noch eine Wette setzen? (j/n)");
            String answer = SCANNER.nextLine();
            if (answer.equalsIgnoreCase("j")) {
                return Boolean.TRUE;
            } else if (answer.equalsIgnoreCase("n")) {
                return Boolean.FALSE;
            } else {
                System.out.println("Bitte gebe 'j' oder 'n' ein!");
            }
        } while (true);
    }

    @Override
    public void showAllBets(List<RouletteBet> bets) {
        System.out.println("Alle Wetten:");
        for (RouletteBet bet : bets) {
            System.out.println(bet.betType().getKey() + " - " + bet.betValue());
        }
        System.out.println("--------------------");
    }

    @Override
    public void updateChosenNumber(RouletteNumbers number) {
        System.out.println("Die Roulette Zahl ist: " + number.getNumber() + ", " + number.getColor());
        System.out.println("--------------------");
    }

    @Override
    public void updatePlayerWonBet(String playerName, int wonAmount) {
        System.out.println("Spieler " + playerName + " hat " + wonAmount + " CHF gewonnen!");
        System.out.println("--------------------");
    }

    @Override
    public void updatePlayerInformation(ActualPlayer player) {
        System.out.println(player.toString());
        System.out.println("--------------------");
    }
}
