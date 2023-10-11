package com.startjava.lesson_4.calculator.asterisk;

class Calculator {

    public static double calculate(int num1, char mathSign, int num2) throws RuntimeException {
        double result = switch (mathSign) {
            case '+': yield (num1 + num2);
            case '-': yield (num1 - num2);
            case '*': yield (num1 * num2);
            case '^': yield Math.pow(num1, num2);
            case '/': yield (num1 / num2);
            case '%': yield (num1 % num2);
            default: throw new RuntimeException("Ошибка: знак " + "'" + mathSign + "'" + " не поддерживается.\n");
        };

        return result;
    }
}