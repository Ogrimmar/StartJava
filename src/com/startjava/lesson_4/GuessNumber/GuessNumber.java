package com.startjava.lesson_4.GuessNumber;

import java.util.Scanner;
import java.util.Random;

class GuessNumber {

    private static final int MIN = 1;
    private static final int MAX = 100;
    private static final int ATTEMPTS = 10;
    private final Scanner scanner = new Scanner(System.in);
    private Player player1;
    private Player player2;

    GuessNumber(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
    }

    public void start() {
        System.out.println("Игра началась! У каждого игрока по " + ATTEMPTS + " попыток.");

        System.out.println("Компьютер \"загадал\" число!\n");
        int generatedNumber = MIN + new Random().nextInt(MAX);
        do {
            if (isGuessed(player1, generatedNumber)) {
                player1.setAttempt(0);
                break;
            }

            if (isGuessed(player2, generatedNumber)) {
                player2.setAttempt(0);
                break;
            }
        } while (player1.getAttempt() <= ATTEMPTS);

        displayNumbers(player1);
        displayNumbers(player2);
    }

    private boolean isGuessed(Player player, int generatedNumber) {
        System.out.print("Игрок " + player.getName() + " загадывает число: ");
        player.setNumber(scanner.nextInt());
        player.increaseAttempt();

        int playerAttempt = player.getAttempt();
        if (playerAttempt > ATTEMPTS) {
            System.out.println("У игрока " + player.getName() + " закончились попытки.");
            return false;
        } else {
            if (player.getNumber(playerAttempt - 1) == generatedNumber) {
                System.out.println("Игрок " + player.getName() + " угадал число \"" +
                        player.getNumber(playerAttempt - 1) + "\" с " + playerAttempt + 
                        " попытки.\n");
                return true;
            } 

            if (player.getNumber(playerAttempt - 1) < generatedNumber) {
                System.out.println("Число \"" + player.getNumber(playerAttempt - 1) +
                        "\", загаданное " + player.getName() + ", меньше того, что загадал " + 
                        "компьютер.");
            } 

            if (player.getNumber(playerAttempt - 1) > generatedNumber) {
                System.out.println("Число \"" + player.getNumber(playerAttempt - 1) + 
                        "\", загаданное " + player.getName() + ", больше того, что загадал " + 
                        "компьютер.");
            }
        }

        return false;
    }

    private void displayNumbers(Player player) {
        System.out.print("Числа, названные игроком " + player.getName() + ": ");

        int length = player.getAttempt();
        int[] pronouncedNumbers = player.getPronouncedNumbers();

        System.out.print("[");
        for (int i = 0; i < length; i++) {
            if (i < length - 1) {
                System.out.print(pronouncedNumbers[i] + ", ");
            } else {
                System.out.print(pronouncedNumbers[i]);
            }
        }
        System.out.print("]\n");
    }
}