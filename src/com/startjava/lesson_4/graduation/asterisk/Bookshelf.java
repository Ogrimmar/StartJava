package com.startjava.lesson_4.graduation.asterisk;

import java.util.Arrays;

public class Bookshelf {

    private static final int MAX_AMOUNT = 10;
    private static final int DEFAULT_LENGTH = 1;
    private Book[] books = new Book[MAX_AMOUNT];
    private int currentAmount;
    private int bookshelfLength;

    public Bookshelf() {
        currentAmount = 0;
        bookshelfLength = DEFAULT_LENGTH;
    }

    public int getAmountOfBooks() {
        return currentAmount;
    }

    public int getFreeShelves() {
        return MAX_AMOUNT - currentAmount;
    }

    public int getBookshelfLength() {
        return bookshelfLength;
    }

    public boolean addBook(Book book) {
        if (currentAmount < MAX_AMOUNT) {
            books[currentAmount++] = book;
            
            if (book.getLength() > bookshelfLength) {
                bookshelfLength = book.getLength();
            }

            return true;
        } else {
            return false;
        } 
    }

    public Book findBook(String _title) {
        for (Book book : books) {
            if (book.getTitle().equals(_title)) {
                System.out.println("Книга найдена.");

                return book;
            }
        }

        return null;
    }

    public boolean discardBook(String _title) {
        for (int i = 0; i <= currentAmount; i++) {
            if (books[i].getTitle().equals(_title)) {
                int length = books[i].getLength();

                System.arraycopy(books, i + 1, books, i, currentAmount - 1);

                currentAmount--;

                books[currentAmount] = null;

                if (bookshelfLength == length) {
                    bookshelfLength = findMaxLength(bookshelfLength);
                }

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

    private int findMaxLength(int bookshelfLength) {
        int maxLength = books[0].getLength();

        for (int i = 1 ; i <= currentAmount; i++) {
            if (maxLength < books[i].getLength()) {
                maxLength = books[i].getLength();
            }
        }

        return maxLength;
    }
}