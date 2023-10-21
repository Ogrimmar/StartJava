package com.startjava.lesson_4.calculator.common;

import java.util.Scanner;

public class CalculatorTest {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1. Модифицируйте программу \"Калькулятор\".");

        Calculator calculator = new Calculator();
        String answer = "yes";
        while (answer.equals("yes")) {
            String expression = enterExpression();
            double result = calculator.calculate(expression);
            if (result != Double.MIN_VALUE) {
                displayResult(result, expression);
            }

            System.out.print("Хотите продолжить игру? [yes / no]: ");
            answer = scanner.nextLine().trim().toLowerCase();
            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.print("Введите корректный ответ [yes / no]: ");
                answer = scanner.nextLine().trim().toLowerCase();
            }

            if (answer.equals("no")) {
                break;
            }

            System.out.println();
        }
    }

    private static String enterExpression() {
        System.out.print("Введите математическое выражение: ");
        return scanner.nextLine().trim().toLowerCase();
    }

    private static void displayResult(double result, String expression) {
        if (result == (int) result) {
            System.out.printf("%s = %.0f\n", expression, result);
        } else {
            System.out.printf("%s = %.3f\n", expression, result);
        }
    }
}