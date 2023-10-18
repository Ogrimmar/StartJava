package com.startjava.lesson_4.calculator.asterisk;

import java.util.Scanner;

public class CalculatorTest {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1. Модифицируйте программу \"Калькулятор\" (задание с *).");

        String answer = "yes";
        while (answer.equals("yes")) {
            String expression = enterExpression();
            try {
                double result = Calculator.calculate(expression);
                displayResult(result, expression);
            } catch (RuntimeException ex) {
                System.out.println(ex.getMessage());
            }

            answer = enterAnswer();
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

    private static String enterAnswer() {
        System.out.print("Хотите продолжить игру [yes / no]: ");
        String answer = scanner.nextLine().trim().toLowerCase();
        while (!answer.equals("yes") && !answer.equals("no")) {
            answer = scanner.nextLine().trim().toLowerCase();
        }
        return answer;
    }
}