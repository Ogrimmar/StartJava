package com.startjava.lesson_4.calculator.asterisk;

class Calculator {

    public static double calculate(String[] splittedExpression) throws RuntimeException, 
        ArithmeticException {

        int num1 = Integer.parseInt(splittedExpression[0]);
        char mathSign = (splittedExpression[1].toCharArray())[0];
        int num2 = Integer.parseInt(splittedExpression[2]);

        double result = switch (mathSign) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '^' -> Math.pow(num1, num2);
            case '/' -> {
                if (num2 == 0) {
                    throw new ArithmeticException("Unable to divide by zero.");
                }
                yield num1 / num2;
            }
            case '%' -> num1 % num2;
            default -> throw new RuntimeException("Ошибка: знак " + "'" + mathSign + "'" + 
                             " не поддерживается.\n");
            };

        return result;
    }
}