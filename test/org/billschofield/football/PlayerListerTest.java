package org.billschofield.football;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class PlayerListerTest {
    private PrintStream printStream;
    private final String playerInfo = "PlayerInfo";
    private List<Player> players;
    private PlayerLister playerLister;
    private Player player;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        players = new ArrayList<Player>();
        playerLister = new PlayerLister(players, printStream);
        player = mock(Player.class);
        when(player.info()).thenReturn(playerInfo);
    }

    @Test
    public void shouldPrintANameWhenThereIsOnePlayer(){
        players.add(player);
        playerLister.list();
        verify(printStream).println(playerInfo);
    }

    @Test
    public void shouldNotPrintAnythingWhenThereAreNoPlayers(){
        playerLister.list();
        verify(printStream, times(0)).println(anyString());
    }
}
