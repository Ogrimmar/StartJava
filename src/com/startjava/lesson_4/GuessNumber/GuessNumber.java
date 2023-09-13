package com.startjava.lesson_4.GuessNumber;

import java.util.Scanner;

public class GuessNumber {

    private static final Scanner scanner = new Scanner(System.in);
    private static final int ATTEMPTS = 30;
    private Player p1 = null;
    private Player p2 = null;

    GuessNumber(String firstPlayerName, String secondPlayerName) {
        p1 = new Player(firstPlayerName);
        p2 = new Player(secondPlayerName);
    }

    public String startGame(int generatedNumber) {
        System.out.println("Игра началась! У каждого игрока по 10 попыток.");

        int firstPlayerAttempts = 0;
        int secondPlayerAttempts = 0;
        boolean flag = false;

        do {
            if (!flag) {
                flag = doTurn(p1, generatedNumber);
                firstPlayerAttempts++;
            }

            if (!flag) {
                flag = doTurn(p2, generatedNumber);
                secondPlayerAttempts++;
            }
        } while ((firstPlayerAttempts <= ATTEMPTS || secondPlayerAttempts <= ATTEMPTS) && !flag);
        
        System.out.println();

        displayNumbers(p1);
        displayNumbers(p2);
        
        System.out.println();
        
        System.out.print("Хотите продолжить игру? [yes / no]: ");
        String answer = scanner.nextLine();
        
        while (!answer.equals("yes") && !answer.equals("no")) {
            answer = scanner.nextLine();
        } 

        return answer;
    }

    private boolean doTurn(Player player, int generatedNumber) {
        System.out.print(player.getName() + " загадывает число: ");
        player.setNumber(scanner.nextInt());
        
        int playerAttempt = player.getCurrSize();

        if (player.getNumber(playerAttempt - 1) == generatedNumber) {
              System.out.println("Игрок " + player.getName() + " угадал число " + player.getNumber(playerAttempt - 1) + 
                      " с " + playerAttempt + " попытки.");

            return true;
        } else if (player.getNumber(playerAttempt - 1) < generatedNumber) {
            System.out.println("Число " + player.getNumber(playerAttempt - 1) + ", загаданное " + player.getName() + 
                ", меньше того, что загадал компьютер.");
        } else {
              System.out.println("Число " + player.getNumber(playerAttempt - 1) + ", загаданное " + player.getName() + 
                  ", больше того, что загадал компьютер.");
        }

        if (playerAttempt == ATTEMPTS) {
            System.out.println("У " + player.getName() + " закончились попытки.");
        }

        return false;
    }

    private void displayNumbers(Player player) {
        System.out.print("Числа, названные игроком " + player.getName() + ": ");
        
        int length = player.getCurrSize();
        int[] calledNumbers = player.getCalledNumbers();
        
        System.out.print("[");
        for (int i = 0; i < length; i++) {
            if (i < length - 1) {
                System.out.print(calledNumbers[i] + ", ");
            } else {
                System.out.print(calledNumbers[i]);
            }
        }
        System.out.print("]");
        
        System.out.println();
    }
}