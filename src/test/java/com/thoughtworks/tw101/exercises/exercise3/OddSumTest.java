package com.thoughtworks.tw101.exercises.exercise3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Marco on 2/10/2017.
 */
public class OddSumTest {
    private OddSum oddSum;

    @Before
    public void setUp() throws Exception {
        oddSum = new OddSum();
    }

    @Test
    public void shouldSumOddsFrom1to100() throws Exception {
        assertEquals(2500, oddSum.of(1, 100));
    }

    @Test
    public void sshouldSumOddsFrom5to36() throws Exception {
        assertEquals(320, oddSum.of(5, 36));
    }

    @Test
    public void shouldSumOddsFrom20to80() throws Exception {
        assertEquals(1500, oddSum.of(20, 80));
    }

    @Test
    public void shouldNotSumOddsFrom40to10() throws Exception {
        assertEquals(-1, oddSum.of(40, 10));
    }

}