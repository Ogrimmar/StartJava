package com.startjava.lesson_2;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        System.out.println("1. Модифицируйте программу “Калькулятор”.");

        String answer = "";
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Введите первое число: ");
            int num1 = scanner.nextInt();

            System.out.print("Введите знак математической операции (+, -, *, ^, /, %): ");
            char mathSign = scanner.next().charAt(0);

            System.out.print("Введите второе число: ");
            int num2 = scanner.nextInt();

            int result = calc.calculate(num1, mathSign, num2);
            if (result != Integer.MAX_VALUE) {
                System.out.println("Результат - " + result);
            }

            do {
                System.out.print("Хотите продолжить вычисления? [yes / no]: ");
                answer = scanner.nextLine().toLowerCase();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}