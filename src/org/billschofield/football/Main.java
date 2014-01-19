package org.billschofield.football;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Player> players = new ArrayList<Player>();
        players.add(new Player("Bill", "teamName", "11", "24"));
        players.add(new Player("Pat", "teamName", "12", "25"));
        new PlayerLister(players, System.out).list();
    }

}
