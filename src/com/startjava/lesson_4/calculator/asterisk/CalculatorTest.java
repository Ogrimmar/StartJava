package com.startjava.lesson_4.calculator.asterisk;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CalculatorTest {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1. Модифицируйте программу \"Калькулятор\" (задание с *).");

        String[] splittedExpression = CalculatorTest.enterExpression();
        while (isExpressionRight(splittedExpression)) {
            double result = Double.NEGATIVE_INFINITY;
            try {
                result = Calculator.calculate(splittedExpression);
            } catch (RuntimeException ex) {
                System.out.println(ex.getClass().getName());
            }

            if (result > Double.NEGATIVE_INFINITY) {
                displayResult(result, splittedExpression);
            }
            splittedExpression = CalculatorTest.enterExpression();
        }
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

    private static void displayResult(double result, String[] expression) {
        int num1 = Integer.parseInt(expression[0]);
        char mathSign = (expression[1].toCharArray())[0];
        int num2 = Integer.parseInt(expression[2]);
        if (result == (int) result) {
            System.out.printf("%d %c %d = %d\n", num1, mathSign, num2, (int) result);
        } else {
            System.out.printf("%d %c %d = %.3f\n", num1, mathSign, num2, result);
        }
        System.out.println();
    }

    private static boolean isExpressionRight(String[] splittedExpression) {
        String expression = "";
        for (int i = 0; i < splittedExpression.length; i++) {
            expression += splittedExpression[i];
        }
        
        String regularExpression = "\\d{1,19}[+-/^*%]\\d{1,19}";
        Pattern pattern = Pattern.compile(regularExpression);
        
        return pattern.matches(regularExpression, expression);
    }
}