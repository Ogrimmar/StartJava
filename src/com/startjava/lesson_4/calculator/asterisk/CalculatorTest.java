package com.startjava.lesson_4.calculator.asterisk;

import java.util.Scanner;

public class CalculatorTest {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1. Модифицируйте программу \"Калькулятор\" (задание с *).");

        String answer = "yes";
        while (answer.equals("yes")) {
            String expression = enterExpression();
            double result = Double.MIN_VALUE;
            try {
                result = Calculator.calculate(expression);
            } catch (RuntimeException ex) {
                System.out.println(ex.getClass().getName());
                System.out.println(ex.getMessage() + "\n");
            }

            if (result != Double.MIN_VALUE) {
                displayResult(result, expression);
            }

            answer = giveAnswer();
        }
    }

    private static String enterExpression() {
        int num1, num2;
        String expression = "";
        do {
            System.out.print("Введите корректное математическое выражение: ");
            expression = scanner.nextLine().trim().toLowerCase();
            String[] splittedExpression = expression.split(" ");
            num1 = Integer.parseInt(splittedExpression[0]);
            num2 = Integer.parseInt(splittedExpression[2]);
        } while (num1 <= 0 || num2 <= 0);

        return expression;
    }

    private static void displayResult(double result, String expression) {
        String[] splittedExpression = expression.split(" ");
        int num1 = Integer.parseInt(splittedExpression[0]);
        char mathSign = (splittedExpression[1].toCharArray())[0];
        int num2 = Integer.parseInt(splittedExpression[2]);
        if (result == (int) result) {
            System.out.printf("%d %c %d = %d\n", num1, mathSign, num2, (int) result);
        } else {
            System.out.printf("%d %c %d = %.3f\n", num1, mathSign, num2, result);
        }
        System.out.println();
    }

    private static String giveAnswer() {
        System.out.print("Хотите продолжить игру [yes / any amount of symbols]: ");
        String answer = scanner.nextLine().trim().toLowerCase();
        System.out.println();
        return answer;
    }
}