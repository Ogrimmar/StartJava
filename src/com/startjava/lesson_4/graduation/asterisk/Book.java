package com.startjava.lesson_4.graduation.asterisk;

class Book {

    private final String author;
    private final String title;
    private final String publicationYear;
    private final int length;

    public Book(String author, String title, String publicationYear) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
        length = author.length() + title.length() + publicationYear.length();
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
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
}