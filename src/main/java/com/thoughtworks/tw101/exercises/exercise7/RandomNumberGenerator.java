package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Random;

/**
 * Created by Marco on 2/13/2017.
 */
public class RandomNumberGenerator {
    public static int getNumber(int min, int max) {
        Random rand = new Random();
        int number = rand.nextInt(max-min + 1) + min;

        return number;
    }
}
