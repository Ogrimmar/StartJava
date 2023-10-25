package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        System.out.println("1. Модифицируйте программу \"Калькулятор\".");

        int result = 0;
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in, "cp866");
        String answer = "yes";
        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                System.out.print("Введите первое число: ");
                int num1 = scanner.nextInt();

                System.out.print("Введите знак математической операции (+, -, *, ^, /, %): ");
                char mathSign = scanner.next().trim().charAt(0);

                System.out.print("Введите второе число: ");
                int num2 = scanner.nextInt();

                result = calculator.calculate(num1, mathSign, num2);
                if (result != Integer.MAX_VALUE) {
                    System.out.println("Результат: " + result);
                }
            } else {
                System.out.print("Хотите продолжить вычисления? [yes / no]: ");
                answer = scanner.next().trim().toLowerCase();
                scanner.nextLine();
                System.out.println();
            }
        }
    }
}