package com.startjava.lesson_4.Calculator;

import java.util.Scanner;

public class CalculatorTest {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1. Модифицируйте программу \"Калькулятор\".");

        String answer = "";
        Calculator calc = new Calculator();
        double result = 0.0;
        int num1;
        char mathSign;
        int num2;
        do {
            String[] mathExpr = CalculatorTest.enterMathExp();
            num1 = Integer.parseInt(mathExpr[0]);
            mathSign = (mathExpr[1].toCharArray())[0];
            num2 = Integer.parseInt(mathExpr[2]);
            result = calc.calculate(num1, mathSign, num2);

            if (result < Double.MIN_VALUE) {
                if (result - Math.floor(result) == 0.000) {
                    System.out.printf("%d " + mathSign + " %d = %f\n", num1, num2, result);
                } else {
                    System.out.printf("%d " + mathSign + " %d = %.3f\n", num1, num2, result);
                }
            }

            System.out.print("Хотите продолжить вычисления? [yes / no]: ");
            answer = scanner.next().trim().toLowerCase();
            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.print("Введите корректный ответ [yes / no]: ");
                answer = scanner.nextLine().trim().toLowerCase();
            }

            System.out.println();
        } while (answer.equals("yes"));
    }

    private static String[] enterMathExp() {
        String[] mathExpr = new String[3];
        System.out.print("Введите математическое выражение: ");
        mathExpr = scanner.nextLine().split(" ");

        return mathExpr;
    }
}