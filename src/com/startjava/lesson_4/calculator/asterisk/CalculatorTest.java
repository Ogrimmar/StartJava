package com.startjava.lesson_4.calculator.asterisk;

import java.util.Scanner;

public class CalculatorTest {

    private static Scanner scanner = new Scanner(System.in, "cp866");

    public static void main(String[] args) {
        System.out.println("1. Модифицируйте программу \"Калькулятор\" (задание с *).");

        String answer = "yes";
        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                String expression = enterExpression();
                try {
                    double result = Calculator.calculate(expression);
                    displayResult(result, expression);
                } catch (RuntimeException ex) {
                    System.out.println(ex.getMessage());
                }
                System.out.print("Хотите продолжить игру? [yes / no]: ");
            } else {
                System.out.print("Введите корректный ответ [yes / no]: ");
            }

            answer = scanner.nextLine().trim().toLowerCase();
            System.out.println();
        }
    }

    private static String enterExpression() {
        System.out.print("Введите математическое выражение с натуральными числами: ");
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