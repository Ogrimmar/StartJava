package com.startjava.lesson_4.guess.common;

import java.util.Arrays;

class Player {

    private static final int ATTEMPTS = 10;
    private String name;
    private int[] pronouncedNumbers;
    private int attempt;

    Player(String name) {
        this.name = name;
        pronouncedNumbers = new int[ATTEMPTS];
    }

    public String getName() {
        return name;
    }

    public int getNumber(int attempt) {
        return pronouncedNumbers[attempt];
    }

    public void setNumber(int number) {
        pronouncedNumbers[attempt - 1] = number;
    }

    public int[] getPronouncedNumbers() {
        int[] pronouncedNumbersCopy = Arrays.copyOfRange(pronouncedNumbers, 0, attempt);
        Arrays.fill(pronouncedNumbers, 0, attempt, 0);
        return pronouncedNumbersCopy;
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