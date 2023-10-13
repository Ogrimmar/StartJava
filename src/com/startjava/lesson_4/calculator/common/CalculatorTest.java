package com.startjava.lesson_4.calculator.common;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CalculatorTest {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1. Модифицируйте программу \"Калькулятор\".");

        Calculator calculator = new Calculator();
        String[] expressionParts = CalculatorTest.enterExpression();
        while (isExpressionRight(expressionParts)) {
            double result = calculator.calculate(expressionParts);
            if (result > Double.NEGATIVE_INFINITY) {
                displayResult(result, expressionParts);
            }
            expressionParts = CalculatorTest.enterExpression();
        }
    }

    private static String[] enterExpression() {
        System.out.print("Введите математическое выражение: ");
        String[] expressionParts = new String[3];
        expressionParts = scanner.nextLine().split(" ");

        return expressionParts;
    }

    private static void displayResult(double result, String[] expressionParts) {
        int num1 = Integer.parseInt(expressionParts[0]);
        char mathSign = (expressionParts[1].toCharArray())[0];
        int num2 = Integer.parseInt(expressionParts[2]);
        if (result == (int) result) {
            System.out.printf("%d %c %d = %d\n", num1, mathSign, num2, (int) result);
        } else {
            System.out.printf("%d %c %d = %.3f\n", num1, mathSign, num2, result);
        }
        System.out.println();
    }

    private static boolean isExpressionRight(String[] expressionParts) {
        String expression = "";
        for (int i = 0; i < expressionParts.length; i++) {
            expression += expressionParts[i];
        }
        
        String regularExpression = "\\d{1,19}[+-/^*%]\\d{1,19}";
        Pattern pattern = Pattern.compile(regularExpression);
        
        return pattern.matches(regularExpression, expression);
    }
}