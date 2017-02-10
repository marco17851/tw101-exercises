package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    public int of(int start, int end) {

        // Make sure starting number is less than the ending number
        if (start > end){
            return -1;
        }

        int sum = 0;

        // If min is even, add one to start at an odd number
        if (start % 2 == 0) {
            start += 1;
        }

        for (int x = start; x <= end; x += 2) {
            sum += x;
        }

        return sum;
    }
}
