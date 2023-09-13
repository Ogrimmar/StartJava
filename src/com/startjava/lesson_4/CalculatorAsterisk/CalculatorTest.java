package com.startjava.lesson_4.CalculatorAsterisk;

import java.util.Scanner;

public class CalculatorTest {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1. Модифицируйте программу “Калькулятор” (задание с *).");
        
        int num1;
        char operationSymbol;
        int num2;
        double result = 0.0D;
        
            do {
                String[] splittedMathExpression = CalculatorTest.enterMathExp();

                num1 = Integer.parseInt(splittedMathExpression[0]);
                operationSymbol = (splittedMathExpression[1].toCharArray())[0];
                num2 = Integer.parseInt(splittedMathExpression[2]);
                
                try {
                    result = Calculator.calculate(num1, operationSymbol, num2);
                } catch (RuntimeException ex) {
                    ex.printStackTrace();
                    System.out.println(ex.getClass().getName());
                }
               
                if (result < (int) Double.MIN_VALUE) {
                        String s = (result - Math.floor(result) == 0.0D) ? "%d %c %d = %f\n" : "%d %c %d = %.3f\n";
                        System.out.printf(s, num1, operationSymbol, num2, result);
                }
            } while (result < (int) Double.MIN_VALUE);
    }

    private static String[] enterMathExp() {
        String mathExpression = null;
        int length = 0;
        String[] splittedMathExpression = new String[3];
        
        do {
            System.out.println("Нужно вводить натуральные числа.");
            System.out.print("Введите математическое выражение: ");
            mathExpression = scanner.nextLine();
            length = mathExpression.length();
            splittedMathExpression = mathExpression.split(" ");
        } while (Integer.parseInt(splittedMathExpression[0]) <= 0 || Integer.parseInt(splittedMathExpression[2]) <= 0);
        
        System.out.printf("Длина математического выражения: %d\n", length);

        return splittedMathExpression;
    }
}