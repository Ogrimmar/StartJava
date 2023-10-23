package com.startjava.lesson_4.graduation.common;

import java.util.Arrays;

class Bookcase {

    private static final int MAX_CAPACITY = 10;
    private Book[] books;
    private int currentAmount;

    public Bookcase() {
        books = new Book[MAX_CAPACITY];
    }

    public int getCurrentAmount() {
        return currentAmount;
    }

    public int getFreeShelvesAmount() {
        return MAX_CAPACITY - currentAmount;
    }

    public boolean addBook(Book book) {
        if (currentAmount < MAX_CAPACITY) {
            books[currentAmount++] = book;
            return true;
        } else {
            return false;
        }
    }

    public boolean findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return true;
            }
        }

        return false;
    }

    public boolean discardBook(String title) {
        for (int i = 0; i <= currentAmount; i++) {
            if (books[i].getTitle().equals(title)) {
                System.arraycopy(books, i + 1, books, i, currentAmount - 1);
                books[currentAmount--] = null;
                return true;
            }
        }

        return false;
    }

    public Book[] getBooks() {
        return Arrays.copyOf(books, currentAmount);
    }

    public void freeBookcase() {
        Arrays.fill(books, 0, currentAmount, null);
        currentAmount = 0;
    }
}