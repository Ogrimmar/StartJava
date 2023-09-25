package com.startjava.lesson_1;

public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1. Подсчёт суммы чётных и нечётных чисел.");

        int startRange = -10;
        int rightRange = 21;

        int counter = startRange;
        int sumEvenNumbers = 0;
        int sumoddNumbers = 0;
        do {
            if (firstCounter % 2 == 0) {
                sumEvenNumbers += counter;
            } else {
                sumOddNumbers += counter;
            }
            counter++;
        } while (counter <= rightRange);

        System.out.println("На отрезке [" + startRange + ", " + rightRange + "]" + 
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
            сounter = 0;
            stringAmount++;
        }
        System.out.println();
        stringAmount = 1;
        symbolsAmount = 5;
        сounter = 1;

        do {
            if (stringAmount <= 3) {
                symbolsAmount = stringAmount;
            } else {
                symbolsAmount -= 1;
            }

            do {
                System.out.print("$");

                сounter++;
            } while (thirdCounter <= symbolsAmount);

            stringAmount++;
            сounter = 1;

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
        int firstCopyNum = num7;
        int secondCopyNum = num7;
        int decrementalDivider = 1_000_000;
        boolean flag = true;
        int num8Units;
        int num8LeftDigit;

        for (int i = 0; i < 3 && flag == true; i++) {
            num8Units = firstCopyNum % 10;
            num8LeftDigit = secondCopyNum / decrementalDivider;

            if (num8Units != num8LeftDigit) {
                flag = false;
            }

            firstCopyNum -= num8LeftDigit * decrementalDivider;
            secondCopyNum /= 10;
            decrementalDivider /= 10;
        }

        if (flag) {
            System.out.println("Число " + "'" + num7 + "'" + " является палиндромом.");
        } else {
            System.out.println("Число " + "'" + num7 + "'" + " не является палиндромом.");
        }

        System.out.println("\n9. Проверка, является ли число счастливым.");

        int num10 = 145_901;
        copyNum = num10;

        int firstDigit = copyNum % 10;
        copyNum /= 10; 

        int secondDigit = copyNum % 10;
        copyNum /= 10;

        int thirdDigit = copyNum % 10;
        copyNum /= 10;

        int fourthDigit = copyNum % 10;
        copyNum /= 10; 

        int fifthDigit = copyNum % 10;
        copyNum /= 10;

        int sixthDigit = copyNum % 10;
        copyNum /= 10;

        int firstSum = firstDigit + secondDigit + thirdDigit;
        int secondSum = fourthDigit + fifthDigit + sixthDigit;

        String output;
        if (firstSum == secondSum) {
            output = "Число " + "'" + num10 + "'" + " является счастливым.";
        } else {
            output = "Число " + "'" + num10 + "'" + " не является счастливым.";
        }

        System.out.println(output);
        System.out.println("Сумма цифр " + "'" + firstDigit + secondDigit + thirdDigit + "'" + 
                " = " + firstSum + ", а сумма цифр " + "'" + fourthDigit + fifthDigit + 
                sixthDigit + "'" + " = " + secondSum);

        System.out.println("\n10. Вывод таблицы умножения Пифагора.");

        System.out.println("               ТАБЛИЦА    ПИФАГОРА          ");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0) {
                    System.out.print("          ");
                }

                if (i == 0 && j == 0) {
                    System.out.print("   ");
                }

                if (j == 1) {
                    System.out.print("" + "|");
                }

                if (i == 0 && j > 1) {
                    System.out.printf("%2d ", j);
                }

                if (i == 1) {
                    System.out.print("---");
                }
                
                if (i > 1 && j < 9) {
                    System.out.printf("%2d ", i + j * i);
                }
            }
            System.out.println();
        }
    }
}