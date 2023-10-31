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
        length = (author + title + publicationYear).length();
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return author + ", " + title + ", " + publicationYear + ", " + length;
    }
}