package com.startjava.lesson_4.graduation.common;

import java.util.Arrays;

public class Bookshelf {

    private static final int MAX_AMOUNT = 10;
    private Book[] books = new Book[MAX_AMOUNT];
    private int currAmount;

    public Bookshelf() {
        this.currAmount = 0;
    }

    public int getAmountOfBooks() {
        return curAmount;
    }

    public int getFreeShelves() {
        return MAX_AMOUNT - currAmount;
    }

    public boolean addBook(Book book) {
        if (currAmount < MAX_AMOUNT) {
            books[currAmount++] = book;

            return true;
        } else {
            return false;
        }
    }

    public Book findBook(String _title) {
        for (Book book : books) {
            if (book.getTitle().equals(_title)) {
                return book;
            }
        }

        return null;
    }

    public boolean discardBook(String _title) {
        for (int i = 0; i <= currAmount; i++) {
            if (books[i].getTitle().equals(_title)) {
                System.arraycopy(books, i + 1, books, i, currAmount - 1);
                currAmount--;
                books[currAmount] = null;

                return true;
            }
        }

        return false;
    }

    public Book[] getAllBooks() {
        return Arrays.copyOf(books, currAmount);
    }

    public void freeBookshelf() {
        Arrays.fill(books, 0, currAmount, null);

        currAmount = 0;
    }
}