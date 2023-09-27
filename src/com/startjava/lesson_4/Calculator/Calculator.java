package com.startjava.lesson_4.Calculator;

public class Calculator {

    public double calculate(int num1, char mathSign, int num2) {
        int result = 0;

        switch (mathSign) {
            case '+': 
                result = num1 + num2;

                break;
            case '-': 
                result = num1 - num2;

                break;
            case '*':
                result = num1 * num2;

                break;
            case '^': 
                result = (int) Math.pow(num1, num2);

                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    return Double.MIN_VALUE;
                }

                break;
            case '%':
                result = num1 % num2;

                break; 
            default:
                System.out.println("Ошибка: знак " + "'" + mathSign + "'" + " не поддерживается.");

                return Double.MIN_VALUE;
        }

        return (double) result;
    }
}