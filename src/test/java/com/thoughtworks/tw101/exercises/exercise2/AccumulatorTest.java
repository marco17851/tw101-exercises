package com.thoughtworks.tw101.exercises.exercise2;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by Marco on 2/10/2017.
 */
public class AccumulatorTest {
    private PrintStream out;
    private Accumulator accumulator;

    @Before
    public void setUp() throws Exception {
        out = mock(PrintStream.class);
        System.setOut(out);
        accumulator = new Accumulator();
    }

    @Test
    public void totalShouldBeZero() throws Exception {
        accumulator.total();

        verify(out).println(0);
    }

    @Test
    public void totalShouldBeOne() throws Exception {
        accumulator.increment();
        accumulator.total();

        verify(out).println(1);
    }

    @Test
    public void totalShouldBeFive() throws Exception {
        for (int x = 0; x < 5; x++){
            accumulator.increment();
        }

        accumulator.total();

        verify(out).println(5);
    }

}