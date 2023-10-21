package com.startjava.lesson_4.guess.asterisk;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        System.out.println("2. Модифицируйте программу \"Угадай число\" (задание с *).");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        String name1 = scanner.nextLine();

        System.out.print("Введите имя второго игрока: ");
        String name2 = scanner.nextLine();

        System.out.print("Введите имя третьего игрока: ");
        String name3 = scanner.nextLine();

        System.out.println();

        String answer = "yes";
        while (answer.equals("yes")) {
            new GuessNumber(name1, name2, name3).start();

            System.out.print("Хотите продолжить игру? [yes / no]: ");
            answer = scanner.nextLine().trim().toLowerCase();
            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.print("Введите корректный ответ: ");
                answer = scanner.nextLine().trim().toLowerCase();
            }

            if (answer.equals("no")) {
                break;
            }

            System.out.println();
        }
    }
}