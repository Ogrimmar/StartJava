package com.startjava.lesson_2;

import java.util.Scanner;

public class CalculatorTest {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1. Модифицируйте программу “Калькулятор”.");

        Calculator calc = new Calculator();
        String answer = "";
        int result;
        do {
            System.out.print("Введите первое число: ");
            int num1 = scanner.nextInt();

            System.out.print("Введите знак математической операции (+, -, *, ^, /, %): ");
            char mathSign = scanner.next().charAt(0);

            System.out.print("Введите второе число: ");
            int num2 = scanner.nextInt();

            result = calc.calculate(num1, mathSign, num2);
            System.out.println("Результат - " + result);

            do {
                System.out.print("Хотите продолжить вычисления? [yes / no]: ");
                answer = scanner.nextLine();
            } while (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no"));
        } while (answer.equalsIgnoreCase("yes"));
    }
}