package com.startjava.lesson_4.graduation.common;

class Book {

    public static final int LENGTH = 30;
    private final String author;
    private final String title;
    private final String publicationYear;

    Book(String author, String title, String publicationYear) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return author + ", " + title + ", " + publicationYear;
    }
}