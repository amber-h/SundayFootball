package org.billschofield.football;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by thoughtworker on 1/19/14.
 */
public class PlayerFinderTest {
    BufferedReader bufferedReader;
    PlayerFinder playerFinder;
    PrintStream printStream;

    @Before
    public void setUp(){
    bufferedReader = mock(BufferedReader.class);
    printStream = mock(PrintStream.class);

    playerFinder = new PlayerFinder(printStream);
    }
    @Test
    public void shouldListPlayerWhenUserEntersValidPlayerName() throws IOException {
        when(bufferedReader.readLine()).thenReturn("playerName");
        playerFinder.findPlayer();
        verify(printStream).println("playerName team number age");
    }
}
