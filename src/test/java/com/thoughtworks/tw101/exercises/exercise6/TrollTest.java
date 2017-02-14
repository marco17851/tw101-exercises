package com.thoughtworks.tw101.exercises.exercise6;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.ArgumentMatchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by Marco on 2/13/2017.
 */
public class TrollTest {
    @Test
    public void takeDamage() throws Exception {
        Troll troll = mock(Troll.class);
        int damage = 10;
        troll.takeDamage(damage);
        verify(troll).takeDamage(damage);
    }

    @Test
    public void reportStatus() throws Exception {
        PrintStream out = mock(PrintStream.class);
        System.setOut(out);

        Troll troll = new Troll();

        troll.reportStatus();

        verify(out).println(contains("Name:"));
        verify(out).println(contains("Hit Points:"));
    }

}