package com.startjava.lesson_4;

import java.util.Arrays;

public class ArraysTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений.");
        reverseArray();

        System.out.println("\n2. Произведение элементов массива.");
        multiplyArrayCells();

        System.out.println("\n3. Удаление элементов массива.");
        deleteArrayCells();

        System.out.println("\n4. Вывод алфавита лесенкой.");
        outputAlphabet();

        System.out.println("\n5. Заполнение массива уникальными числами.");
        fillWithUniqueNumbers();
    }

    private static void reverseArray() {
        int[] numbers = {7, 1, 6, 3, 4, 5};

        System.out.print("Значения до реверса: ");
        System.out.println(Arrays.toString(numbers));

        int length = numbers.length;
        for (int i = 0; i < length / 2; i++) {
            int number = numbers[i];
            numbers[i] = numbers[length - 1 - i];
            numbers[length - 1 - i] = number;
        }

        System.out.print("Значения после реверса: ");
        System.out.println(Arrays.toString(numbers));
    }

    private static void multiplyArrayCells() {
        int[] factors = new int[10];
        for (int i = 0; i < 10; i++) {
            factors[i] = i;
        }

        int multiplication = 1;
        for (int factor : factors) {
            String output = (factor <= 0 || factor >= 9) ? "" : (factor == 8 ? factor + " = " : 
                    factor + " * ");
            System.out.print(output);
            multiplication = (factor > 0 && factor < 9) ? multiplication * factor : multiplication;
        }
        System.out.println(multiplication);
    }

    private static void deleteArrayCells() {
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

        double mediumCellValue = randomNumbers[length / 2];
        int nullifiedCells = 0;
        for (int i = 0; i < length; i++) {
            if (randomNumbers[i] > mediumCellValue) {
                randomNumbers[i] = 0.0;
                nullifiedCells++;
            }
        }

        System.out.print("Массив после изменения: ");
        for (int i = 0; i < length; i++) {
            if (i % 8 == 0) {
                 System.out.println();
            }
            System.out.printf("%.3f  ", randomNumbers[i]);
        }
        System.out.println("\n\nКоличество обнулённых элементов: " + nullifiedCells);
    }

    private static void outputAlphabet() {
        int length = 26;
        char[] englishAlphabet = new char[length];
        for (int i = 0; i < length; i++) {
            englishAlphabet[i] = (char) (i + 65);
        }

        for (int i = length - 1; i >= 0; i--) {
            for (int j = length - 1; j >= i; j--) {
                System.out.print(englishAlphabet[j]);
            }
            System.out.println();
        }
    }

    private static void fillWithUniqueNumbers() {
        double[] uniqueNumbers = new double[30];
        int length = uniqueNumbers.length;
        for (int i = 0; i < length; i++) {
            double randomNumber = 40 * Math.random() + 60;
            while (!isUnique(uniqueNumbers, randomNumber)) {
                randomNumber = 40 * Math.random() + 60;
            }
            uniqueNumbers[i] = randomNumber;
        }

        Arrays.sort(uniqueNumbers);

        for (int i = 0; i < length; i++) {
            if (i % 10 == 0 && i > 0) {
                System.out.println();
            }
            System.out.printf("%.3f   ", uniqueNumbers[i]);
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