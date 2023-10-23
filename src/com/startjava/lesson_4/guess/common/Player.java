package com.startjava.lesson_4.guess.common;

import java.util.Arrays;

class Player {

    private static final int ATTEMPTS = 10;
    private String name;
    private int[] enteredNumbers;
    private int currentAttempt;

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

    public int getNumber() {
        return enteredNumbers[currentAttempt - 1];
    }

    public boolean addNumber(int number) {
        if (currentAttempt > ATTEMPTS) {
            System.out.println("У игрока " + name + " закончились попытки.");
            return false;
        }
        enteredNumbers[currentAttempt++] = number;
        return true;
    }

    public int[] getEnteredNumbers() {
        return Arrays.copyOf(enteredNumbers, currentAttempt);
    }

    public int getCurrentAttempt() {
        return currentAttempt;
    }

    public void nullifyElements() {
        Arrays.fill(enteredNumbers, 0, currentAttempt, 0);
    }
}