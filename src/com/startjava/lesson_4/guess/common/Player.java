package com.startjava.lesson_4.guess.common;

import java.util.Arrays;

class Player {

    private static final int ATTEMPTS = 10;
    private String name;
    private int[] enteredNumbers;
    private int currAttempt;

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
        enteredNumbers[currAttempt++] = number;
    }

    public int[] getEnteredNumbers() {
        return Arrays.copyOf(enteredNumbers, currAttempt);
    }

    public int getCurrentAttempt() {
        return currAttempt;
    }

    public void nullifyElements() {
        Arrays.fill(enteredNumbers, 0, currAttempt, 0);
    }
}