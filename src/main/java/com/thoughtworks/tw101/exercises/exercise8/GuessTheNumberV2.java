package com.thoughtworks.tw101.exercises.exercise8;

import com.thoughtworks.tw101.exercises.exercise7.GameInputOutput;
import com.thoughtworks.tw101.exercises.exercise7.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Marco on 2/13/2017.
 */
public class GuessTheNumberV2 implements GameInputOutput {

    private int MIN = 1;
    private int MAX = 100;

    public GuessTheNumberV2(int minimum, int maximum){
        MIN = minimum;
        MAX = maximum;

    }

    /**
     * Plays the guess the number game
     */
    public void play(){
        int correctNumber = RandomNumberGenerator.getNumber(MIN, MAX);

        String userInput;
        int userGuess;
        ArrayList<String> guessList = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);

        do{
            userInput = obtainNextGuess(scanner);
            guessList.add(userInput);
            userGuess = convertGuessToInteger(userInput);

            if (userGuess == -1){
                invalidInput(userInput);
                continue;
            }

            guessReport(userGuess, correctNumber);
        }
        while(userGuess != correctNumber);

        printGuesses(guessList);
    }

    /**
     * Scans the console for the next user input
     * @param scanner - scanner for user input
     * @return string of user input
     */
    public String obtainNextGuess(Scanner scanner) {
        System.out.println("Please choose a number between " + MIN + " and " + MAX);

        return scanner.nextLine();
    }

    /**
     * Attempts to convert the user input to an integer
     * @param userInput - user input
     * @return the number as an integer; if invalid, returns -1
     */
    public int convertGuessToInteger(String userInput) {
        int parsedInt;

        try {
            parsedInt = Integer.parseInt(userInput);
        } catch(NumberFormatException e) {
            parsedInt = -1;
        }

        return parsedInt;
    }

    /**
     *
     * @param userGuess - user input
     * @param correctNumber - correct number to be guessed
     */
    public void guessReport(int userGuess, int correctNumber) {
        if (userGuess < correctNumber){
            System.out.println("Sorry player. Your guess of " + userGuess + " is too low.");
        } else if (userGuess > correctNumber){
            System.out.println("Sorry player. Your guess of " + userGuess + " is too high.");
        } else {
            System.out.println("Congratulations player! You guessed the right number: " + userGuess + ".");
        }
    }

    /**
     * Tells the user that their input is not a valid integer
     * @param userInput - user input
     */
    public void invalidInput(String userInput){
        System.out.println("Input " + userInput + " is invalid. Please remember that it has to be an integer between " + MIN + " and " + MAX);
    }

    /**
     * Prints out the user list of guesses
     * @param guessList
     */
    public void printGuesses(ArrayList<String> guessList) {
        System.out.println(guessList);
    }
}
