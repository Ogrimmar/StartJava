package com.startjava.lesson_2;

import java.util.Scanner;

public class Calculator {

    private static final Scanner scanner = new Scanner(System.in);
    
    public String calculate(int num1, char operationSymbol, int num2) {
        int result = 0;

        switch (operationSymbol) {
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

                result = 0;

                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    result = Integer.MIN_VALUE;
                }

                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("Арифметическая операция не поддерживается.");
        }
        
        System.out.printf("Результат: %d\n", result);
        System.out.println();
        
        String answer = null;
        do {
            System.out.print("Хотите продолжить вычисления? [yes / no]: ");

            answer = scanner.nextLine();
        } while (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no"));

        return answer;
    }
}