package org.billschofield.football;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PlayerTest {

    @Test
    public void shouldReturnName(){
        String expectedName = "PlayerName";
        Player player = new Player(expectedName);

        String actualName = player.getName();

        assertThat(actualName, is(expectedName));
    }
}
