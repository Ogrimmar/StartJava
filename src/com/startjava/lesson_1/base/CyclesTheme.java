package com.startjava.lesson_1.base;

public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1. Подсчёт суммы чётных и нечётных чисел.");

        int startRange = -10;
        int endRange = 21;

        int counter = startRange;
        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;
        do {
            if (counter % 2 == 0) {
                sumEvenNumbers += counter;
            } else {
                sumOddNumbers += counter;
            }
            counter++;
        } while (counter <= endRange);

        System.out.println("На отрезке [" + startRange + ", " + endRange + "]" + 
                " сумма чётных чисел = " + sumEvenNumbers + " , а" +" нечётных = " + sumOddNumbers);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания.");

        int num1 = -1;
        int num2 = 5;
        int num3 = 10;
        int min = num1;
        int max = num2;

        if (num1 > num2) {
            min = num2;
            max = num1;
        }

        if (num3 > max) {
            max = num3;
        } 

        if (num3 < min) {
            min = num3;
        } 

        System.out.println("Максимальное число - " + max + ", а минимальное - " + min);

        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр.");

        int num4 = 1_234;
        System.out.println("Имеется число " + "'" + num4 + "'.");
        System.out.print("Реверсивное число - ");
        int sumDigits = 0;
        while (num4 != 0) {
            int digit = num4 % 10;
            sumDigits += digit;
            num4 /= 10;

            System.out.print(digit);
        }

        System.out.println("\n" + "Сумма цифр числа равна " + sumDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк.");

        int left = 1;
        int right = 24;
        counter = 0;
        for (int i = left; i < right; i+= 2) {
            System.out.printf("%4d", i);
            counter++;

            if (counter % 5 == 0) {
                counter  = 0;
                System.out.println();
            }
        }

        if (counter % 5 != 0) {
            for (int i = 0; i < 5 - counter; i++) {
                System.out.printf("%4d", 0);
            }
        }
        System.out.println("\n\n5. Проверка количества двоек на чётность / нечётность.");

        int num5 = 3_242_592;
        int copyNum = num5;
        int deuceAmount = 0;
        while (copyNum > 0) {
            if (copyNum % 10 == 2) {
                deuceAmount++;
            }

            copyNum /= 10;
        }

        System.out.println("В числе " + "'" + num5 + "'" + " количество двоек - " + deuceAmount);

        System.out.println("\n6. Отображение фигур в консоли.");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println();

        int symbolsAmount = 5;
        int stringAmount = 1;
        counter = 0;
        while (stringAmount <= 5) {
            while (counter < symbolsAmount - stringAmount) {
                System.out.print("#");
                counter++;
            }

            System.out.println();
            counter = 0;
            stringAmount++;
        }
        System.out.println();
        stringAmount = 1;
        symbolsAmount = 5;
        counter = 1;

        do {
            if (stringAmount <= 3) {
                symbolsAmount = stringAmount;
            } else {
                symbolsAmount -= 1;
            }

            do {
                System.out.print("$");

                counter++;
            } while (counter <= symbolsAmount);

            stringAmount++;
            counter = 1;

            System.out.println();
        } while (stringAmount <= 5);

        System.out.println("\n7. Отображение ASCII-символов.");

        System.out.printf("%s:%20s:%23s:\n", "DECIMAL", "CHARACTER", "DESCRIPTION");

        for (int i = 15; i < 48; i++) {
            if (i % 2 != 0) {
                System.out.printf("%4d%20c                %s\n", i, (char) i, Character.getName(i));
            }
        }

        for (int i = 97; i < 123; i++) {
            if (i % 2 == 0) {
                System.out.printf("%4d%20c                %s\n", i, (char) i, Character.getName(i));
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом.");

        int num7 = 1_234_321;
        copyNum = num7;
        int rightHalfFactor = 1;
        int leftHalfFactor = 10_000;

        int num7RightHalf = num7 % 1_000;                       // 321
        int num7MediumUnit = (num7 / 1_000) % 10;               // 4
        int num7LeftHalf = (num7 / 10_000) % 1_000;             // 123
        int reversedNum7 = 0;
        for (int i = 0; i < 3; i++) {
            reversedNum7 += (num7RightHalf % 10) * rightHalfFactor;
            reversedNum7 += (num7LeftHalf % 10) * leftHalfFactor;
            num7RightHalf /= 10;
            num7LeftHalf /= 10;
            rightHalfFactor *= 10;
            leftHalfFactor *= 10;
        }
        reversedNum7 += num7MediumUnit * rightHalfFactor;

        if (reversedNum7 == num7) {
            System.out.println("Число " + "'" + num7 + "'" + " является палиндромом.");
        } else {
            System.out.println("Число " + "'" + num7 + "'" + " не является палиндромом.");
        }

        System.out.println("\n9. Проверка, является ли число счастливым.");

        int num10 = 145_901;
        copyNum = num10;

        int rightSum = 0;
        int leftSum = 0;
        for (int i = 0; i < 3; i++) {
            rightSum += copyNum % 10;
            leftSum += (copyNum / 1_000) % 10;
            copyNum /= 10;
        }

        if (rightSum == leftSum) {
            System.out.println("Число " + "'" + num10 + "'" + "является счастливым.");
        } else {
            System.out.println("Число " + "'" + num10 + "'" + "не является счастливым.");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора.");

        System.out.println("                              ТАБЛИЦА    ПИФАГОРА          \n");

        System.out.print("                   |");
        for (int i = 2; i <= 9; i++) {
            System.out.print("   " + i + " ");
        }
        System.out.println();

        System.out.print("                ---|");
        for (int i = 0; i < 8; i++) {
            System.out.print("-----");
        }
        System.out.println();

        for (int i = 1; i <= 9; i++) {
            System.out.print("                  " + i + "|");
            for (int j = 2; j <= 9; j++) {
                System.out.printf(" %3d ", i * j);
            }
            System.out.println();
        }
    }
}