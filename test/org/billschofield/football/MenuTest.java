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
    private PlayerFinder playerFinder;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        playerLister = mock(PlayerLister.class);
        bufferedReader = mock(BufferedReader.class);
        playerFinder = mock(PlayerFinder.class);

        menu = new Menu(playerLister, playerFinder, printStream, bufferedReader);
    }

    @Test
    public void shouldPrintListPlayersOption() throws IOException {
        menu.listOptions();
        verify(printStream).println("1) List Players");
        verify(printStream).println("2) Find Player by Name");

    }

    @Test
    public void shouldCallListOnPlayerListerWhenUserEntersOne() throws IOException {
        when(bufferedReader.readLine()).thenReturn("1");
        menu.handleInput();
        verify(playerLister).list();
    }

    @Test
    public void shouldPromptUserToEnterNameWhenUserEntersTwo() throws IOException {
        when(bufferedReader.readLine()).thenReturn("2");
        menu.handleInput();
        verify(printStream).println("Please enter player name:");
    }

    @Test
    public void shouldCallFindPlayerOnFinderWhenUserEntersTwo() throws IOException {
        when(bufferedReader.readLine()).thenReturn("2");
        menu.handleInput();

        verify(printStream).println("Please enter player name:");
        verify(playerFinder).findPlayer();
    }

}
