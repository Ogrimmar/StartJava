package com.startjava.lesson_4.guess.asterisk;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

class GuessNumber {

    private static final int MIN = 1;
    private static final int MAX = 100;
    private final Scanner scanner = new Scanner(System.in, "cp866");
    private Player[] players;

    GuessNumber(String name1, String name2, String name3) {
        players = new Player[3];
        players[0] = new Player(name1);
        players[1] = new Player(name2);
        players[2] = new Player(name3);
    }

    public void start() {
        System.out.println("Игра началась! У каждого игрока по " + Player.ATTEMPTS + " попыток.");

        System.out.println("Компьютер \"загадал\" число!");
        int generatedNumber = MIN + new Random().nextInt(MAX);

        int[] playersTurns = {1, 2, 3};
        playersTurns = defineLot(playersTurns);
        System.out.println("Жребий игроков такой: " + Arrays.toString(playersTurns));

        Player player1 = players[playersTurns[0] - 1];
        Player player2 = players[playersTurns[1] - 1];
        Player player3 = players[playersTurns[2] - 1];
        while (player3.getCurrentAttempt() < Player.ATTEMPTS) {
            if (isGuessed(player1, generatedNumber) || isGuessed(player2, generatedNumber)
                    || isGuessed(player3, generatedNumber)) {
                break;
            }
        }

        displayNumbers(player1);
        displayNumbers(player2);
        displayNumbers(player3);
        System.out.println();

        player1.nullifyElements();
        player2.nullifyElements();
        player3.nullifyElements();
    }

    private boolean isGuessed(Player player, int generatedNumber) {
        if (!enterNumber(player)) {
            return false;
        }

        int playerAttempt = player.getCurrentAttempt();
        int playerNumber = player.getNumber();
        String sout = (playerNumber == generatedNumber) ? "Игрок %s угадал число %d c %d попытки.\n"
                : (playerNumber > generatedNumber) ? "Игрок %s загадал " + 
                "число %d с %d попытки, которое больше того, что загадал компьютер.\n" : 
                (playerNumber < generatedNumber) ? "Игрок %s загадал число %d с %d попытки, " + 
                "которое меньше того, что загадал компьютер.\n" : "";

        if (!sout.equals("")) {
            System.out.printf(sout, player.getName(), playerNumber, playerAttempt, 
                    player.getCurrentAttempt());
        }

        if (playerNumber == generatedNumber) {
            return true;
        }

        return false;
    }

    private boolean enterNumber(Player player) {
        int playerNumber = 0;
        do {
            System.out.print("Игрок " + player.getName() + 
                    " загадывает натуральное число на отрезке [1, 100]: ");
            playerNumber = scanner.nextInt();
        } while (playerNumber < 1 || playerNumber > 100);

        return player.addNumber(playerNumber);
    }

    private void displayNumbers(Player player) {
        System.out.print("Числа, названные игроком " + player.getName() + ": ");

        for (int number : player.getEnteredNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println();
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