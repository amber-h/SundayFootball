package org.billschofield.football;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class PlayerListerTest {
    private PrintStream printStream;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
    }

    @Test
    public void shouldPrintANameWhenThereIsOnePlayer(){
        String playerName = "PlayerName";

        PrintStream printStream = mock(PrintStream.class);
        PlayerLister playerLister = new PlayerLister(playerName, printStream);

        playerLister.list();

        verify(printStream).println(playerName);
    }

    @Test
    public void shouldNotPrintAnythingWhenThereAreNoPlayers(){
        PlayerLister playerLister = playerLister("");
        playerLister.list();
        verify(printStream, times(0)).println(anyString());
    }

    private PlayerLister playerLister(String playerName) {
        return new PlayerLister(playerName, printStream);
    }
}
