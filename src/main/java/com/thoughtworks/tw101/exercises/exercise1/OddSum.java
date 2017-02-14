package com.thoughtworks.tw101.exercises.exercise1;

/**
 * Created by Marco on 2/14/2017.
 */
public class OddSum {
    /**
     * Prints out each odd number in between the minimum and maximum
     * numbers and returns the sum of them.
     * @param min - minimum number
     * @param max - maximum number
     * @return sum of all odd numbers in between
     */
    public static int getOddSum(int min, int max){
        int sum = 0;

        // If min is even, add one to start at an odd number
        if (min % 2 == 0){
            min += 1;
        }

        for (int x = min; x <= max; x+=2){
            System.out.println(x);
            sum += x;
        }

        return sum;
    }
}
