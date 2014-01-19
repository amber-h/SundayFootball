package org.billschofield.football;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class Menu {
    private PlayerLister playerLister;
    private PrintStream printStream;
    private BufferedReader bufferedReader;

    public Menu(PlayerLister playerLister, PrintStream printStream, BufferedReader bufferedReader) {
        this.playerLister = playerLister;
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
    }

    public void listOptions() throws IOException {
        printStream.println("1) List Players");
    }


    public void handleInput() throws IOException {
        String input = bufferedReader.readLine();
        if (input.equals("1")){
            playerLister.list();
        }
    }

    public void run() throws IOException {
        listOptions();
        handleInput();
    }
}
