package com.startjava.lesson_2_3.guess;

import java.util.Scanner;
import java.util.Random;

class GuessNumber {

    private static final int MIN = 1;
    private static final int MAX = 100;
    private static final int ATTEMPTS = 10;
    private final Scanner scanner = new Scanner(System.in);
    private Player player1;
    private Player player2;

    GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        System.out.println("Игра началась! У каждого игрока по " + ATTEMPTS + " попыток.");

        System.out.println("Компьютер \"загадал\" число!\n");
        int generatedNumber = MIN + new Random().nextInt(MAX);
        do {
            if (isGuessed(player1, generatedNumber)) {
                break;
            }

            if (isGuessed(player2, generatedNumber)) {
                break;
            }
        } while (player1.getCurrentAttempt() <= ATTEMPTS);
    }

    private boolean isGuessed(Player player, int generatedNumber) {
        String playerName = player.getName();
        System.out.print("Игрок " + playerName + " загадывает число: ");

        player.setNumber(scanner.nextInt());

        int playerNumber = player.getNumber();
        if (playerNumber == generatedNumber) {
            System.out.println("Игрок " + playerName + " угадал загаданное компьютером " + 
                    "число.\n");
            return true;
        }

        if (playerNumber < generatedNumber) {
            System.out.println("Число " + playerNumber + ", загаданное игроком " +
                    playerName + ", меньше того, что загадал компьютер.");
        } 

        if (playerNumber > generatedNumber) {
            System.out.println("Число " + playerNumber + ", загаданное игроком " +
                    playerName + ", больше того, что загадал компьютер.");
        }

        return false;
    }
}