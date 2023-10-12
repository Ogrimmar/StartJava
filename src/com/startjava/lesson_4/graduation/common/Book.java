package com.startjava.lesson_4.graduation.common;

class Book {

    private final String author;
    private final String title;
    private final int publicationYear;
    private final int length;

    Book(String author, String title, int publicationYear) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
        length = toString().length();
    }

    private String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    private int getPublicationYear() {
        return publicationYear;
    }

    public String toString() {
        return getAuthor() + ", " + getTitle() + ", " + getPublicationYear();
    }
}