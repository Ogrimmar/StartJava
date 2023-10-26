package com.startjava.lesson_4.guess.common;

import java.util.Scanner;
import java.util.Random;

class GuessNumber {

    private static final int MIN = 1;
    private static final int MAX = 100;
    private final Scanner scanner = new Scanner(System.in, "cp866");
    private Player player1;
    private Player player2;

    GuessNumber(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
    }

    public void start() {
        System.out.println("Игра началась! У каждого игрока по " + Player.ATTEMPTS + " попыток.");

        System.out.println("Компьютер \"загадал\" число!");
        int targetNumber = MIN + new Random().nextInt(MAX);

        while (player2.getCurrentAttempt() < Player.ATTEMPTS) {
            if (isGuessed(player1, targetNumber) || isGuessed(player2, targetNumber)) {
                break;
            }
        }

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

        int playerAttempt = player.getCurrentAttempt();
        String name = player.getName();
        int playerNumber = player.getNumber();
        if (playerNumber == targetNumber) {
            System.out.println("Игрок " + name + " угадал число " + playerNumber + " с " + 
                    playerAttempt + " попытки.");
            return true;
        } else if (playerNumber < targetNumber) {
            System.out.println("Число " + playerNumber + ", загаданное игроком " + name + 
                    ", меньше того, что загадал " + "компьютер.");
        } else {
            System.out.println("Число " + playerNumber + ", загаданное игроком " + name + 
                    ", больше того, что загадал " + "компьютер.");
        }

        return false;
    }

    private boolean enterNumber(Player player) {
        System.out.print("Игрок " + player.getName() + " загадывает натуральное число " + 
                " на отрезке [1, 100]: ");
        return player.addNumber(scanner.nextInt());
    }

    private void displayNumbers(Player player) {
        System.out.print("Числа, названные игроком " + player.getName() + ": ");

        int[] enteredNumbers = player.getEnteredNumbers();
        for (int number : enteredNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}