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
            if (guessedNumber <=  randomNumber) {
                System.out.println("Число guessedNumber = " + guessedNumber + " меньше " + 
                        "загаданного компьютером значения" + " randomNumber = " + randomNumber);
                guessedNumber++;
            } else {
                System.out.println("Число guessedNumber = " + guessedNumber + " больше " + 
                        "загаданного компьютером значения" + " randomNumber = " + randomNumber);
                guessedNumber -= 2;
            }
        }

        System.out.println("Вы победили!");
    }
}