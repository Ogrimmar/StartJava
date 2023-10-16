package com.startjava.lesson_4.calculator.asterisk;

import java.util.Scanner;

public class CalculatorTest {

    private static final int EXPRESSION_LENGTH = 3;                 // число операндов и число знаков в выражении
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1. Модифицируйте программу \"Калькулятор\" (задание с *).");

        String answer = "yes";
        while (answer.equals("yes")) {
            String expression = enterExpression();
            double result = 0.0;
            try {
                result = Calculator.calculate(expression);
                displayResult(result, expression);
            } catch (RuntimeException ex) {
                System.out.println(ex.getClass().getName());
                System.out.println(ex.getMessage() + "\n");
            }
            answer = enterAnswer();
        }
    }

    private static String enterExpression() {
        int num1, num2, length = 0;
        String expression = "";
        do {
            System.out.print("Введите математическое выражение с натуральными числами: ");
            expression = scanner.nextLine().trim().toLowerCase();
            String[] splittedExpression = expression.split(" ");
            length = splittedExpression.length;
            num1 = Integer.parseInt(splittedExpression[0]);
            num2 = Integer.parseInt(splittedExpression[2]);
        } while (length != EXPRESSION_LENGTH && (num1 <= 0 || num2 <= 0));

        return expression;
    }

    private static void displayResult(double result, String expression) {
        if (result == Double.MIN_VALUE) {
            throw new RuntimeException("Результат: " + result);
        } else {
            if (result == (int) result) {
                System.out.printf("%s = %d\n", expression, (int) result);
            } else {
                System.out.printf("%s = %.3f\n", expression, result);
            }
            System.out.println();            
        }
    }

    private static String enterAnswer() {
        System.out.print("Хотите продолжить игру [yes / any answer, besides \"yes\"]: ");
        return scanner.nextLine().trim().toLowerCase();
    }
}