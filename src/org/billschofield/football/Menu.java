package org.billschofield.football;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public class Menu {
    private PlayerLister playerLister;
    private PrintStream printStream;
    private BufferedReader bufferedReader;
    private List<String> options;
    private static final String OPTION_1 = "1) List Players";
    private static final String OPTION_2 = "2) Find Player by Name";

    private PlayerFinder playerFinder;


    public Menu(PlayerLister playerLister, PlayerFinder playerFinder, PrintStream printStream, BufferedReader bufferedReader) {
        this.playerLister = playerLister;
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
        this.playerFinder = playerFinder;
        options = newArrayList(OPTION_1, OPTION_2);

    }

    public void listOptions() throws IOException {
        for (String option : options) {
            printStream.println(option);
        }
    }

    public void handleInput() throws IOException {
        String input = bufferedReader.readLine();
        if (input.equals("1")){
            playerLister.list();
        }
        if (input.equals("2")){
            printStream.println("Please enter player name:");
            playerFinder.findPlayer();
        }

    }
}
