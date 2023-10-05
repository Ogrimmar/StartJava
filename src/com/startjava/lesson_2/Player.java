package com.startjava.lesson_2;

public class Player {

    private String name;
    private int number;
    private int attempt;

    Player(String name) {
        this.name = name;
        attempt = 0;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public void increaseAttempt() {
        attempt++;
    }
}