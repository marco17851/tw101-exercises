package com.thoughtworks.tw101.exercises.exercise1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Marco on 2/10/2017.
 */
public class MainTest {
    @Test
    public void getOddSumIs1() throws Exception {
        Main exercise = new Main();
        assertEquals(1, exercise.getOddSum(0,1));
    }

    @Test
    public void getOddSumIs2500() throws Exception{
        Main exercise = new Main();
        assertEquals(2500, exercise.getOddSum(1, 100));
    }

    @Test
    public void getOddSumIs2500StartAt0() throws Exception{
        Main exercise = new Main();
        assertEquals(2500, exercise.getOddSum(0, 100));
    }

}