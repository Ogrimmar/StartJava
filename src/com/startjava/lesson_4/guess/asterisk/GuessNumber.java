package com.startjava.lesson_4.guess.asterisk;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

class GuessNumber {

    private static final int MIN = 1;
    private static final int MAX = 100;
    private static final int PLAYERS_AMMOUNT = 3;
    private static final int GAME_ROUNDS = 3;
    private final Scanner scanner = new Scanner(System.in, "cp866");
    private Player[] players;

    GuessNumber(String... name) {
        players = new Player[PLAYERS_AMMOUNT];
        for (int i = 0; i < PLAYERS_AMMOUNT; i++) {
            players[i] = new Player(name[i]);
        }
    }

    public void start() {
        System.out.println("Игра началась! У каждого игрока по " + Player.ATTEMPTS + 
                " попыток в каждом из " + GAME_ROUNDS + " рауднах.");

        for (int i = 0; i < GAME_ROUNDS; i++) {
            startRound();
            System.out.println((i + 1) + " раунд начался!");

            System.out.println("Компьютер \"загадал\" число!");
            int targetedNumber = MIN + new Random().nextInt(MAX);

            shuffle(players);
            System.out.print("Жребий игроков такой: ");
            int length = players.length;
            for (int j = 0; j < length; j++) {
                if (j < length - 1) {
                    System.out.print(players[j].getName() + ", ");
                } else {
                    System.out.print(players[j].getName());
                }
            }
            System.out.println();

            for (int j = 0, lastPlayerAttempt = 0; lastPlayerAttempt < Player.ATTEMPTS; 
                    j++, lastPlayerAttempt = players[length - 1].getCurrentAttempt()) {
                if (isGuessed(players[j % length], targetedNumber)) {
                    players[j % length].winRound();
                    break;
                }
            }

            finishRound();
            System.out.println((i + 1) + " раунд завершён!\n");
        }

        defineWinners(players);
    }

    private void startRound() {
        for (Player player : players) {
            player.nullifyElements();
        }
    }

    private void finishRound() {
        for (Player player : players) {
            displayNumbers(player);
        }
    }

    private boolean isGuessed(Player player, int targetedNumber) {
        if (!enterNumber(player)) {
            return false;
        }

        int playerAttempt = player.getCurrentAttempt();
        int playerNumber = player.getNumber();
        String sout = (playerNumber == targetedNumber) ? "Игрок %s угадал число %d c %d попытки.\n"
                : (playerNumber > targetedNumber) ? "Игрок %s загадал " + 
                "число %d с %d попытки, которое больше того, что загадал компьютер.\n" : 
                (playerNumber < targetedNumber) ? "Игрок %s загадал число %d с %d попытки, " + 
                "которое меньше того, что загадал компьютер.\n" : "";

        if (!sout.equals("")) {
            System.out.printf(sout, player.getName(), playerNumber, playerAttempt, 
                    player.getCurrentAttempt());
        }

        if (playerNumber == targetedNumber) {
            return true;
        }

        return false;
    }

    private boolean enterNumber(Player player) {
        int playerNumber = 0;
        while (playerNumber < 1 || playerNumber > 100) {
            System.out.print("Игрок " + player.getName() + 
                    " загадывает натуральное число на отрезке [1, 100]: ");
            playerNumber = scanner.nextInt();
        }

        return player.addNumber(playerNumber);
    }

    private void displayNumbers(Player player) {
        System.out.print("Числа, названные игроком " + player.getName() + ": ");

        for (int number : player.getEnteredNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private void shuffle(Player[] players) {
        int randomNumber = 0;
        int length = players.length;
        for (int i = 0; i < length - 1; i++) {
            do {
                randomNumber = new Random().nextInt(length);
            } while (randomNumber >= length - 1 - i);
            swap(players, randomNumber, length - 1 - i);
        }
    }

    private void swap(Player[] players, int num1, int num2) {
        int firstIndex = 0;
        int secondIndex = 0;
        for (int i = 0; i < players.length; i++) {
            if (i == num1) {
                firstIndex = i;
            }

            if (i == num2) {
                secondIndex = i;
            }
        }

        Player player = players[firstIndex];
        players[firstIndex] = players[secondIndex];
        players[secondIndex] = player;
    }

    private void defineWinners(Player[] players) {
        int winner = 0;
        int maxVictoriesAmount = 0;
        for (int i = 0; i < players.length; i++) {
            if (maxVictoriesAmount < players[i].getVictoryAmount()) {
                maxVictoriesAmount = players[i].getVictoryAmount();
                winner = i;
            }
        }

        System.out.println("Победителем в " + GAME_ROUNDS + " раундах является игрок " + 
                players[winner].getName());
    }
}