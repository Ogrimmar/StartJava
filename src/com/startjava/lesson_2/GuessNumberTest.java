package com.startjava.lesson_2;

import java.util.Scanner;

class GuessNumberTest {

    public static void main(String[] args) {
        System.out.println("3. Модифицируйте программу \"Угадай число\".");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        String name1 = scanner.nextLine();

        System.out.print("Введите имя второго игрока: ");
        String name2 = scanner.nextLine();

        Player player1 = new Player(name1);
        Player player2 = new Player(name2);

        System.out.println();

        String answer = "";
        do {
            GuessNumber game = new GuessNumber(player1, player2);
            game.start();

            System.out.print("Хотите продолжить игру? [yes / no]: ");
            answer = scanner.nextLine().trim().toLowerCase();
            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.print("Введите корректный ответ: ");
                answer = scanner.nextLine().trim().toLowerCase();
            }
        } while (answer.equals("yes"));
    }
}