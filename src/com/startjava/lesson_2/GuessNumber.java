package com.startjava.lesson_2;

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
                player1.setAttempt(0);
                break;
            }

            if (isGuessed(player2, generatedNumber)) {
                player2.setAttempt(0);
                break;
            }
        } while (player1.getAttempt() <= ATTEMPTS);
    }

    private boolean isGuessed(Player player, int generatedNumber) {
        System.out.print("Игрок " + player.getName() + " загадывает число: ");
        player.setNumber(scanner.nextInt());
        player.increaseAttempt();

        if (player.getNumber() == generatedNumber) {
            System.out.println("Игрок " + player.getName() + " угадал загаданное компьютером " + 
                    "число.\n");
            return true;
        }

        if (player.getNumber() < generatedNumber) {
            System.out.println("Число " + player.getNumber() + ", загаданное игроком " +
                    player.getName() + ", меньше того, что загадал компьютер.");
        } 

        if (player.getNumber() > generatedNumber) {
            System.out.println("Число " + player.getNumber() + ", загаданное игроком " +
                    player.getName() + ", больше того, что загадал компьютер.");
        }

        return false;
    }
}