package org.billschofield.football;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> players = new ArrayList<String>();
        players.add("PlayerName");
        new PlayerLister(players, System.out).list();
    }

}
