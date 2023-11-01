package com.startjava.lesson_4.graduation.common;

import java.util.Arrays;

class Bookcase {

    private static final int MAX_CAPACITY = 10;
    private Book[] books;
    private int countBooks;

    public Bookcase() {
        books = new Book[MAX_CAPACITY];
    }

    public int getCount() {
        return countBooks;
    }

    public int getFreeShelvesAmount() {
        return MAX_CAPACITY - countBooks;
    }

    public boolean add(Book book) {
        if (countBooks >= MAX_CAPACITY) {
            return false;
        }
        books[countBooks++] = book;
        return true;
    }

    public boolean find(String title) {
        for (int i = 0; i <= countBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                return true;
            }
        }

        return false;
    }

    public void delete(String title) {
        if (!hasBooks()) {
            System.out.println("Шкаф пуст - удалять нечего.");
        } else {
            boolean isBookFound = false;
            for (int i = 0; i < countBooks; i++) {
                if (books[i].getTitle().equals(title)) {
                    isBookFound = true;
                    System.arraycopy(books, i + 1, books, i, countBooks - 1);
                    books[countBooks--] = null;
                    System.out.println("Книга \"" + books[i] + "\" убрана из шкафа.");
                }
            }

            if (!isBookFound) {
                System.out.println("Книга с автором \"" + title + "\" не найдена.");
            }
        }
    }

    public Book[] getBooks() {
        return Arrays.copyOf(books, countBooks);
    }

    public void free() {
        Arrays.fill(books, 0, countBooks, null);
        countBooks = 0;
    }

    public boolean hasBooks() {
        return countBooks > 0;
    }
}