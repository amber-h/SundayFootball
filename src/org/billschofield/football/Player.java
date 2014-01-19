package org.billschofield.football;

import static com.google.common.collect.Lists.newArrayList;
import static com.sun.deploy.util.StringUtils.join;

public class Player {
    private final String name;
    private final String teamName;
    private final String number;
    private String age;

    public Player(String name, String teamName, String number, String age) {
        this.name = name;
        this.teamName = teamName;
        this.number = number;
        this.age = age;
    }

    public String info() {
        return join(newArrayList(name, teamName, number, age), " ");
    }
}
