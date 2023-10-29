package com.startjava.lesson_4.guess.asterisk;

import java.util.Arrays;

class Player {

    public static final int ATTEMPTS = 10;
    private String name;
    private int[] enteredNumbers;
    private int currentAttempt;
    private int score;

    Player(String name) {
        this.name = name;
        enteredNumbers = new int[ATTEMPTS];
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return enteredNumbers[currentAttempt - 1];
    }

    public boolean addNumber(int number) {
        if (number > 0 && number <= 100) {
            enteredNumbers[currentAttempt++] = number;
            if (currentAttempt >= ATTEMPTS) {
                System.out.println("У игрока " + name + " закончились попытки.");
                return false;
            }

            return true;
        }

        return false;
    }

    public int[] getEnteredNumbers() {
        return Arrays.copyOf(enteredNumbers, currentAttempt);
    }

    public int getCurrentAttempt() {
        return currentAttempt;
    }

    public int getScore() {
        return score;
    }

    public void increaseScore() {
        score++;
    }

    public void nullifyElements() {
        Arrays.fill(enteredNumbers, 0, currentAttempt, 0);
        currentAttempt = 0;
    }

    @Override
    public String toString() {
        return name;
    }
}