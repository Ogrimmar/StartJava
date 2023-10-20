package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        System.out.println("3. Модифицируйте программу \"Угадай число\".");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        String name1 = scanner.nextLine();

        System.out.print("Введите имя второго игрока: ");
        String name2 = scanner.nextLine();

        System.out.println();

        String answer = "";
        do {
            new GuessNumber(new Player(name1), new Player(name2)).start();

            System.out.print("Хотите продолжить игру? [yes / no]: ");
            answer = scanner.nextLine().trim().toLowerCase();
            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.print("Введите корректный ответ: ");
                answer = scanner.nextLine().trim().toLowerCase();
            }
            System.out.println();
        } while (answer.equals("yes"));
    }
}