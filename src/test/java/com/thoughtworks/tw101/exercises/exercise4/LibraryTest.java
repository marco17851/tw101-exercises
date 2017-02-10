package com.thoughtworks.tw101.exercises.exercise4;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Marco on 2/10/2017.
 */
public class LibraryTest {
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