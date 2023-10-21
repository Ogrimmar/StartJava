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

    public int getAttemptsAmount() {
        return ATTEMPTS;
    }

    public String getName() {
        return name;
    }

    public int getNumber(int attempt) {
        return enteredNumbers[attempt];
    }

    public void addNumber(int number) {
        enteredNumbers[attempt++] = number;
    }

    public int[] getEnteredNumbers() {
        return Arrays.copyOf(enteredNumbers, attempt);
    }

    public int getAttempt() {
        return attempt;
    }

    public void nullifyElements() {
        Arrays.fill(enteredNumbers, 0, attempt, 0);
    }
}