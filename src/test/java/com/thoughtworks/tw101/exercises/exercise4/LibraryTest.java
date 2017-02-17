package com.thoughtworks.tw101.exercises.exercise4;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created by Marco on 2/10/2017.
 */
public class LibraryTest {

    private PrintStream out;
    private Library library;
    private String[] books = {
            "Harry Potter and the Sorcerer's Stone",
            "An Introduction to Pottery",
            "Sorcerer Intro",
            "To the Stone-Cutters"
    };

    @Before
    public void setUp() throws Exception {
        out = mock(PrintStream.class);
        System.setOut(out);

        library = new Library(books, out);
    }

    @Test
    public void shouldPrintTwoBooksContainingPotter() throws Exception {
        library.printBooksContaining("Potter");

        verify(out, times(2)).println(contains("Potter"));
    }

    @Test
    public void shouldPrintZeroBooksContainingThoughtWorks() throws Exception {
        library.printBooksContaining("ThoughtWorks");

        verify(out, times(0)).println(contains("ThoughtWorks"));
    }

    @Test
    public void bookTitleShouldContainString() throws Exception {
        assertEquals(true, library.bookTitleContainsString(books[0],"Potter"));
    }

    @Test
    public void bookTitleShouldNotContainString() throws Exception {
        assertEquals(false, library.bookTitleContainsString(books[2], "Potter"));
    }

}