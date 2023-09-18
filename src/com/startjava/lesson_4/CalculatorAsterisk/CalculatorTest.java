package com.startjava.lesson_4.CalculatorAsterisk;

import java.util.Scanner;

public class CalculatorTest {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1. Модифицируйте программу “Калькулятор” (задание с *).");
        
        int num1;
        char arithOperSymbol;
        int num2;
        double res = 0.0;
        
            do {
                String[] splittedMathExpr = CalculatorTest.enterMathExp();

                num1 = Integer.parseInt(splittedMathExpr[0]);
                arithOperSymbol = (splittedMathExpr[1].toCharArray())[0];
                num2 = Integer.parseInt(splittedMathExpr[2]);
                
                try {
                    res = Calculator.calculate(num1, arithOperSymbol, num2);
                } catch (RuntimeException ex) {
                    ex.printStackTrace();
                    System.out.println(ex.getClass().getName());
                }
               
                if (res < (int) Double.MIN_VALUE) {
                        String s = (result - Math.floor(res) == 0.0) ? "%d %c %d = %f\n" : "%d %c %d = %.3f\n";
                        System.out.printf(s, num1, arithOperSymbol, num2, result);
                }
            } while (res < (int) Double.MIN_VALUE);
    }

    private static String[] enterMathExp() {
        String mathExpr = null;
        int length = 0;
        String[] splittedMathExpr = new String[3];
        
        do {
            System.out.println("Нужно вводить натуральные числа.");
            System.out.print("Введите математическое выражение: ");

            mathExpr = scanner.nextLine();
            length = mathExpression.length();
            splittedMathExpr = mathExpr.split(" ");
        } while (Integer.parseInt(splittedMathExpr[0]) <= 0 || Integer.parseInt(splittedMathExpr[2]) <= 0);
        
        System.out.printf("Длина математического выражения: %d\n", length);

        return splittedMathExpr;
    }
}