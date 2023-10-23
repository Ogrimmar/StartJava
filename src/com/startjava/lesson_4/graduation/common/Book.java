package com.startjava.lesson_4.graduation.common;

class Book {

    private final String author;
    private final String title;
    private final String publicationYear;
    private final int length;

    Book(String author, String title, String publicationYear) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
        length = author.length() + title.length() + publicationYear.length();
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return getAuthor() + ", " + getTitle() + ", " + getPublicationYear() + ", " + getLength();
    }

    private String getAuthor() {
        return author;
    }

    private String getPublicationYear() {
        return publicationYear;
    }

    private int getLength() {
        return length;
    }
}