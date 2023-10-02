package com.startjava.lesson_2;

import java.util.Scanner;

public class Calculator {

    private static final Scanner scanner = new Scanner(System.in);

    public int calculate(int num1, char mathSign, int num2) {
        int result = Integer.MAX_VALUE;

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
                result = 1;
                for (int i = 0; i < num2; i++) {
                    result *= num1;
                }
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("На 0 делить нельзя!");
                }
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("Арифметический знак " + "'" + mathSign + "'" + 
                        " не поддерживается.");
        }

        System.out.println("Результат: "+ num1 + " " + mathSign + " " + num2 + " = " + result);

        return result;
    }
}