package org.billschofield.football;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.AllOf.allOf;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class PlayerTest {

    private final String playerName = "PlayerName";
    private final String teamName = "TeamName";
    private final String number = "22";
    private final String age = "24";
    private Player player;

    @Before
    public void setUp() throws Exception {
        player = new Player(playerName, teamName, number, age);
    }

    @Test
    public void playerInfoShouldIncludeAllTheElementsOfPlayer(){
        String playerInfo = player.info();
        assertThat(playerInfo, allOf(
                containsString(playerName),
                containsString(teamName),
                containsString(number),
                containsString(age)
        ));
    }

    @Test
    public void infoShouldHaveASpaceBetweenEachElement(){
        String info = player.info();
        assertThat(info, containsString(" "));
    }
}
