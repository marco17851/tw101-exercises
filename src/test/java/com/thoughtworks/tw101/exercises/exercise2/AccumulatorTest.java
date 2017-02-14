package com.thoughtworks.tw101.exercises.exercise2;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by Marco on 2/10/2017.
 */
public class AccumulatorTest {
    @Test
    public void totalIsZero() throws Exception {
        PrintStream out = mock(PrintStream.class);
        System.setOut(out);

        Accumulator accumulator = new Accumulator();
        accumulator.total();

        verify(out).println(0);
    }

    @Test
    public void totalIsOne() throws Exception {
        PrintStream out = mock(PrintStream.class);
        System.setOut(out);

        Accumulator accumulator = new Accumulator();
        accumulator.increment();
        accumulator.total();

        verify(out).println(1);
    }

    @Test
    public void totalIsFive() throws Exception {
        PrintStream out = mock(PrintStream.class);
        System.setOut(out);

        Accumulator accumulator = new Accumulator();

        for (int x = 0; x < 5; x++){
            accumulator.increment();
        }

        accumulator.total();

        verify(out).println(5);
    }

}