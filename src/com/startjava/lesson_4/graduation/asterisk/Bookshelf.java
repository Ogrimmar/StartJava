package com.startjava.lesson_4.graduation.asterisk;

import java.util.Arrays;

public class Bookshelf {

    private static final int MAX_AMOUNT = 10;
    private static final int DEFAULT_LENGTH = 1;
    private Book[] books;
    private int currAmount;
    private int bookshelfLength;

    public Bookshelf() {
        books = new Book[MAX_AMOUNT];
        currAmount = 0;
        bookshelfLength = DEFAULT_LENGTH;
    }

    public int getAmountOfBooks() {
        return currAmount;
    }

    public int getFreeShelves() {
        return MAX_AMOUNT - currAmount;
    }

    public int getBookshelfLength() {
        return bookshelfLength;
    }

    public boolean addBook(Book book) {
        if (currAmount < MAX_AMOUNT) {
            books[currAmount++] = book;

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
        for (int i = 0; i <= currAmount; i++) {
            if (books[i].getTitle().equals(_title)) {
                int length = books[i].getLength();
                System.arraycopy(books, i + 1, books, i, currAmount - 1);
                currAmount--;
                books[currAmount] = null;

                if (bookshelfLength == length) {
                    bookshelfLength = findMaxLength(bookshelfLength);
                }

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

    private int findMaxLength(int bookshelfLength) {
        int maxLength = books[0].getLength();

        for (int i = 1 ; i <= currAmount; i++) {
            if (maxLength < books[i].getLength()) {
                maxLength = books[i].getLength();
            }
        }

        return maxLength;
    }
}