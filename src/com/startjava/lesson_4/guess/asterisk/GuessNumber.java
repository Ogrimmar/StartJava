package com.startjava.lesson_4.guess.asterisk;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

class GuessNumber {

    public static final int MIN = 1;
    public static final int MAX = 100;
    private static final int PLAYERS_AMMOUNT = 3;
    private static final int ROUNDS = 3;
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
                " попыток в каждом из " + ROUNDS + " раундов.");

        for (int i = 0; i < ROUNDS; i++) {
            System.out.println((i + 1) + " раунд начался!");
            clear();
            shufflePlayers();

            System.out.println("Компьютер \"загадал\" число!");
            int targetNumber = MIN + new Random().nextInt(MAX);

            System.out.println("Жребий игроков такой: " + Arrays.toString(players));

            boolean flag = false;
            for (int j = 0; j < Player.ATTEMPTS && !flag; j++) {
                for (Player player : players) {
                    flag = isGuessed(player, targetNumber);
                    if (flag) {
                        break;
                    }
                }
            }

            displayNumbers();
            System.out.println((i + 1) + " раунд завершён!\n");
        }

        defineWinner();
    }

    private void clear() {
        for (Player player : players) {
            player.nullifyElements();
        }
    }

    private boolean isGuessed(Player player, int targetNumber) {
        if (!enterNumber(player)) {
            return false;
        }

        int playerAttempt = player.getCurrentAttempt();
        String name = player.getName();
        String output = "";
        int playerNumber = player.getNumber();
        if (playerNumber == targetNumber) {
            player.increaseScore();
            output = "Игрок %s угадал число %d c %d попытки.\n";
            System.out.printf(output, name, playerNumber, playerAttempt);
            return true;
        }

        output = "Игрок %s загадал число %d с %d попытки, которое ";
        output +=  (playerNumber > targetNumber) ? "больше " : "меньше ";
        output += "того, что загадал компьютер.\n";
        System.out.printf(output, name, playerNumber, playerAttempt);

        return false;
    }

    private boolean enterNumber(Player player) {
        System.out.print("Игрок " + player.getName() + " произносит число: ");
        return player.addNumber(scanner.nextInt());
    }

    private void displayNumbers() {
        for (Player player : players) {
            System.out.print("Числа, названные игроком " + player.getName() + ": ");
            for (int number : player.getEnteredNumbers()) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    private void shufflePlayers() {
        int length = players.length;
        for (int i = 0; i < length; i++) {
            int randomNumber = new Random().nextInt(length - i);
            if (randomNumber == i) {
                continue;
            }

            Player player = players[i];
            players[i] = players[randomNumber];
            players[randomNumber] = player;
        }
    }

    private void defineWinner() {
        int winner = 0;
        int maxScore = 0;
        for (int i = 0; i < players.length; i++) {
            if (maxScore < players[i].getScore()) {
                maxScore = players[i].getScore();
                winner = i;
            }
        }

        System.out.println("Победителем в " + ROUNDS + " раундах является игрок " + 
                players[winner].getName() + ", одержавший " + players[winner].getScore() 
                + " побед.");
    }
}