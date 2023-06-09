package ch.bbbaden.casino;

import ch.bbbaden.game.Game;
import ch.bbbaden.game.GameFactory;
import ch.bbbaden.game.GameTypes;
import ch.bbbaden.player.ActualPlayer;
import ch.bbbaden.player.ComputerPlayer;
import ch.bbbaden.player.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Casino {

    private final List<Player> players = new ArrayList<>();
    private ActualPlayer actualPlayer;
    private Game currentGame;

    public void run() {
        initializePlayers();
        showContextMenu();
    }

    private void showContextMenu() {
        do {
            int selectedAction = CasinoGui.showContextMenu();

            switch (selectedAction) {
                case 1, 2 -> currentGame = GameFactory.createGame(Objects.requireNonNull(GameTypes.getById(selectedAction)), actualPlayer, players);
                case 3 -> {
                    System.out.println("Auf Wiedersehen!");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Ungültige Eingabe! Bitte gib eine Zahl zwischen 1 und 3 ein!");
                    showContextMenu();
                }
            }

            if (currentGame != null) {
                currentGame.initializePlayers();
                currentGame.startGame();
                currentGame.evaluateWinner();
            }
        } while (true);
    }

    private void initializePlayers() {
        actualPlayer = new ActualPlayer(CasinoGui.getPlayerName(), CasinoGui.getPlayerBalance());
        int numberOfPlayers = CasinoGui.getNumberOfPlayers();
        for (int i = 0; i < numberOfPlayers; i++) {
            players.add(new ComputerPlayer("Spieler " + (i + 1)));
        }
    }

}
