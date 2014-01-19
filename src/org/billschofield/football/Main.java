package org.billschofield.football;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        PrintStream printStream = System.out;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Player> players = new ArrayList<Player>();
        PlayerLister playerLister = new PlayerLister(players, printStream);
        players.add(new Player("Bill", "teamName", "11", "24"));
        players.add(new Player("Pat", "teamName", "12", "25"));

        Menu menu = new Menu(playerLister, printStream, bufferedReader);


        new FootballLeagueManager(menu).run();
    }
}
