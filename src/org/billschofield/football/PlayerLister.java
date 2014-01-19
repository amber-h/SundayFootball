package org.billschofield.football;

import java.io.PrintStream;
import java.util.List;

public class PlayerLister {
    private List<Player> players;
    private PrintStream printStream;

    public PlayerLister(List<Player> players, PrintStream printStream) {
        this.players = players;
        this.printStream = printStream;
    }

    public void list() {
        for (Player player : players) {
            printStream.println(player.info());
        }
    }
}
