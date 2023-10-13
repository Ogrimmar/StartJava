package com.startjava.lesson_4.calculator.asterisk;

import java.util.Scanner;

public class CalculatorTest {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1. Модифицируйте программу \"Калькулятор\" (задание с *).");

        String answer = "";
        do {
            String[] splittedExpression = CalculatorTest.enterExpression();

            double result = 0.0;
            try {
                result = Calculator.calculate(splittedExpression);
            } catch (RuntimeException ex) {
                System.out.println(ex.getClass().getName());
            }

            if (result > Double.NEGATIVE_INFINITY) {
                if (result == (int) result) {
                    System.out.printf("Результат: %d\n", (int) result);
                } else {
                    System.out.printf("Результат: %.3f\n", result);
                }
            }

            System.out.print("\nХотите продолжить вычисления? [yes / no]: ");
            answer = scanner.next().toLowerCase();
            scanner.nextLine();
            if (!answer.equals("yes") && !answer.equals("no")) {
                System.out.print("Введите корректный ответ [yes / no]: ");
                answer = scanner.next().toLowerCase();
                scanner.nextLine();
            }
            System.out.println();
        } while (answer.equals("yes"));
    }

    private static String[] enterExpression() {
        String expression = "";
        int length = 0;
        String[] splittedExpression = new String[3];
        do {
            System.out.println("Нужно вводить натуральные числа.");
            System.out.print("Введите математическое выражение: ");
            expression = scanner.nextLine();
            length = expression.length();
            splittedExpression = expression.split(" ");
        } while (Integer.parseInt(splittedExpression[0]) <= 0 || 
                        Integer.parseInt(splittedExpression[2]) <= 0);
        System.out.println("Длина математического выражения: " + length);

        return splittedExpression;
    }
}