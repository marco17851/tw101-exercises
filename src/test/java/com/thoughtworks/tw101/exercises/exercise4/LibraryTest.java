package com.thoughtworks.tw101.exercises.exercise4;

import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created by Marco on 2/10/2017.
 */
public class LibraryTest {
    @Test
    public void printBooksContainingPotter() throws Exception {
        String[] books = {
                "Harry Potter and the Sorcerer's Stone",
                "An Introduction to Pottery",
                "Sorcerer Intro",
                "To the Stone-Cutters"
        };

        PrintStream out = mock(PrintStream.class);
        System.setOut(out);

        Library library = new Library(books, out);

        library.printBooksContaining("Potter");

        verify(out, times(2)).println(contains("Potter"));
    }

    @Test
    public void printBooksContainingThoughtWorks() throws Exception {
        String[] books = {
                "Harry Potter and the Sorcerer's Stone",
                "An Introduction to Pottery",
                "Sorcerer Intro",
                "To the Stone-Cutters"
        };

        PrintStream out = mock(PrintStream.class);
        System.setOut(out);

        Library library = new Library(books, out);

        library.printBooksContaining("ThoughtWorks");

        verify(out, times(0)).println(contains("ThoughtWorks"));
    }

    @Test
    public void bookTitleContainsString() throws Exception {
        String[] books = {
                "Harry Potter and the Sorcerer's Stone",
                "An Introduction to Pottery",
                "Sorcerer Intro",
                "To the Stone-Cutters"
        };

        Library library = new Library(books, System.out);
        assertEquals(true, library.bookTitleContainsString(books[0],"Potter"));
    }

    @Test
    public void bookTitleDoesNotContainString() throws Exception {
        String[] books = {
                "Harry Potter and the Sorcerer's Stone",
                "An Introduction to Pottery",
                "Sorcerer Intro",
                "To the Stone-Cutters"
        };

        Library library = new Library(books, System.out);
        assertEquals(false, library.bookTitleContainsString(books[2], "Potter"));
    }

}