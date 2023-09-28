package com.startjava.lesson_4;

import java.util.Arrays;

public class ArraysTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений.");

        completeFirstTask();

        System.out.println("\n2. Произведение элементов массива.");

        completeSecondTask();

        System.out.println("\n3. Удаление элементов массива.");

        completeThirdTask();

        System.out.println("\n4. Вывод алфавита лесенкой.");

        completeFourthTask();

        System.out.println("\n5. Заполнение массива уникальными числами.");

        completeFifthTask();
    }

    private static void completeFirstTask() {
        int[] numbers = new int[] {7, 1, 6, 3, 4, 5};

        System.out.print("Значения до реверса: ");
        System.out.println(Arrays.toString(numbers));

        int elem;
        int length = numbers.length;

        for (int i = 0; i < length / 2; i++) {
            elem = numbers[i];
            numbers[i] = numbers[length - 1 - i];
            numbers[length - 1 - i] = elem;
        }

        System.out.print("Значения после реверса: ");
        System.out.println(Arrays.toString(numbers));
    }

    private static void completeSecondTask() {
        int[] digits = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int multiplication = 1;

        for (int digit : digits) {
            if (digit != 0 && digit != 9) {
                multiplication *= digit;
            }
        }

        String s = (multiplication > 0) ? "1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 = %d\n" : "-1%d\n";
        System.out.printf(s, multiplication);
    }

    private static void completeThirdTask() {
        double[] randomNumbers = new double[15];
        int length = randomNumbers.length;

        for (int i = 0; i < length; i++) {
            randomNumbers[i] = Math.random();
        }

        System.out.print("Массив до изменения: ");
        for (int i = 0; i < length; i++) {
            if (i % 8 == 0) {
                 System.out.println();
            }
            System.out.printf("%.3f  ", randomNumbers[i]);
        }
        System.out.println("\n");

        int mediumElemIndex = length / 2;
        double mediumElem = randomNumbers[mediumElemIndex];
        int nullifiedElems = 0;
        for (int i = 0; i < length; i++) {
            if (randomNumbers[i] > mediumElem) {
                randomNumbers[i] = 0.0D;
                nullifiedElems++;
            }
        }

        System.out.print("Массив после изменения: ");
        for (int i = 0; i < length; i++) {
            if (i % 7 == 0) {
                 System.out.println();
            }
            System.out.printf("%.3f  ", randomNumbers[i]);
        }
        System.out.println("\nКоличество обнулённых элементов: " + nullifiedElems);
    }

    private static void completeFourthTask() {
        int cardinalityEngAlph = 26;
        char[] englishAlphabet = new char[cardinalityEngAlph];
        int length = englishAlphabet.length;

        for (int i = 0; i < 26; i++) {
            englishAlphabet[i] = (char) (i + 65);
        }

        for (int i = length - 1; i >= 0; i--) {
            for (int j = length - 1; j >= i; j--) {
                System.out.print(englishAlphabet[j]);
            }
            System.out.println();
        }
    }

    private static void completeFifthTask() {
        double[] randomNumbers = new double[30];
        int length = randomNumbers.length;

        for (int i = 0; i < length; i++) {
            double generatedNumber = 40 * Math.random() + 60;

            if (isUnique(randomNumbers, generatedNumber)) {
                do {
                    generatedNumber = 40 * Math.random() + 60;
                } while (!isUnique(randomNumbers, generatedNumber));
            }

            randomNumbers[i] = generatedNumber;
        }

        Arrays.sort(randomNumbers);

        for (int i = 0; i < length; i++) {
            if (i % 10 == 0 && i > 0) {
                System.out.println();
            }
            System.out.printf("%.3f   ", randomNumbers[i]);
        }
    }

    private static boolean isUnique(double[] numbers, double number) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                return false;
            }
        }

        return true;
    }
}