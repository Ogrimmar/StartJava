package com.startjava.lesson_4.calculator.common;

import java.util.Scanner;

public class CalculatorTest {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1. Модифицируйте программу \"Калькулятор\".");

        String answer;
        do {
            String[] expression = CalculatorTest.enterExpression();
            Calculator calculator = new Calculator();
            double result = calculator.calculate(expression);
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
        System.out.print("Введите математическое выражение: ");
        String[] expression = new String[3];
        expression = scanner.nextLine().split(" ");

        return expression;
    }
}