package com.startjava.lesson_1;

import java.util.Random;

public class GuessNumber {

    public static void main(String[] args) {
        System.out.println("Игра “Угадай число”.");

        int min = 1;
        int max = 100;
        int randomNumber = min + new Random().nextInt(max);
        int guessedNumber = 0;

        while (guessedNumber != randomNumber) {
            guessedNumber = changeNumber(guessedNumber, randomNumber);

            if (guessedNumber < randomNumber) {
                System.out.println("Число guessedNumber = " + guessedNumber + " меньше " + 
                        "загаданного компьютером значения" + " randomNumber = " + randomNumber);
            } else {
                System.out.println("Число guessedNumber = " + guessedNumber + " больше " + 
                    "загаданного компьютером значения" + " randomNumber = " + randomNumber);
            }
        }

        System.out.println("Вы победили!");
    }

    private static int changeNumber(int guessedNumber, int randomNumber) {
        guessedNumber = (guessedNumber > randomNumber) ? guessedNumber - 2 : guessedNumber + 1;

        return guessedNumber;
    }
}