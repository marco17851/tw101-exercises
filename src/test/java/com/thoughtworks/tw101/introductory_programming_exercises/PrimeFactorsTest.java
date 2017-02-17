package com.thoughtworks.tw101.introductory_programming_exercises;

import org.junit.Test;

import java.util.List;

import static com.intellij.util.containers.ContainerUtil.list;
import static com.thoughtworks.tw101.introductory_programming_exercises.PrimeFactors.generate;
import static org.junit.Assert.assertEquals;

/**
 * Created by Marco on 2/16/2017.
 */
public class PrimeFactorsTest {
    @Test
    public void shouldGeneratePrimeFactorsFor30() throws Exception {
        List<Integer> primeList = list(2, 3, 5);

        assertEquals(primeList, generate(30));
    }

    @Test
    public void shouldGeneratePrimeFactorsFor24() throws Exception {
        List<Integer> primeList = list(2, 2, 2, 3);

        assertEquals(primeList, generate(24));
    }

    @Test
    public void shouldGeneratePrimeFactorsFor22() throws Exception {
        List<Integer> primeList = list(2, 11);

        assertEquals(primeList, generate(22));
    }

    @Test
    public void shouldGeneratePrimeFactorsFor9() throws Exception {
        List<Integer> primeList = list(3, 3);

        assertEquals(primeList, generate(9));
    }

    @Test
    public void shouldGeneratePrimeFactorsFor5() throws Exception {
        List<Integer> primeList = list(5);

        assertEquals(primeList, generate(5));
    }

}