package org.billschofield.football;

import org.junit.Test;

import java.io.IOException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class FootballLeagueManagerTest {

    Menu menuMock = mock(Menu.class);
    FootballLeagueManager footballLeagueManager = new FootballLeagueManager(menuMock);

    @Test
    public void shouldListOptionsWhenStarting() throws IOException {
        footballLeagueManager.run();
        verify(menuMock).listOptions();
    }

    @Test
    public void shouldHandleInputOnMenuWhenStarting() throws IOException {
        footballLeagueManager.run();
        verify(menuMock).handleInput();
    }
}
