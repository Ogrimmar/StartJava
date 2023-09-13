package com.startjava.lesson_2;

import java.util.Scanner;

public class CalculatorTest {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1. Модифицируйте программу “Калькулятор”.");
        
        Calculator calc = new Calculator();
        String answer = null;

        do {
            System.out.print("Введите первое число: ");
            int num1 = scanner.nextInt();

            System.out.print("Введите знак математической операции (+, -, *, ^, /, %): ");
            char operationSymbol = scanner.next().charAt(0);

            System.out.print("Введите второе число: ");
            int num2 = scanner.nextInt();

            answer = calc.calculate(num1, operationSymbol, num2);
        } while (answer.equalsIgnoreCase("yes"));
    }
}