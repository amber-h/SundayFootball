package org.billschofield.football;

import java.io.PrintStream;

/**
 * Created by thoughtworker on 1/19/14.
 */
public class PlayerFinder {

    private PrintStream printStream;

    public PlayerFinder(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void findPlayer() {
        printStream.println("playerName team number age");
    }
}
