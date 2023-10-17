package com.startjava.lesson_4.calculator.asterisk;

import java.util.regex.Pattern;

class Calculator {

    public static double calculate(String expression) {
        if (isValidView(expression)) {
            String[] splittedExpression = expression.split(" ");

            int num1 = Integer.parseInt(splittedExpression[0]);
            if (num1 <= 0) {
                throw new RuntimeException("Первой числовой операнд был введён некорректно.");
            }

            int num2 = Integer.parseInt(splittedExpression[2]);
            if (num2 <= 0) {
                throw new RuntimeException("Второй числовой операнд был введён некорректно.");
            }

            char mathSign = (splittedExpression[1].toCharArray())[0];
            return switch (mathSign) {
                case '+' -> num1 + num2;
                case '-' -> num1 - num2;
                case '*' -> num1 * num2;
                case '^' -> Math.pow(num1, num2);
                case '/' -> (double) num1 / num2;
                case '%' -> num1 % num2;
                default -> throw new RuntimeException("Ошибка: знак " + "'" + mathSign + "'" + 
                        " не поддерживается.\n");
            };
        }

        throw new RuntimeException("Математическое выражение введено некорректно.");
    }

    private static boolean isValidView(String expression) {
        String regularExpression = "\\d{1,19}\\s.\\s\\d{1,19}";
        return Pattern.compile(regularExpression).matches(regularExpression, expression);
    }
}