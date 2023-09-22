package com.startjava.lesson_2;

import java.util.Scanner;

public class Calculator {

    private static final Scanner scanner = new Scanner(System.in);
    
    public String calculate(int num1, char arithOperSymbol, int num2) {
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
                res = 1;

                for (int i = 0; i < num2; i++) {
                    res *= num1;
                }

                res = 0;

                break;
            case '/':
                if (num2 != 0) {
                    res = num1 / num2;
                } else {
                    res = Integer.MIN_VALUE;
                }

                break;
            case '%':
                res = num1 % num2;
                
                break;
            default:
                System.out.println("Арифметическая операция не поддерживается");
        }
        
        System.out.println("Результат: " + res + "\n");

        String answer = null;
        do {
            System.out.print("Хотите продолжить вычисления? [yes / no]: ");

            answer = scanner.nextLine();
        } while (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no"));

        return answer;
    }
}