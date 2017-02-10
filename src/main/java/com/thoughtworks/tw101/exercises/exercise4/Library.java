package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;

public class Library {
    private String[] books;
    private PrintStream printStream;

    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    public void printBooksContaining(String partialBookTitle) {
        for (String book: this.books){
            if (bookTitleContainsString(book, partialBookTitle) == true){
                this.printStream.println(book);
            }
        }
    }

    /**
     * Checks if a book title contains the string passed by the user regardless if uppercase or lowercase
     * @param bookTitle - Book Title
     * @param partialBookTitle - Title passed in by user
     * @return - true or false
     */
    public boolean bookTitleContainsString(String bookTitle, String partialBookTitle){
        if (bookTitle.toLowerCase().contains(partialBookTitle.toLowerCase())){
            return true;
        }

        return false;
    }
}
