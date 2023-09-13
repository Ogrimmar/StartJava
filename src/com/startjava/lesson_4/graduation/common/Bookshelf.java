package com.startjava.lesson_4.graduation.common;

import java.util.Arrays;

public class Bookshelf {

    private static final int MAX_AMOUNT = 10;
    private Book[] books = new Book[MAX_AMOUNT];
    private int currentAmount;

    public Bookshelf() {
        this.currentAmount = 0;
    }

    public int getAmountOfBooks() {
        return currentAmount;
    }

    public int getFreeShelves() {
        return MAX_AMOUNT - currentAmount;
    }

    public boolean addBook(Book book) {
        if (currentAmount < MAX_AMOUNT) {
            books[currentAmount++] = book;

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
        for (int i = 0; i <= currentAmount; i++) {
            if (books[i].getTitle().equals(_title)) {
                System.arraycopy(books, i + 1, books, i, currentAmount - 1);
                currentAmount--;
                books[currentAmount] = null;

                return true;
            }
        }

        return false;
    }

    public Book[] getAllBooks() {
        return Arrays.copyOf(books, currentAmount);
    }

    public void freeBookshelf() {
        Arrays.fill(books, 0, currentAmount, null);

        currentAmount = 0;
    }
}