package com.startjava.lesson_2;

import java.util.Scanner;

class GuessNumber {

    private static final Scanner scanner = new Scanner(System.in);
    private static final int ATTEMPTS = 30;
    private Player p1 = null;
    private Player p2 = null;

    GuessNumber(Player _p1, Player _p2) {
        p1 = _p1;
        p2 = _p2;
    }

    public String startGame(int generatedNumber) {
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

        System.out.print("Хотите продолжить игру? [yes / no]: ");
        String answer = scanner.nextLine().trim();

        while (!answer.equals("yes") && !answer.equals("no")) {
            System.out.print("Введите корректный ответ: ");

            answer = scanner.nextLine().trim();
        }

        return answer;
    }

    private boolean doTurn(Player player, int generatedNumber) {
        System.out.print(player.getName() + " загадывает число: ");

        player.setNumber(scanner.nextInt());

        if (player.getNumber() == generatedNumber) {
              System.out.println(player.getName() + " угадал загаданное компьютером число.");

              return true;
        } else if (player.getNumber() < generatedNumber) {
            System.out.println("Число " + player.getNumber() + ", загаданное " + player.getName() + 
                ", меньше того, что загадал компьютер.");
        } else {
            System.out.println("Число " + player.getNumber() + ", загаданное " + player.getName() + 
                ", больше того, что загадал компьютер.");
        }

        return false;
    }
}