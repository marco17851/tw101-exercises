package com.thoughtworks.tw101.exercises.exercise2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Marco on 2/10/2017.
 */
public class AccumulatorTest {
    @Test
    public void totalIsZero() throws Exception {
        Accumulator accumulator = new Accumulator();
        assertEquals(0, accumulator.total());
    }

    @Test
    public void totalIsOne() throws Exception {
        Accumulator accumulator = new Accumulator();
        accumulator.increment();
        assertEquals(1, accumulator.total());
    }

    @Test
    public void totalIsFive() throws Exception {
        Accumulator accumulator = new Accumulator();

        for (int x = 0; x < 5; x++){
            accumulator.increment();
        }

        assertEquals(5, accumulator.total());
    }

}