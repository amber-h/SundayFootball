package org.billschofield.football;

import java.io.IOException;

public class FootballLeagueManager {
    private Menu menu;

    public FootballLeagueManager(Menu menu) {
        this.menu = menu;
    }

    public void run() throws IOException {
        menu.listOptions();
        menu.handleInput();
    }
}
