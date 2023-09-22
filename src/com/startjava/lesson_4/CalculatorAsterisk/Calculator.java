package com.startjava.lesson_4.CalculatorAsterisk;

public class Calculator {

    public static double calculate(int num1, char arithOperSymbol, int num2) throws RuntimeException {
            int result = switch (arithOperSymbol) {
                case '+': yield (num1 + num2);
                case '-': yield (num1 - num2);
                case '*': yield (num1 * num2);
                case '^': yield (int) (Math.pow(num1, num2));
                case '/': yield (num1 / num2);
                case '%': yield (num1 % num2);
                default: throw new RuntimeException("Ошибка: знак " + arithOperSymbol + " не поддерживается.\n");
            };

        return (double) result;
    }
}