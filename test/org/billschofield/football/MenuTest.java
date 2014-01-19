package org.billschofield.football;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MenuTest {

    private PrintStream printStream;
    private Menu menu;
    private PlayerLister playerLister;
    private BufferedReader bufferedReader;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        playerLister = mock(PlayerLister.class);
        bufferedReader = mock(BufferedReader.class);
        menu = new Menu(playerLister, printStream, bufferedReader);
    }

    @Test
    public void shouldPrintListPlayersOption() throws IOException {
        menu.listOptions();
        verify(printStream).println("1) List Players");
    }

    @Test
    public void shouldCallListOnPlayerListerWhenUserEntersOne() throws IOException {
        when(bufferedReader.readLine()).thenReturn("1");
        menu.handleInput();
        verify(playerLister).list();
    }
}
