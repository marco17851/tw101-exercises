package com.thoughtworks.tw101.exercises.exercise3;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Marco on 2/10/2017.
 */
public class OddSumTest {
    @Test
    public void of1to100() throws Exception {
        OddSum oddSum = new OddSum();

        assertEquals(2500, oddSum.of(1, 100));
    }

    @Test
    public void of5to36() throws Exception {
        OddSum oddSum = new OddSum();

        assertEquals(320, oddSum.of(5, 36));
    }

    @Test
    public void of20to80() throws Exception {
        OddSum oddSum = new OddSum();

        assertEquals(1500, oddSum.of(20, 80));
    }

    @Test
    public void of40to10() throws Exception {
        OddSum oddSum = new OddSum();

        assertEquals(-1, oddSum.of(40, 10));
    }

}