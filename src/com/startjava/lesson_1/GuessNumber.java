package com.startjava.lesson_1;

import java.util.Random;

public class GuessNumber {

    private static final int ATTEMPTS = 30;
    
    public static void main(String[] args) {
        System.out.println("Игра “Угадай число”.");

        int min = 0;
        int max = 100;
        int randomValue = min + 1 + new Random().nextInt(max);
        int guessedValue = 0;
        int attempts = 0;

        while (guessedValue != randomValue && attempts <= ATTEMPTS) {
            guessedValue = changeNumber(guessedValue);

            if (guessedValue == randomValue) {
                System.out.println("Вы победили!");
            } else {
                if (guessedValue < randomValue) {
                    System.out.printf("Число guessedValue = %d меньше загаданного компьютером значения randomValue = %d.\n", guessedValue, 
                        randomValue);
                } else {
                    System.out.printf("Число guessedValue = %d больше загаданного компьютером значения randomValue = %d.\n", guessedValue, 
                        randomValue);
                }
            }

            attempts++;
        }
    }

    private static int changeNumber(int number) {
        number = (number % 3 == 0) ? number + 6 : number - 2;

        return number;
    }
}