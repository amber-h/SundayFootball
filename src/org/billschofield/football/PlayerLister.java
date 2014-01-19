package org.billschofield.football;

import java.io.PrintStream;
import java.util.List;

public class PlayerLister {
    private List<String> players;
    private String playerName;
    private java.io.PrintStream printStream;

    public PlayerLister(String playerName, PrintStream printStream) {
        this.playerName = playerName;
        this.printStream = printStream;
    }

    public PlayerLister(List<String> players, PrintStream printStream) {

        this.players = players;
        this.printStream = printStream;
    }

    public void list() {
        for (String player : players) {
            printStream.println(player);
        }
        if (!playerName.equals("")){
            printStream.println(playerName);
        }
    }
}
