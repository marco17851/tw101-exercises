package com.thoughtworks.tw101.exercises.exercise1;

import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by Marco on 2/10/2017.
 */
public class OddSumTest {

    @Test
    public void shouldPrintOddNumbersFrom1to10() throws Exception {
        PrintStream out = mock(PrintStream.class);
        System.setOut(out);

        OddSum.getOddSum(1, 10);

        for (int x = 1; x <= 10; x+=2){
            verify(out).println(x);
        }
    }

    @Test
    public void shouldPrintOddNumbersFrom1to100() throws Exception {
        PrintStream out = mock(PrintStream.class);
        System.setOut(out);

        OddSum.getOddSum(1, 100);

        for (int x = 1; x <= 100; x+=2){
            verify(out).println(x);
        }
    }

    @Test
    public void shouldPrintOddNumbersFrom20to81() throws Exception {
        PrintStream out = mock(PrintStream.class);
        System.setOut(out);

        OddSum.getOddSum(21, 81);

        for (int x = 21; x <= 81; x+=2){
            verify(out).println(x);
        }
    }

    @Test
    public void getOddSumIs1() throws Exception {
        assertEquals(1, OddSum.getOddSum(0,1));
    }

    @Test
    public void getOddSumIs2500StartAt1() throws Exception{
        assertEquals(2500, OddSum.getOddSum(1, 100));
    }

    @Test
    public void getOddSumIs2500StartAt0() throws Exception{
        assertEquals(2500, OddSum.getOddSum(0, 100));
    }

}