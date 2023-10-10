package com.startjava.lesson_4.GuessNumberAsterisk;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

class GuessNumber {

    private static final int MIN = 1;
    private static final int MAX = 100;
    private static final int ATTEMPTS = 10;
    private final Scanner scanner = new Scanner(System.in);
    private Player[] players;

    GuessNumber(String name1, String name2, String name3) {
        players = new Player[3];
        players[0] = new Player(name1);
        players[1] = new Player(name2);
        players[2] = new Player(name3);
    }

    public void start() {
        System.out.println("Игра началась! У каждого игрока по " + ATTEMPTS + " попыток.");

        System.out.println("Компьютер \"загадал\" число!\n");
        int generatedNumber = MIN + new Random().nextInt(MAX);

        int[] playersAttempt = new int[] {0, 0, 0};
        int[] playersTurns = new int[] {1, 2, 3};
        playersTurns = defineLot(playersTurns);
        System.out.println("Жребий игроков такой: " + Arrays.toString(playersTurns) + "\n");
        do {
            if (isGuessed(players[0], generatedNumber)) {
                players[0].setAttempt(0);
                break;
            }

            if (isGuessed(players[1], generatedNumber)) {
                players[1].setAttempt(0);
                break;
            }

            if (isGuessed(players[2], generatedNumber)) {
                players[2].setAttempt(0);
                break;
            }
        } while (players[playersTurns[0]].getAttempt() <= ATTEMPTS);

        displayNumbers(players[0]);
        displayNumbers(players[1]);
        displayNumbers(players[2]);
    }

    private boolean isGuessed(Player player, int generatedNumber) {
        System.out.print("Игрок " + player.getName() + " загадывает число: ");

        int playerGeneratedNumber = 0;
        do {
            System.out.println("Введите целое число, генерируемое " + player.getName() + 
                    ", от 1 до 100 включительно.");
            playerGeneratedNumber = scanner.nextInt();
        } while (playerGeneratedNumber <= 0 || playerGeneratedNumber > 100);

        player.setNumber(playerGeneratedNumber);
        player.increaseAttempt();

        int playerAttempt = player.getAttempt();
        if (playerAttempt > ATTEMPTS) {
            System.out.println("У игрока " + player.getName() + " закончились попытки.");
            return false;
        } else {
            String s = (playerGeneratedNumber == generatedNumber) ? "Игрок %s угадал число %d с " + 
                    "%d попытки.\n" : (playerGeneratedNumber > generatedNumber) ? "Игрок %s "+ 
                    "загадал " + "число %d с попытки %d, которое больше того, что " + "загадал " + 
                    "компьютер.\n" : (playerGeneratedNumber < generatedNumber) ? "Игрок %s "+ 
                    "загадал число %d с попытки " + "%d, " + "которое меньше того, что загадал " + 
                    "компьютер.\n" : "";

            System.out.printf(s, player.getName(), player.getNumber(playerAttempt - 1), 
                    playerAttempt);

            if (playerGeneratedNumber == generatedNumber) {
                return true;
            }

            return false;
        }
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

    private int[] defineLot(int[] playersTurns) {
        int length = playersTurns.length;
        int[] copiedPlayersTurns = new int[length];
        for (int i = 0; i < length; i++) {
            copiedPlayersTurns[i] = playersTurns[i];
        }

        int randomNumber = 0;
        for (int i = 0; i < length - 1; i++) {
            do {
                randomNumber = new Random().nextInt(copiedPlayersTurns[length - 1 - i]);
            } while (randomNumber >= copiedPlayersTurns[length - 1 - i]);
            swap(playersTurns, randomNumber, playersTurns[length - 1 - i]);
        }

        return playersTurns;
    }

    private void swap(int[] playersTurns, int num1, int num2) {
        int indexOne = 0;
        int indexTwo = 0;
        for (int i = 0; i < playersTurns.length; i++) {
            if (playersTurns[i] == num1) {
                indexOne = i;
            }
        }

        for (int i = 0; i < playersTurns.length; i++) {
            if (playersTurns[i] == num2) {
                indexTwo = i;
            }
        }

        int temp = playersTurns[indexOne];
        playersTurns[indexOne] = playersTurns[indexTwo];
        playersTurns[indexTwo] = temp;
    }
}