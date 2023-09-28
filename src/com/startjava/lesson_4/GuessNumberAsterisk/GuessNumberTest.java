package com.startjava.lesson_4.GuessNumberAsterisk;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {

    private static final Scanner scanner = new Scanner(System.in);
    private static final int min = 1;
    private static final int max = 100;

    public static void main(String[] args) {
        System.out.println("2. Модифицируйте программу “Угадай число” (задание с *).");

        int generatedNumber = generateNumber();

        System.out.print("Введите имя первого игрока: ");
        String firstPlayerName = scanner.nextLine();

        System.out.print("Введите имя второго игрока: ");
        String secondPlayerName = scanner.nextLine();

        System.out.print("Введите имя третьего игрока: ");
        String thirdPlayerName = scanner.nextLine();

        System.out.println();

        GuessNumber game = new GuessNumber(firstPlayerName, secondPlayerName, thirdPlayerName);
        String answer = game.startGame(generatedNumber);
        while (answer.equals("yes")) {
            generatedNumber = generateNumber();
            answer = game.startGame(generatedNumber);
        }
    }

    private static int generateNumber() {
        System.out.println("Компьютер 'загадал' число!\n");

        return min + new Random().nextInt(max);
    }
}