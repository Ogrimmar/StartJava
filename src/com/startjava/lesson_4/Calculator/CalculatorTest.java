package com.startjava.lesson_4.Calculator;

import java.util.Scanner;

public class CalculatorTest {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1. Модифицируйте программу “Калькулятор”.");
        
        int num1;
        char arithOperSymbol;
        int num2;
        double res = 0.0;
        Calculator calc = new Calculator();

        do {
            String[] mathExpression = CalculatorTest.enterMathExp();

            num1 = Integer.parseInt(mathExpression[0]);
            arithOperSymbol = (mathExpression[1].toCharArray())[0];
            num2 = Integer.parseInt(mathExpression[2]);

            res = calc.calculate(num1, arithOperSymbol, num2);
            
            if (res < Double.MIN_VALUE) {
                if (res - Math.floor(res) == 0.000) {
                    System.out.printf("%d " + arithOperSymbol + " %d = %f\n", num1, num2, res);
                } else {
                    System.out.printf("%d " + arithOperSymbol + " %d = %.3f\n", num1, num2, res);
                }
            }
        } while (res < Double.MIN_VALUE);
    }

    private static String[] enterMathExp() {
        String[] mathExpr = new String[3];

        System.out.print("Введите математическое выражение: ");
        mathExpr = (scanner.nextLine()).split(" ");

        return mathExpr;
    }
}