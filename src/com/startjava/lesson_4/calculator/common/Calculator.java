package com.startjava.lesson_4.calculator.common;

class Calculator {

    public double calculate(String[] expression) {
        int num1 = Integer.parseInt(expression[0]);
        char mathSign = (expression[1].toCharArray())[0];
        int num2 = Integer.parseInt(expression[2]);

        switch (mathSign) {
            case '+': 
                return num1 + num2;
            case '-': 
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '^': 
                return Math.pow(num1, num2);
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                }
                return Double.MIN_VALUE;
            case '%':
                return num1 % num2;
            default:
                System.out.println("Ошибка: знак " + "'" + mathSign + "'" + " не поддерживается.");
        }

        return Double.MIN_VALUE;
    }
}