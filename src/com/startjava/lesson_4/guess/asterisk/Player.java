package com.startjava.lesson_4.guess.asterisk;

import java.util.Arrays;

class Player {

    private static final int ATTEMPTS = 10;
    private String name;
    private int[] enteredNumbers;
    private int attempt;

    Player(String name) {
        this.name = name;
        enteredNumbers = new int[ATTEMPTS];
    }

    public String getName() {
        return name;
    }

    public int getNumber(int attempt) {
        return enteredNumbers[attempt];
    }

    public int[] getEnteredNumbers() {
        int[] enteredNumbersCopy = Arrays.copyOfRange(enteredNumbers, 0, attempt);
        Arrays.fill(enteredNumbers, 0, attempt, 0);
        return enteredNumbersCopy;
    }

    public int getAttempt() {
        return attempt;
    }

    public void addNumber(int number) {
        enterNumbers[attempt++] = number;
    }

    public void declareVictory() {
        attempt = 0;
        enteredNumbers = null;
    }
}