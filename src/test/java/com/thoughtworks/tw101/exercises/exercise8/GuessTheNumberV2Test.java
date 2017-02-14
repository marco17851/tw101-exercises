package com.thoughtworks.tw101.exercises.exercise8;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created by Marco on 2/14/2017.
 */
public class GuessTheNumberV2Test {

    @Test
    public void obtainAlphanumericalGuess() throws Exception {
        GuessTheNumberV2 game = new GuessTheNumberV2(1, 100);
        String userGuess = "TW101";

        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(userGuess.getBytes()));

        Scanner scanner = new Scanner(System.in);
        System.setIn(stdin);

        String guess = game.obtainNextGuess(scanner);
        assertEquals("TW101", guess);
    }

    @Test
    public void obtainNumericalGuess() throws Exception {
        GuessTheNumberV2 game = new GuessTheNumberV2(1, 100);
        String userGuess = "13";

        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(userGuess.getBytes()));

        Scanner scanner = new Scanner(System.in);
        System.setIn(stdin);

        String guess = game.obtainNextGuess(scanner);
        assertEquals("13", guess);
    }

    @Test
    public void convertAlphaNumericalGuessToInteger() throws Exception {
        GuessTheNumberV2 game = new GuessTheNumberV2(1, 100);
        int guess = game.convertGuessToInteger("ThoughtWorks1");
        assertEquals(-1, guess);
    }

    @Test
    public void convertNumericalGuessToInteger() throws Exception {
        GuessTheNumberV2 game = new GuessTheNumberV2(1, 100);
        int guess = game.convertGuessToInteger("13");
        assertEquals(13, guess);
    }

    @Test
    public void correctGuessReport() throws Exception {
        int guess = 13;
        int correctGuess = 13;

        PrintStream out = mock(PrintStream.class);
        System.setOut(out);

        GuessTheNumberV2 game = new GuessTheNumberV2(1, 100);
        game.guessReport(guess, correctGuess);

        verify(out).println(contains("Congratulations"));
    }

    @Test
    public void guessTooHigh() throws Exception {
        int guess = 17;
        int correctGuess = 13;

        PrintStream out = mock(PrintStream.class);
        System.setOut(out);

        GuessTheNumberV2 game = new GuessTheNumberV2(1, 100);
        game.guessReport(guess, correctGuess);

        verify(out).println(contains("high"));
    }

    @Test
    public void guessTooLow() throws Exception {
        int guess = 7;
        int correctGuess = 13;

        PrintStream out = mock(PrintStream.class);
        System.setOut(out);

        GuessTheNumberV2 game = new GuessTheNumberV2(1, 100);
        game.guessReport(guess, correctGuess);

        verify(out).println(contains("low"));
    }

    @Test
    public void invalidInput() throws Exception {
        String userInput = "TW101";

        PrintStream out = mock(PrintStream.class);
        System.setOut(out);

        GuessTheNumberV2 game = new GuessTheNumberV2(1, 100);
        game.invalidInput(userInput);

        verify(out).println(contains(userInput));
    }

    @Test
    public void printGuesses() throws Exception {
        ArrayList<String> userInputs = new ArrayList<>();
        userInputs.add("TW101");
        userInputs.add("1");

        PrintStream out = mock(PrintStream.class);
        System.setOut(out);

        GuessTheNumberV2 game = new GuessTheNumberV2(1, 1);
        game.printGuesses(userInputs);
        verify(out).println(userInputs);
    }
}