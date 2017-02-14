package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

/**
 * Created by Marco on 2/13/2017.
 */
public interface GameInputOutput {
    public String obtainNextGuess(Scanner scanner);

    public void guessReport(int userGuess, int correctNumber);

    public void invalidInput(String userInput);
}
