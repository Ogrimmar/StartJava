package com.startjava.lesson_1;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("1. Калькулятор.");

        int num1 = 91;
        int num2 = 3;
        char arithOperSymbol = '+';

        doMathOperation(num1, num2, arithOperSymbol);
    }

    private static void doMathOperation(int num1, int num2, char arithOperSymbol) {
        boolean isArithOperWrong = true;
        int result = 0;

        if (arithOperSymbol == '+') {
            result = num1 + num2;
        } else if (arithOperSymbol == '-') {
            result = num1 - num2;
        } else if (arithOperSymbol == '^') {
            result = 1;

            for (int i = 0; i < num2; i++) {
                result *= num1;
            }
        } else if (arithOperSymbol == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                result = Integer.MIN_VALUE;
            }
        } else if (arithOperSymbol == '%') {
            result = num1 % num2;
        } else {
            isArithOperWrong = false;
        }
            
        if (isArithOperWrong || result != Integer.MIN_VALUE) {
            System.out.println(num1 + " " + arithOperSymbol + " " + num2 + " = " + result);
        } else {
            System.out.println("Некорректно выбраны целые числа.");
        }
    }
}