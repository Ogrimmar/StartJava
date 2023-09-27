package com.startjava.lesson_1;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("1. Калькулятор.");

        int num1 = 91;
        int num2 = 3;
        char mathSign = '+';
        System.out.println("Первое число - " + "'" + num1 + "'" + 
                "\nВторое число - " + "'" + num2 + "'" +
                "\nАрифметический знак - " + "'" + mathSign + "'");

        calculate(num1, num2, mathSign);
    }

    private static void calculate(int num1, int num2, char mathSign) {
        int result = 0;

        if (mathSign == '+') {
            result = num1 + num2;
        } else if (mathSign == '-') {
            result = num1 - num2;
        } else if (mathSign == '^') {
            result = 1;
            for (int i = 0; i < num2; i++) {
                result *= num1;
            }
        } else if (mathSign == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("На 0 делить нельзя!");
                return;
            }
        } else if (mathSign == '%') {
            result = num1 % num2;
        } else {
            System.out.println("Арифметический знак " + "'" + mathSign + "'" + " не поддерживается.");
            return;
        }

        System.out.println("Результат: "+ num1 + " " + mathSign + " " + num2 + " = " + result);
    }
}