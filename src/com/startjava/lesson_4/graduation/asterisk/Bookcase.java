package com.startjava.lesson_4.graduation.asterisk;

import java.util.Arrays;

class Bookcase {

    private static final int MAX_CAPACITY = 10;
    private Book[] books;
    private int currentAmount;                          // Число книг в шкафу
    private int bookcaseLength;                         // Длина шкафа, зависящая динамически

    public Bookcase() {
        books = new Book[MAX_CAPACITY];
    }

    public int getCurrentAmount() {
        return currentAmount;
    }

    public int getBookcaseLength() {
        return bookcaseLength;
    }

    public int getFreeShelvesAmount() {                  // Число свободных полок в шкафу
        return books.length - currentAmount;
    }

    public boolean addBook(Book book) {
        if (currentAmount >= MAX_CAPACITY) {
            return false;
        }

        books[currentAmount++] = book;
        if (book.getLength() > bookcaseLength) {
            bookcaseLength = book.getLength();
        }

        return true;
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
                if (bookcaseLength < books[i].getLength()) {
                    bookcaseLength = findMaxLength();
                }

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

    private int findMaxLength() {
        int maxLength = books[0].getLength();
        for (int i = 1 ; i <= currentAmount; i++) {
            if (maxLength < books[i].getLength()) {
                maxLength = books[i].getLength();
            }
        }

        return maxLength;
    }
}