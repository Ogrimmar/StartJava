package com.startjava.lesson_4.guess.asterisk;

import java.util.Scanner;

public class GuessNumberTest {

    private static final Scanner scanner = new Scanner(System.in, "cp866");

    public static void main(String[] args) {
        System.out.println("2. Модифицируйте программу \"Угадай число\" (задание с *).");

        String name1 = enterName(1);
        String name2 = enterName(2);
        String name3 = enterName(3);
        String answer = "yes";
        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                new GuessNumber(name1, name2, name3).start();
                System.out.print("Хотите продолжить игру? [yes / no]: ");
            } else {
                System.out.print("Введите корректный ответ [yes / no]: ");
            }
            answer = scanner.nextLine().trim().toLowerCase();
            System.out.println();
        }
    }

    private static String enterName(int order) {
        System.out.print("Введите имя " + order + " игрока: ");
        return scanner.nextLine();
    }
}