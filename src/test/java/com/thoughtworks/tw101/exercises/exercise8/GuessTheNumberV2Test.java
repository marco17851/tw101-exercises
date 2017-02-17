package com.thoughtworks.tw101.exercises.exercise8;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created by Marco on 2/14/2017.
 */
public class GuessTheNumberV2Test {
    private GuessTheNumberV2 game;
    private PrintStream out;

    @Before
    public void setUp() throws Exception{
        game = new GuessTheNumberV2(1, 100);
        out = mock(PrintStream.class);
        System.setOut(out);
    }

    @Test
    public void shouldObtainAlphanumericalGuess() throws Exception {
        String userGuess = "TW101";
        System.setIn(new ByteArrayInputStream(userGuess.getBytes()));

        Scanner scanner = new Scanner(System.in);

        String guess = game.obtainNextGuess(scanner);
        assertEquals("TW101", guess);
    }

    @Test
    public void shouldObtainNumericalGuess() throws Exception {
        String userGuess = "13";
        System.setIn(new ByteArrayInputStream(userGuess.getBytes()));

        Scanner scanner = new Scanner(System.in);

        String guess = game.obtainNextGuess(scanner);
        assertEquals("13", guess);
    }

    @Test
    public void shouldConvertAlphaNumericalGuessToInteger() throws Exception {
        int guess = game.convertGuessToInteger("ThoughtWorks1");
        assertEquals(-1, guess);
    }

    @Test
    public void shouldConvertNumericalGuessToInteger() throws Exception {
        int guess = game.convertGuessToInteger("13");
        assertEquals(13, guess);
    }

    @Test
    public void shouldPrintCorrectGuessReport() throws Exception {
        int guess = 13;
        int correctGuess = 13;

        game.guessReport(guess, correctGuess);

        verify(out).println(contains("Congratulations"));
    }

    @Test
    public void shouldPrintGuessIsTooHigh() throws Exception {
        int guess = 17;
        int correctGuess = 13;

        game.guessReport(guess, correctGuess);

        verify(out).println(contains("high"));
    }

    @Test
    public void shouldPrintGuessIsTooLow() throws Exception {
        int guess = 7;
        int correctGuess = 13;

        game.guessReport(guess, correctGuess);

        verify(out).println(contains("low"));
    }

    @Test
    public void shouldPrintInvalidInputWasGiven() throws Exception {
        String userInput = "TW101";

        game.invalidInput(userInput);

        verify(out).println(contains(userInput));
    }

    @Test
    public void shouldPrintAllUserGuesses() throws Exception {
        ArrayList<String> userInputs = new ArrayList<>();
        userInputs.add("TW101");
        userInputs.add("1");

        game.printGuesses(userInputs);
        verify(out).println(userInputs);
    }
}