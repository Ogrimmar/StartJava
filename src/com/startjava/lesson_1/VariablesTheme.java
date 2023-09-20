package com.startjava.lesson_1;

public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера.");

        byte procs = 4;
        short ramVol = 8;
        int ssdVol = 256;
        long videoCardVol = 4;
        float coreFreq = 1.60F;
        double physMem = 7.78;
        char iSymbol = 'i';
        boolean isFirewallOff = true;

        System.out.printf("Число процессоров на ноутбуке: %d\n", procs);
        System.out.printf("Объём оперативной памяти на ноутбуке на ноутбуке: %d Gb\n", ramVol);
        System.out.printf("Объём SSD на ноутбуке: %d Gb\n", ssdVol);
        System.out.printf("Объём памяти видеокарты на ноутбуке: %d Gb\n", videoCardVol);
        System.out.printf("Объём оперативной памяти на ноутбуке: %d GB\n", ramVol);
        System.out.printf("Частота процессора на ноутбуке: %.2f GHz\n", coreFreq);
        System.out.printf("Объём физической памяти на ноутбуке: %.2f GB\n", physMem);
        System.out.printf("Модель процессора на ноутбуке: Intel %c5\n", iSymbol);
        System.out.printf("Отключён ли Firewall на ноутбуке? %b\n", isFirewallOff);

        System.out.println("\n" + "2. Расчёт стоимости товара со скидкой.");

        int penPrice = 100;
        int bookPrice = 200;
        int totalSum = penPrice + bookPrice;
        double discountSum = totalSum * 0.11;
        double discountPrice = totalSum - discountSum;

        System.out.printf("Стоимость товаров без скидки: %d рублей\n", totalSum);
        System.out.printf("Сумма скидки: %.1f\n", discountSum);
        System.out.printf("Стоимость товаров со скидкой: %.1f рублей\n", discountPrice);

        System.out.println("\n" + "3. Вывод слова JAVA.");

        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n" + "4. Вывод min и max значений целых числовых типов.");

        byte maxByte = 127;
        short maxShort = 32_767;
        int maxInt = 2_147_483_647;
        long maxLong = 9_223_372_036_854_775_807L;
        System.out.printf("maxByte: %d\n", maxByte);
        System.out.printf("++maxByte: %d\n", ++maxByte);
        System.out.printf("--maxByte: %d\n", --maxByte);
        System.out.printf("maxShort: %d\n", maxShort);
        System.out.printf("++maxShort: %d\n", maxShort);
        System.out.printf("--maxShort: %d\n", maxShort);
        System.out.printf("maxInt: %d\n", maxInt);
        System.out.printf("++maxInt: %d\n", maxInt);
        System.out.printf("--maxInt: %d\n", maxInt);
        System.out.printf("maxLong: %d\n", maxLong);
        System.out.printf("++maxLong: %d\n", ++maxLong);
        System.out.printf("--maxLong: %d\n", --maxLong);

        System.out.println("\n" + "5. Перестановка значений переменных.");

        int num1 = 2;
        int num2 = 5;
        System.out.printf("Исходные значения 'num1' = %d, 'num2' = %d\n", num1, num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.printf("Конечные значения 'num1' = %d, 'num2' = %d после перестановки.\n", num1, num2);
        System.out.println();

        System.out.printf("Исходные значения 'num1' = %d, 'num2' = %d\n", num1, num2);
        num1 +=num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.printf("Конечные значения 'num1' = %d, 'num2' = %d после арифметических операций.\n",num1, num2);
        System.out.println();

        System.out.printf("Исходные значения 'num1' = %d, 'num2' = %d\n", num1, num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.printf("Конечные значения 'num1' = %d, 'num2' = %d после побитовых операций:\n",num1, num2);

        System.out.println("\n" + "6. Вывод символов и их кодов.");

        char dollarSign = '$';
        char asterisk = '*';
        char commercialA = '@';
        char pipeline = '|';
        char tilda = '~';

        System.out.printf("Код символа %c - %d\n", dollarSign, (int) dollarSign);
        System.out.printf("Код символа %c - %d\n", asterisk, (int) asterisk);
        System.out.printf("Код символа %c - %d\n", commercialA, (int) commercialA);
        System.out.printf("Код символа %c - %d\n", pipeline, (int) pipeline);
        System.out.printf("Код символа %c - %d\n", tilda, (int) tilda);

        System.out.println("\n" + "7. Вывод в консоль ASCII-арт Дюка.");

        char slash = '/';
        char backlslash = '\\';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        char underscore = '_';

        System.out.println("    " + slash + backlslash + "    ");
        System.out.println("   " + slash + "  " + backlslash + "  ");
        System.out.println("  " + slash + underscore + leftParenthesis + " " + rightParenthesis + backlslash);
        System.out.println(" " + slash + "      " + backlslash + " ");
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash + backlslash +
                underscore + underscore + backlslash);

        System.out.println("\n" + "8. Вывод количества сотен, десятков и единиц числа.");

        int srcNumber = 123;
        int hundreds = srcNumber / 100;
        int tens = srcNumber / 10;
        int units = srcNumber % 10;
        System.out.print("Число srcNumber = " + srcNumber + " содержит\n" +
                hundreds + " сотен\n" +
                tens + " десятков\n" +
                units + " единиц\n");

        int digitsMultiplication = (hundreds % 10) * (tens % 10) * units;
        int digitsSum = (hundreds % 10) + (tens % 10) + units;
        System.out.printf("Сумма его цифр = %d\n", digitsSum);
        System.out.printf("Произведение его цифр = %d\n", digitsMultiplication);

        System.out.println("\n" + "9. Вывод времени.");

        int timeInSeconds = 86399;
        int hours = (timeInSeconds / 3600) % 24;
        int minutes = (timeInSeconds / 60) % 60;
        int seconds = timeInSeconds % 60;
        System.out.printf("%d:%d:%d", hours, minutes, seconds);
    }
}