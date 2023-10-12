package com.startjava.lesson_4.calculator.asterisk;

import java.util.Scanner;

public class CalculatorTest {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1. Модифицируйте программу \"Калькулятор\" (задание с *).");

        String answer = "";
        double result = 0.0;
        int num1;
        char mathSign;
        int num2;
        do {
            String[] splittedMathExpr = CalculatorTest.enterMathExp();
            num1 = Integer.parseInt(splittedMathExpr[0]);
            mathSign = (splittedMathExpr[1].toCharArray())[0];
            num2 = Integer.parseInt(splittedMathExpr[2]);

            try {
                result = Calculator.calculate(num1, mathSign, num2);
            } catch (RuntimeException ex) {
                System.out.println(ex.getClass().getName());
            }

            if (result < Double.MIN_VALUE) {
                String s = (result - Math.floor(result) == 0.0) ? "%d %c %d = %f\n" : "%d %c %d = %.3f\n";
                System.out.printf(s, num1, mathSign, num2, result);
            }

            System.out.print("Хотите продолжить вычисления? [yes / no]: ");
            answer = scanner.next().trim().toLowerCase();
            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.print("Введите корректный ответ [yes / no]: ");
                answer = scanner.next().trim().toLowerCase();
            }
            System.out.println();
        } while (answer.equals("yes"));
    }

    private static String[] enterMathExp() {
        String mathExpr = null;
        int length = 0;
        String[] splittedMathExpr = new String[3];
        do {
            System.out.println("Нужно вводить натуральные числа.");
            System.out.print("Введите математическое выражение: ");
            mathExpr = scanner.nextLine();
            length = mathExpr.length();
            splittedMathExpr = mathExpr.split(" ");
        } while (Integer.parseInt(splittedMathExpr[0]) <= 0 || Integer.parseInt(splittedMathExpr[2]) <= 0);
        System.out.println("Длина математического выражения: " + length);

        return splittedMathExpr;
    }
}