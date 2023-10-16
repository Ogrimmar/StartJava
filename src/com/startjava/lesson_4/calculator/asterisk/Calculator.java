package com.startjava.lesson_4.calculator.asterisk;

import java.util.regex.Pattern;

class Calculator {

    public static double calculate(String expression) {
        double result = Double.MIN_VALUE;
        if (isValid(expression)) {
            String[] splittedExpression = expression.split(" ");
            int num1 = Integer.parseInt(splittedExpression[0]);
            char mathSign = (splittedExpression[1].toCharArray())[0];
            int num2 = Integer.parseInt(splittedExpression[2]);
            result = switch (mathSign) {
                case '+' -> num1 + num2;
                case '-' -> num1 - num2;
                case '*' -> num1 * num2;
                case '^' -> Math.pow(num1, num2);
                case '/' -> num1 / num2;
                case '%' -> num1 % num2;
                default -> throw new RuntimeException("Ошибка: знак " + "'" + mathSign + "'" + 
                        " не поддерживается.");
            };
        } else {
            throw new RuntimeException("Введены некорректные числа.");
        }

        return result;
    }

    private static boolean isValid(String expression) {
        String regularExpression = "\\d{1,19}\\s.\\s\\d{1,19}";     // 19 - самое большое число цифр у числа типа long
        Pattern pattern = Pattern.compile(regularExpression);
        return pattern.matches(regularExpression, expression);
    }
}