package com.startjava.lesson_4.guess.common;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

class GuessNumber {

    private static final int MIN = 1;
    private static final int MAX = 100;
    private final Scanner scanner = new Scanner(System.in);
    private Player player1;
    private Player player2;

    GuessNumber(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
    }

    public void start() {
        int attemptAmount = player1.getAttemptsAmount();
        System.out.println("Игра началась! У каждого игрока по " + attemptAmount + " попыток.");

        int targetNumber = MIN + new Random().nextInt(MAX);
        System.out.println("Компьютер \"загадал\" число!");
        do {
            if (isGuessed(player1, targetNumber)) {
                break;
            }

            if (isGuessed(player2, targetNumber)) {
                break;
            }
        } while (player1.getCurrentAttempt() <= attemptAmount);

        displayNumbers(player1);
        displayNumbers(player2);
        System.out.println();

        player1.nullifyElements();
        player2.nullifyElements();
    }

    private boolean isGuessed(Player player, int targetNumber) {
        if (!enterNumber(player)) {
            return false;
        }

        String playerName = player.getName();
        int playerAttempt = player.getCurrentAttempt();
        int playerNumber = player.getNumber();
        if (playerNumber == targetNumber) {
            System.out.println("Игрок " + playerName + " угадал число " + playerNumber);
            return true;
        } 

        if (playerNumber < targetNumber) {
            System.out.println("Число " + playerNumber + ", загаданное игроком " + playerName + 
                    ", меньше того, что загадал " + "компьютер.");
        } 

        if (playerNumber > targetNumber) {
            System.out.println("Число " + playerNumber + ", загаданное игроком " + playerName + 
                    ", больше того, что загадал " + "компьютер.");
        }

        return false;
    }

    private boolean enterNumber(Player player) {
        System.out.print("Игрок " + player.getName() + " загадывает натуральное число "+ 
                " на отрезке [1, 100]: ");
        if (player.addNumber(scanner.nextInt())) {
            return true;
        }

        return false;
    }

    private void displayNumbers(Player player) {
        System.out.print("Числа, названные игроком " + player.getName() + ": ");

        int length = player.getCurrentAttempt();
        int[] enteredNumbers = player.getEnteredNumbers();
        for (int i = 0; i < length; i++) {
            if (i < length - 1) {
                System.out.print(enteredNumbers[i] + " ");
            } else {
                System.out.print(enteredNumbers[i]);
            }
        }
        System.out.println();
    }
}