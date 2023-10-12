package com.startjava.lesson_4;

import java.util.Arrays;

public class ArraysTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений.");
        reverseArray();

        System.out.println("\n2. Произведение элементов массива.");
        multiplyFactors();

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
            length--;
            int number = numbers[i];
            numbers[i] = numbers[length];
            numbers[length] = number;
        }
        System.out.print("Значения после реверса: ");
        System.out.println(Arrays.toString(numbers));
    }

    private static void multiplyFactors() {
        int[] factors = new int[10];
        int length = factors.length;
        for (int i = 0; i < length; i++) {
            factors[i] = i;
        }

        int multiplication = 1;
        for (int i = 0; i < length; i++) {
            String output = (i == 0 || i >= length - 1) ? "" : (i == length - 1 ? factors[i] + " = " : 
                    factors[i] + " * ");
            System.out.print(output);
            multiplication = (i == 0 || i == 9) ? multiplication : multiplication * factors[i];
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
        displayArray(randomNumbers);
        System.out.println("\n");

        double centralCellValue = randomNumbers[length / 2];
        int deletedCells = 0;
        for (int i = 0; i < length; i++) {
            if (randomNumbers[i] > centralCellValue) {
                randomNumbers[i] = 0.0;
                deletedCells++;
            }
        }

        System.out.print("Массив после изменения: ");
        displayArray(randomNumbers);
        System.out.println("\n\nКоличество обнулённых элементов: " + deletedCells);
    }

    private static void displayArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 8 == 0) {
                 System.out.println();
            }
            System.out.printf("%.3f  ", array[i]);
        }
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