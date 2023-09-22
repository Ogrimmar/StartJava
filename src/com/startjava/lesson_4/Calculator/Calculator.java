package com.startjava.lesson_4.Calculator;

public class Calculator {
    
    public double calculate(int num1, char arithOperSymbol, int num2) {
        int res = 0;

        switch (arithOperSymbol) {
            case '+': 
                res = num1 + num2;

                break;
            case '-': 
                res = num1 - num2;

                break;
            case '*':
                res = num1 * num2;

                break;
            case '^': 
                Math.pow(num1, num2);

                break;
            case '/':
                if (num2 != 0) {
                    res = num1 / num2;
                } else {
                    return Double.MIN_VALUE;
                }

                break;
            case '%':
                res = num1 % num2;
                
                break; 
            default:
                System.out.println("Ошибка: знак " + "'" + arithOperSymbol + "'" + " не поддерживается.");

                return Double.MIN_VALUE;
        }

        return (double) res;
    }
}