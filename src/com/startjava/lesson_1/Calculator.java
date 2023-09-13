package com.startjava.lesson_1;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("1. Калькулятор.");

        int num1 = 91;
        int num2 = 3;
        char operationSymbol = '+';

        doMathOperation(num1, num2, operationSymbol);
    }

    private static void doMathOperation(int num1, int num2, char operationSymbol) {
        boolean isSignWrong = true;
        int result = 0;

        if (operationSymbol == '+') {
            result = num1 + num2;
        } else if (operationSymbol == '-') {
            result = num1 - num2;
        } else if (operationSymbol == '^') {
            result = 1;

            for (int i = 0; i < num2; i++) {
                result *= num1;
            }
        } else if (operationSymbol == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                result = Integer.MIN_VALUE;
            }
        } else if (operationSymbol == '%') {
            result = num1 % num2;
        } else {
            isSignWrong = false;
        }
            
        if (isSignWrong || result != Integer.MIN_VALUE) {
            System.out.println("" + num1 + " " + operationSymbol + " " + num2 + " = " + "" + result);
        } else {
            System.out.println("Некорректно выбраны целые числа.");
        }
    }
}