package com.startjava.lesson_4.GuessNumber;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {
    
    private static final Scanner scanner = new Scanner(System.in);
    private static final int min = 0;
    private static final int max = 100;
    
    public static void main(String[] args) {
        System.out.println("2. Модифицируйте программу “Угадай число”.");
        
        int generatedNumber = generateNumber();

        System.out.print("Введите имя первого игрока: ");
        String firstPlayerName = scanner.nextLine();

        System.out.print("Введите имя второго игрока: ");
        String secondPlayerName = scanner.nextLine();
        
        System.out.println();

        GuessNumber game = new GuessNumber(firstPlayerName, secondPlayerName);
        String answer = game.startGame(generatedNumber);

        while (answer.equals("yes")) {
            generatedNumber = generateNumber();
            answer = game.startGame(generatedNumber);
        }
    }

    private static int generateNumber() {
        System.out.println("Компьютер 'загадал' число!\n");

        return 1 + min + new Random().nextInt(max);
    }
}