package com.startjava.lesson_4.GuessNumberAsterisk;

import java.util.Arrays;

public class Player {

    private static final int ATTEMPTS = 10;
    private String name;
    private int[] numbers;
    private int currSize;

    Player(String name) {
        this.name = name;
        numbers = new int[ATTEMPTS];
        currSize = 0;
    }

    public String getName() {
        return name;
    }

    public int getNumber(int attempt) {
        return numbers[attempt];
    }

    public void setNumber(int number) {
        increaseCurrSize();
        numbers[currSize - 1] = number;
    }

    public int[] getCalledNumbers() {
        int[] numbersCopy = Arrays.copyOfRange(numbers, 0, currSize);
        Arrays.fill(numbers, 0, currSize, 0);
        return numbersCopy;
    }

    public int getCurrSize() {
        return currSize;
    }

    private void increaseCurrSize() {
        currSize++;
    }
}