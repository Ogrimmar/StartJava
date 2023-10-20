package com.startjava.lesson_4.calculator.common;

import java.util.regex.Pattern;

class Calculator {

    public double calculate(String expression) {
        if (isValid(expression)) {
            String[] elements = expression.split(" ");
            int num1 = Integer.parseInt(elements[0]);
            char mathSign = elements[1].charAt(0);
            int num2 = Integer.parseInt(elements[2]);
            switch (mathSign) {
                case '+': return num1 + num2;
                case '-': return num1 - num2;
                case '*': return num1 * num2;
                case '^': return Math.pow(num1, num2);
                case '/':
                    if (num2 != 0) {
                        return num1 / num2;
                    }
                    break;
                case '%': return num1 % num2;
                default: System.out.println("Ошибка: знак " + "'" + mathSign + "'" + " не поддерживается.\n");
            }
        }

        return Double.MIN_VALUE;
    }

    private boolean isValid(String expression) {
        String regexp = "\\d{1,19}\\s.\\s\\d{1,19}";
        Pattern pattern = Pattern.compile(regexp);
        return pattern.matches(regexp, expression);
    }
}