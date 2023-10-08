import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        System.out.println("1. Модифицируйте программу \"Калькулятор\".");

        String answer = "";
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        do {
            System.out.print("Введите первое число: ");
            int num1 = scanner.nextInt();

            System.out.print("Введите знак математической операции (+, -, *, ^, /, %): ");
            char mathSign = scanner.next().charAt(0);

            System.out.print("Введите второе число: ");
            int num2 = scanner.nextInt();

            result = calc.calculate(num1, mathSign, num2);
            if (result != Integer.MAX_VALUE) {
                System.out.println("Результат: " + result);
            }

            System.out.print("Хотите продолжить вычисления? [yes / no]: ");
            answer = scanner.nextLine().toLowerCase();
            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.print("Введите корректный ответ [yes / no]: ");
                answer = scanner.nextLine().toLowerCase();
            }

            System.out.println();
        } while (answer.equals("yes"));
    }
}