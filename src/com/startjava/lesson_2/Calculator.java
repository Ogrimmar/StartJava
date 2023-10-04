package com.startjava.lesson_2;

public class Calculator {

    public int calculate(int num1, char mathSign, int num2) {
        int result = Integer.MAX_VALUE;

        switch (mathSign) {
            case '+': 
                return num1 + num2;
            case '-': 
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '^': 
                result = 1;
                for (int i = 0; i < num2; i++) {
                    result *= num1;
                }
                return result;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("На 0 делить нельзя!");
                }
            case '%':
                return num1 % num2;
            default:
                System.out.println("Арифметический знак " + "'" + mathSign + "'" + 
                        " не поддерживается.");
        }

        return result;
    }
}