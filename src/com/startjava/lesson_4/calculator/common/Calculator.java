package com.startjava.lesson_4.calculator.common;

class Calculator {

    public double calculate(int num1, char mathSign, int num2) {
        double result = Double.MIN_VALUE;

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
                result = Math.pow(num1, num2);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                }
                break;
            case '%':
                result = num1 % num2;
                break; 
            default:
                System.out.println("Ошибка: знак " + "'" + mathSign + "'" + " не поддерживается.");
        }

        return result;
    }
}