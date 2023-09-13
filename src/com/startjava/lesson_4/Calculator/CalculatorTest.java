package com.startjava.lesson_4.Calculator;

import java.util.Scanner;

public class CalculatorTest {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1. Модифицируйте программу “Калькулятор”.");
        
        int num1;
        char operationSymbol;
        int num2;
        double result = 0.0D;
        Calculator calc = new Calculator();

        do {
            String[] mathExpression = CalculatorTest.enterMathExp();

            num1 = Integer.parseInt(mathExpression[0]);
            operationSymbol = (mathExpression[1].toCharArray())[0];
            num2 = Integer.parseInt(mathExpression[2]);

            result = calc.calculate(num1, operationSymbol, num2);
            
            if (result < Double.MIN_VALUE) {
                if (result - Math.floor(result) == 0.0D) {
                    System.out.printf("%d " + operationSymbol + " %d = %f\n", num1, num2, result);
                } else {
                    System.out.printf("%d " + operationSymbol + " %d = %.3f\n", num1, num2, result);
                }
            }
        } while (result < Double.MIN_VALUE);
    }

    private static String[] enterMathExp() {
        String[] mathExpression = new String[3];

        System.out.print("Введите математическое выражение: ");
        mathExpression = (scanner.nextLine()).split(" ");

        return mathExpression;
    }
}