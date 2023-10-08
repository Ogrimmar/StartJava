package com.startjava.lesson_4.graduation.asterisk;

class Book {

    private String author;
    private String title;
    private int publicationYear;
    private int length;

    public Book(String author, String title, int publicationYear) {
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

    public int getLength() {
        return length;
    }

    public String toString() {
        return getAuthor() + ", " + getTitle() + ", " + getPublicationYear();
    }
}