package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        System.out.println("3. Модифицируйте программу \"Угадай число\".");

        Scanner scanner = new Scanner(System.in, "cp866");

        System.out.print("Введите имя первого игрока: ");
        String name1 = scanner.nextLine();

        System.out.print("Введите имя второго игрока: ");
        String name2 = scanner.nextLine();

        String answer = "yes";
        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                new GuessNumber(new Player(name1), new Player(name2)).start();
                System.out.print("Хотите продолжить игру? [yes / no]: ");
            } else {
                System.out.print("Введите корректный ответ: ");
            }
            answer = scanner.nextLine().trim().toLowerCase();
            System.out.println();
        }
    }
}