package com.startjava.lesson_4.GuessNumber;

import java.util.Scanner;

class GuessNumberTest {

    public static void main(String[] args) {
        System.out.println("2. Модифицируйте программу \"Угадай число\".");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        String name1 = scanner.nextLine();

        System.out.print("Введите имя второго игрока: ");
        String name2 = scanner.nextLine();

        System.out.println();

        String answer = "";
        do {
            GuessNumber game = new GuessNumber(name1, name2);
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