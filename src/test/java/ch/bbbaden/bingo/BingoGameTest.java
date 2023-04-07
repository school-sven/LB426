package ch.bbbaden.bingo;

import ch.bbbaden.player.ComputerPlayer;
import ch.bbbaden.player.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BingoGameTest {

    private List<Player> players;

    @BeforeEach
    void setUp() {
        players = new ArrayList<>();
        players.add(new ComputerPlayer("Player 1"));
        players.add(new ComputerPlayer("Player 2"));
        players.add(new ComputerPlayer("Player 3"));
    }

    @Test
    void initializePlayers() {
        // given
        BingoGame game = new BingoGame(players);

        // when
        game.initializePlayers();

        // then
        for (Player player : players) {
            assertNotNull(player.getBingoCard());
            assertEquals(100 - player.getStake(), player.getBalance());
        }
    }

    @Test
    void startGame() {
        // given
        BingoGame game = new BingoGame(players);

        // when
        game.initializePlayers();
        game.startGame();

        // then
        assertTrue(players.stream().anyMatch(player -> player.getBingoCard().hasWon()));
    }

    @Test
    void evaluateWinner() {
        // given
        BingoGame game = new BingoGame(players);

        // when
        game.initializePlayers();
        List<Integer> stakes = players.stream().map(Player::getStake).toList();
        double totalStake = players.stream().mapToDouble(Player::getStake).sum();
        game.startGame();
        Player winner = players.stream().filter(player -> player.getBingoCard().hasWon()).findFirst().orElse(null);
        game.evaluateWinner();

        // then
        assertNotNull(winner);
        for (int i = 0; i < players.size(); i++) {
            Player player = players.get(i);
            int stake = stakes.get(i);
            if (player.equals(winner)) {
                assertEquals(player.getBalance(), 100 - stake + totalStake);
            } else {
                assertEquals(player.getBalance(), 100 - stake);
            }
        }
    }

}