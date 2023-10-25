package com.startjava.lesson_2_3.guess;

class Player {

    private String name;
    private int number;
    private int currentAttempt;

    Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void addNumber(int number) {
        this.number = number;
        currentAttempt++;
    }

    public int getCurrentAttempt() {
        return currentAttempt;
    }
}