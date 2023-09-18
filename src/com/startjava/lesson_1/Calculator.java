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
        int res = 0;

        if (arithOperSymbol == '+') {
            res = num1 + num2;
        } else if (arithOperSymbol == '-') {
            res = num1 - num2;
        } else if (arithOperSymbol == '^') {
            res = 1;

            for (int i = 0; i < num2; i++) {
                res *= num1;
            }
        } else if (arithOperSymbol == '/') {
            if (num2 != 0) {
                res = num1 / num2;
            } else {
                res = Integer.MIN_VALUE;
            }
        } else if (arithOperSymbol == '%') {
            res = num1 % num2;
        } else {
            isArithOperWrong = false;
        }
            
        if (isArithOperWrong || res != Integer.MIN_VALUE) {
            System.out.println("" + num1 + " " + arithOperSymbol + " " + num2 + " = " + "" + res);
        } else {
            System.out.println("Некорректно выбраны целые числа.");
        }
    }
}