package ch.bbbaden.casino;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CasinoGuiTest {

    @Test
    public void testShowContextMenuValidInput() {
        // given
        String input = "1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        CasinoGui casinoGui = new CasinoGui();
        int expected = 1;

        // when
        int actual = casinoGui.showContextMenu();

        // then
        assertEquals(expected, actual);
        System.setIn(System.in);
    }

}