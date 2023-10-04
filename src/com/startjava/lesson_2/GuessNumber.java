package com.startjava.lesson_2;

import java.util.Scanner;
import java.util.Random;

class GuessNumber {

    private final Scanner scanner = new Scanner(System.in);
    private static final int ATTEMPTS = 10;
    private static final int MIN = 1;
    private static final int MAX = 100;
    private Player player1;
    private Player player2;

    GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        System.out.println("Компьютер 'загадал' число!\n");
        int generatedNumber = MIN + new Random().nextInt(MAX);

        int firstPlayerAttempt = 0;
        int secondPlayerAttempt = 0;
        do {
            if (!isGuessed(player1, generatedNumber)) {
                firstPlayerAttempt++;
            } else {
                break;
            }

            if (!isGuessed(player2, generatedNumber)) {
                secondPlayerAttempt++;
            } else {
                break;
            }
        } while (firstPlayerAttempt <= ATTEMPTS);
    }

    private boolean isGuessed(Player player, int generatedNumber) {
        System.out.print(player.getName() + " загадывает число: ");
        player.setNumber(scanner.nextInt());

        if (player.getNumber() == generatedNumber) {
            System.out.println(player.getName() + " угадал загаданное компьютером число.");
            return true;
        } 

        if (player.getNumber() < generatedNumber) {
            System.out.println("Число " + player.getNumber() + ", загаданное " + player.getName() + 
                    ", меньше того, что загадал компьютер.");
        } else {
            System.out.println("Число " + player.getNumber() + ", загаданное " + player.getName() + 
                    ", больше того, что загадал компьютер.");
        }

        return false;
    }
}