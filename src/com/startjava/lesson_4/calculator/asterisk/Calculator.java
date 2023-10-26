package com.startjava.lesson_4.calculator.asterisk;

import java.util.regex.Pattern;

class Calculator {

    public static double calculate(String expression) {
        if (isValid(expression)) {
            String[] elements = expression.split(" ");
            int num1 = Integer.parseInt(elements[0]);
            int num2 = Integer.parseInt(elements[2]);
            if (num1 <= 0 || num2 <= 0) {
                throw new RuntimeException("Числовые операнды были введены некорректно.");
            }

            char mathSign = elements[1].charAt(0);
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

        throw new RuntimeException("Некорректно введено математическое выражение.");
    }

    private static boolean isValid(String expression) {
        String regexp = "\\d{1,10}\\s.\\s\\d{1,10}";
        boolean validView = Pattern.compile(regexp).matches(regexp, expression);
        if (validView) {
            return validView;
        } 

        throw new RuntimeException("Математическое выражение введено некорректно.");
    }
}