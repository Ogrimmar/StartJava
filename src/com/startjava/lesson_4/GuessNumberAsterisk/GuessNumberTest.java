package com.startjava.lesson_4.GuessNumberAsterisk;

import java.util.Scanner;

public class GuessNumberTest {

    private static final Scanner scanner = new Scanner(System.in);
    private static final int MIN = 1;
    private static final int MAX = 100;

    public static void main(String[] args) {
        System.out.println("2. Модифицируйте программу “Угадай число” (задание с *).");

        System.out.print("Введите имя первого игрока: ");
        String name1 = scanner.nextLine();

        System.out.print("Введите имя второго игрока: ");
        String name2 = scanner.nextLine();

        System.out.print("Введите имя третьего игрока: ");
        String name3 = scanner.nextLine();

        System.out.println();

        GuessNumber game = new GuessNumber(name1, name2, nam3);
        String answer = "";
        do {
            System.out.print("Хотите продолжить игру? [yes / no]: ");
            answer = scanner.nextLine().trim().toLowerCase();
            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.print("Введите корректный ответ: ");
                answer = scanner.nextLine().trim().toLowerCase();
            }
        } while (answer.equals("yes")); 
    }
}