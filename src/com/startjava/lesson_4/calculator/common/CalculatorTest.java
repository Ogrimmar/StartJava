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

            answer = giveAnswer();
        }
    }

    private static String enterExpression() {
        System.out.print("Введите математическое выражение: ");
        String expression = scanner.nextLine().trim().toLowerCase();

        return expression;
    }

    private static void displayResult(double result, String expression) {
        String[] spilltedExpression = expression.split(" ");
        int num1 = Integer.parseInt(spilltedExpression[0]);
        char mathSign = (spilltedExpression[1].toCharArray())[0];
        int num2 = Integer.parseInt(spilltedExpression[2]);
        if (result == (int) result) {
            System.out.printf("%d %c %d = %d\n", num1, mathSign, num2, (int) result);
        } else {
            System.out.printf("%d %c %d = %.3f\n", num1, mathSign, num2, result);
        }
        System.out.println();
    }

    private static String giveAnswer() {
        System.out.print("Хотите продолжить игру [yes / any amount of symbols]: ");
        return scanner.nextLine().trim().toLowerCase();
    }
}