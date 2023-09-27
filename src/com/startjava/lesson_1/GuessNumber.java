package com.startjava.lesson_1;

import java.util.Random;

public class GuessNumber {

    public static void main(String[] args) {
        System.out.println("Игра “Угадай число”.");

        int min = 1;
        int max = 100;
        int randomValue = min + new Random().nextInt(max);
        int guessedValue = 0;

        while (guessedValue != randomValue) {
            guessedValue = changeNumber(guessedValue);

            if (guessedValue == randomValue) {
                System.out.println("Вы победили!");
            } else {
                if (guessedValue < randomValue) {
                    System.out.println("Число guessedValue = " + guessedValue + " меньше загаданного компьютером значения" + 
                            " randomValue = " + randomValue);
                } else {
                    System.out.println("Число guessedValue = " + guessedValue + " больше загаданного компьютером значения" + 
                            " randomValue = " + randomValue);
                }
            }
        }
    }

    private static int changeNumber(int number) {
        number = (number % 3 == 0) ? number + 6 : number - 2;

        return number;
    }
}