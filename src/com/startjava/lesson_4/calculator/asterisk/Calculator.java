package com.startjava.lesson_4.calculator.asterisk;

import java.util.regex.Pattern;

class Calculator {

    public static double calculate(String expression) throws RuntimeException, 
        ArithmeticException {

        double result = Double.NEGATIVE_INFINITY;
        if (isExpressionLegal(expression)) {
            String[] splittedExpression = expression.split(" ");
            int num1 = Integer.parseInt(splittedExpression[0]);
            char mathSign = (splittedExpression[1].toCharArray())[0];
            int num2 = Integer.parseInt(splittedExpression[2]);
            result = switch (mathSign) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '^' -> Math.pow(num1, num2);
            case '/' -> {
                if (num2 == 0) {
                    throw new ArithmeticException("Unable to divide by zero.");
                }
                yield num1 / num2;
            }
            case '%' -> num1 % num2;
            default -> throw new RuntimeException("Ошибка: знак " + "'" + mathSign + "'" + 
                             " не поддерживается.\n");
            };
        }

        return result;
    }

    private static boolean isExpressionLegal(String expression) {
        String regularExpression = "\\d{1,19}\\s.\\s\\d{1,19}";
        Pattern pattern = Pattern.compile(regularExpression);
        return pattern.matches(regularExpression, expression);
    }
}