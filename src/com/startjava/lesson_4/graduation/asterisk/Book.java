package com.startjava.lesson_4.graduation.asterisk;

public class Book {

    private final String author;
    private final String title;
    private final int publicationYear;
    private final int length;

    public Book(String _author, String _title, int _publicationYear) {
        author = _author;
        title = _title;
        publicationYear = _publicationYear;
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

    public int getLength() {
        return length;
    }

    public String toString() {
        return getAuthor() + ", " + getTitle() + ", " + getPublicationYear();
    }
}