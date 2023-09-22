package com.startjava.lesson_1;

public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1. Подсчёт суммы чётных и нечётных чисел.");
        
        final int leftEnd = -10;
        final int rightEnd = 21;
        int number = leftEnd;

        int evenNumberSum = 0;
        int oddNumbersSum = 0;
        do {
            if (number % 2 == 0) {
                evenNumberSum += number;
            } else {
                oddNumbersSum += number;
            }

            number++;
        } while (number <= rightEnd);

        System.out.println("На отрезке [" + leftEnd + ", " + rightEnd + "]" + " сумма чётных чисел = " + evenNumberSum + " , а" +
                " нечётных = " + oddNumbersSum);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания.");
        
        final int num1 = -1;
        final int num2 = 5;
        final int num3 = 10;

        int min;
        int max;
        if (num1 > num2) {
            if (num1 > num3) {
                max = num1;

                System.out.println("Максимальное число - " + max);

                if (num2 > num3) {
                    min = num3;

                    System.out.println("Максимальное число - " + min);
                } else {
                    min = num2;

                    System.out.println("Максимальное число - " + min);
                }
            } else {
                max = num3;
                min = num2;

                System.out.println("Максимальное число - " + max);
                System.out.println("Минимальное число - " + min);
            }
        } else {
            if (num2 > num3) {
                max = num2;

                System.out.println("Максимальное число - " + max);
                
                if (num1 > num3) {
                    min = num3;

                     System.out.println("Минимальное число - " + min);
                } else {
                    min = num1;

                     System.out.println("Минимальное число - " + min);
                }
            } else {
                max = num3;
                min = num1;

                System.out.println("Максимальное число - " + max);
                System.out.println("Минимальное число - " + min);
            }
        }

        for (int i = max - 1; i > min; i--) {
            System.out.printf("%d ", i);
        }

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр.");
        
        int num = 1234;

        int digit;
        int digitsSum = 0;
        while (num != 0) {
            digit = num % 10;
            digitsSum += digit;
            num /= 10;
            System.out.printf("%d", digit);
        }
        System.out.println();

        System.out.println("Сумма цифр числа равна " + digitsSum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк.");

        final int left = 1;
        final int right = 24;
        int counter = 0;

        for (int i = left; i < right; i+= 2) {
            System.out.printf("%4d ", i);
            counter++;

            if (counter % 5 == 0) {
                counter = 0;

                System.out.println();
            }
        }

        if (counter % 5 != 0) {
            for (int i = 0; i < 5 - counter; i++) {
                System.out.print("0    ");
            }
        }
        
        System.out.println("\n5. Проверка количества двоек на чётность / нечётность.");

        int num4 = 3242592;
        int num5 = num4;
        int twosAmount = 0;

        while (num5 > 0) {
            if (num5 % 10 == 2) {
                twosAmount++;
            }

            num5 /= 10;
        }

        if (twosAmount % 2 == 0) {
            System.out.println("Количество двоек чётно: " + twosAmount);
        } else {
            System.out.println("Количество двоек нечётно: " + twosAmount);
        }

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
        int tempCounter = 0;
        while (stringAmount <= 5) {
            while (tempCounter < symbolsAmount - stringAmount) {
                System.out.print("#");

                tempCounter++;
            }
            
            System.out.println();
            tempCounter = 0;
            stringAmount++;
        }
        
        System.out.println();
        
        stringAmount = 1;
        symbolsAmount = 5;
        tempCounter = 1;
        do {
            if (stringAmount <= 3) {
                symbolsAmount = stringAmount;
            } else {
                symbolsAmount -= 1;
            }
            
            do {
                System.out.print("$");

                tempCounter++;
            } while (tempCounter <= symbolsAmount);
            
            stringAmount++;
            tempCounter = 1;
            System.out.println();
        } while (stringAmount <= 5);
        
        System.out.println("\n7. Отображение ASCII-символов.");
        
        String decimal = "DECIMAL";
        String character = "CHARACTER";
        String description = "DESCRIPTION";

        System.out.printf("%s:             %s:               %s:\n", decimal, character, description);
        for (int i = 0; i < 48; i++) {
            if (i % 2 != 0) {          
                System.out.printf("%4d                 %5c                 %1s\n", i, (char) i, Character.getName(i));
            }
        }

        for (int i = 97; i < 123; i++) {
            if (i % 2 == 0) {
                System.out.printf("%4d                 %5c                 %1s\n", i, (char) i, Character.getName(i));
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом.");

        int num6 = 123_432_1;
        int num7 = num6;
        int num8 = num6;

        int decrementalDivider = 1_000_000;
        boolean flag = true;
        for (int i = 0; i < 3 && flag == true; i++) {
            if (!((num7 % 10) == (num8 / decrementalDivider))) {
                flag = false;
            }
            
            num7 -= (num7 / decrementalDivider) * decrementalDivider;
            num8 /= 10;
            decrementalDivider /= 10;
        }

        if (flag) {
            System.out.println("Число " + num6 + " является палиндромом.");
        } else {
            System.out.println("Число " + num6 + " не является палиндромом.");
        }

        System.out.println("\n9. Проверка, является ли число счастливым.");

        int num9 = 145_901;
        int num10 = num9;

        int digit1 = num10 % 10;
        num10 /= 10; 

        int digit2 = num10 % 10;
        num10 /= 10;

        int digit3 = num10 % 10;
        num10 /= 10;

        int digit4 = num10 % 10;
        num10 /= 10; 

        int digit5 = num10 % 10;
        num10 /= 10;

        int digit6 = num10 % 10;
        num10 /= 10;

        int rightSum = digit1 + digit2 + digit3;
        int leftSum = digit4 + digit5 + digit6;

        System.out.println("Сумма первой тройки цифр " + digit3 + digit2 + digit1 + " равна " + leftSum);
        System.out.println("Сумма второй тройки цифр " + digit6 + digit5 + digit4 + " равна " + rightSum);

        if (rightSum == leftSum) {
            System.out.println("Число " + num9 + " является счастливым.");
        } else {
            System.out.println("Число " + num9 + " не является счастливым.");
        }

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