package com.thoughtworks.tw101.exercises.exercise6;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.ArgumentMatchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by Marco on 2/14/2017.
 */
public class OrcTest {
    @Test
    public void takeDamage() throws Exception {
        Orc orc = mock(Orc.class);
        int damage = 10;
        orc.takeDamage(damage);
        verify(orc).takeDamage(damage);
    }

    @Test
    public void reportStatus() throws Exception {
        PrintStream out = mock(PrintStream.class);
        System.setOut(out);

        Orc orc = new Orc();

        orc.reportStatus();

        verify(out).println(contains("Name:"));
        verify(out).println(contains("Hit Points:"));
    }

}