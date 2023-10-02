package com.startjava.lesson_4.GuessNumberAsterisk;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private static final Scanner scanner = new Scanner(System.in);
    private static final int ATTEMPTS = 10;
    private Player[] players;

    GuessNumber(String firstPlayerName, String secondPlayerName, String thirdPlayerName) {
        players = new Player[3];
        players[0] = new Player(firstPlayerName);
        players[1] = new Player(secondPlayerName);
        players[2] = new Player(thirdPlayerName);
    }

    public String startGame(int generatedNumber) {
        System.out.println("Игра началась! У каждого игрока по " + ATTEMPTS + " попыток.");

        int[] playersAttempt = new int[] {0, 0, 0};
        boolean flag = false;
        int[] playersTurns = new int[] {1, 2, 3};
        int[] seqTurns = defineLot(playersTurns);

        System.out.println("Жребий игроков такой: " + Arrays.toString(seqTurns) + "\n");

        do {
            if (!flag) {
                flag = doTurn(players[seqTurns[0] - 1], generatedNumber);
                playersAttempt[0]++;
            }

            if (!flag) {
                flag = doTurn(players[seqTurns[1] - 1], generatedNumber);
                playersAttempt[1]++;
            }

            if (!flag) {
                flag = doTurn(players[seqTurns[2] - 1], generatedNumber);
                playersAttempt[2]++;
            }
        } while (playersAttempt[0] <= ATTEMPTS && !flag);

        System.out.println();

        displayNumbers(players[0]);
        displayNumbers(players[1]);
        displayNumbers(players[2]);

        System.out.print("\nХотите продолжить игру? [yes / no]: ");
        String answer = scanner.nextLine();

        while (!answer.equals("yes") && !answer.equals("no")) {
            answer = scanner.nextLine();
        }

        return answer;
    }

    private boolean doTurn(Player player, int generatedNumber) {
        System.out.print(player.getName() + " загадывает число: ");

        int playerGeneratedNumber = 0;
        do {
            playerGeneratedNumber = scanner.nextInt();
        } while (playerGeneratedNumber <= 0 || playerGeneratedNumber > 100);

        player.setNumber(playerGeneratedNumber);
        int playerAttempt = player.getCurrSize();

        if (playerAttempt > ATTEMPTS) {
            System.out.println("У " + player.getName() + " закончились попытки.");

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

        int length = player.getCurrSize();
        int[] pronouncedNumbers = player.getCalledNumbers();

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