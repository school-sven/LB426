package ch.bbbaden.bingo;

import ch.bbbaden.player.ComputerPlayer;
import ch.bbbaden.player.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class BingoGuiTest {

    private BingoGui bingoGui;

    @BeforeEach
    public void setUp() {
        bingoGui = new BingoGui();
    }

    @Test
    public void testUpdateChosenNumber() {
        // given
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        int number = 42;
        String expectedOutput = "Die gezogene Nummer ist: " + number + "\n" + "--------------------\n";

        // when
        bingoGui.updateChosenNumber(42);

        // then
        assertNotNull(outContent.toString());
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testUpdatePlayerHasNumber() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String playerName = "Alice";
        String expectedOutput = playerName + " hat die Zahl auf seiner Karte!\n";

        // when
        bingoGui.updatePlayerHasNumber(playerName);

        // then
        assertNotNull(outContent.toString());
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testUpdateBingoCard() {
        // given
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Player player = new ComputerPlayer("Computer-player 1");
        String expectedOutput = player.getName() + ":\n" + player.getBingoCard() + "\n" + "--------------------\n";

        // when
        bingoGui.updateBingoCard(player);

        // then
        assertNotNull(outContent.toString());
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testUpdatePlayerInformation() {
        // given
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Player player1 = new ComputerPlayer("Computer-player 1");
        Player player2 = new ComputerPlayer("Computer-player 2");
        List<Player> players = new ArrayList<>(Arrays.asList(player1, player2));
        String expectedOutput = player1.toString() + "\n" + "--------------------\n" + player2.toString() + "\n" + "--------------------\n";

        // when
        bingoGui.updatePlayerInformation(players);

        // then
        assertNotNull(outContent.toString());
        assertEquals(expectedOutput, outContent.toString());
    }

}