package com.startjava.lesson_1;

public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера.");
        byte processors = 4;
        short volumeOfRAM = 8;
        int volumeOfSSD = 256;
        long volumeOfVideoCard = 4;
        float coreFrequency = 1.60F;
        double physicalMemory = 7.78D;
        char iSymbol = 'i';
        boolean isFirewallOff = true;

        System.out.printf("Число процессоров на ноутбуке: %d\n", processors);
        System.out.printf("Объём оперативной памяти на ноутбуке на ноутбуке: %d Gb\n", volumeOfRAM);
        System.out.printf("Объём SSD на ноутбуке: %d Gb\n", volumeOfSSD);
        System.out.printf("Объём памяти видеокарты на ноутбуке: %d Gb\n", volumeOfVideoCard);
        System.out.printf("Объём оперативной памяти на ноутбуке: %d GB\n", volumeOfRAM);
        System.out.printf("Частота процессора на ноутбуке: %.2f GHz\n", coreFrequency);
        System.out.printf("Объём физической памяти на ноутбуке: %.2f GB\n", physicalMemory);
        System.out.printf("Модель процессора на ноутбуке: Intel %c5\n", iSymbol);
        System.out.printf("Отключён ли Firewall на ноутбуке? %b\n", isFirewallOff);
        System.out.println();

        System.out.println("2. Расчёт стоимости товара со скидкой.");
        short penPrice = 100;
        short bookPrice = 200;
        short totalSum = (short) (penPrice + bookPrice);
        double discountSum = (penPrice + bookPrice) * 0.11;
        double totalDiscountedSum = (penPrice + bookPrice) * (1.00 - 0.89);

        System.out.printf("Общая стоимость товаров без скидки: %d рублей\n", totalSum);
        System.out.printf("Сумма скидки: %.1f\n", discountSum);
        System.out.printf("Общая стоимость товаров со скидкой: %.1f рублей\n", totalDiscountedSum);
        System.out.println();

        System.out.println("3. Вывод слова JAVA.");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");
        System.out.println();

        System.out.println("4. Вывод min и max значений целых числовых типов.");
        byte numberOfBookcases = 127;
        short numberOfBookshelves = 32_767;
        int numberOfRooms = 2_147_483_647;
        long dailyProfit = 9_223_372_036_854_775_807L;

        System.out.printf("Первоначальное значение: %d\n", numberOfBookcases);
        System.out.printf("Значение после инкремента на единицу: %d\n", ++numberOfBookcases);
        System.out.printf("Значение после декремента на единицу: %d\n", --numberOfBookcases);
        System.out.printf("Первоначальное значение: %d\n", numberOfBookshelves);
        System.out.printf("Значение после инкремента на единицу: %d\n", ++numberOfBookshelves);
        System.out.printf("Значение после декремента на единицу: %d\n", --numberOfBookshelves);
        System.out.printf("Значение после инкремента на единицу: %d\n", ++numberOfRooms);
        System.out.printf("Значение после декремента на единицу: %d\n", --numberOfRooms);
        System.out.printf("Первоначальное значение: %d\n", dailyProfit);
        System.out.printf("Значение после инкремента на единицу: %d\n", ++dailyProfit);
        System.out.printf("Значение после декремента на единицу: %d\n", --dailyProfit);
        System.out.println();

        System.out.println("5. Перестановка значений переменных.");
        int num1 = 2;
        int num2 = 5;

        System.out.println("Перестановка значений переменных при помощи вспомогательной переменной.");
        System.out.printf("Исходные значения переменных num1 и num2 соответственно: num1 = %d, num2 = %d\n", num1, num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.printf("Конечные значения переменных num1 и num2 соответственно: num1 = %d, num2 = %d\n", num1, num2);
        System.out.println();
        
        System.out.println("Перестановка значений переменных при помощи арифметических операций.");
        System.out.printf("Исходные значения переменных num1 и num2 соответственно: num1 = %d, num2 = %d\n", num1, num2);
        num1 +=num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.printf("Конечные значения переменных num1 и num2 соответственно: num1 = %d, num2 = %d\n", num1, num2);
        System.out.println();
        
        System.out.println("Перестановка значений переменных при помощи побитовых операций.");
        System.out.printf("Исходные значения переменных num1 и num2 соответственно: num1 = %d, num2 = %d\n", num1, num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.printf("Конечные значения переменных num1 и num2 соответственно: num1 = %d, num2 = %d\n", num1, num2);
        System.out.println();

        System.out.println("6. Вывод символов и их кодов.");
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
        System.out.println();

        System.out.println("7. Вывод в консоль ASCII-арт Дюка.");
        char slash = '/';
        char reversedSlash = '\\';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        char undrscrSym = '_';

        System.out.println("    " + slash + reversedSlash + "    ");
        System.out.println("   " + slash + "  " + reversedSlash + "  ");
        System.out.println("  " + slash + undrscrSym + leftParenthesis + " " + rightParenthesis + reversedSlash);
        System.out.println(" " + slash + "      " + reversedSlash + " ");
        System.out.println("" + slash + undrscrSym + undrscrSym + undrscrSym +  undrscrSym + slash + reversedSlash + undrscrSym + undrscrSym  
           + reversedSlash);
        System.out.println();

        System.out.println("8. Вывод количества сотен, десятков и единиц числа.");
        int N = 123;
        System.out.printf("Число N = %d содержит\n  %d сотен\n  %d десятков\n  %d единиц\n", N, N / 100, N / 10, N % 10);
        
        int digitsMultiplication = ((N / 100) % 10) * ((N / 10) % 10) * (N % 10);
        int digitsSum = ((N / 100) % 10) + ((N / 10) % 10) + (N % 10);
        System.out.printf("Сумма его цифр = %d\n", digitsSum);
        System.out.printf("Произведение его цифр = %d\n", digitsMultiplication);
        System.out.println();

        System.out.println("9. Вывод времени.");
        int seconds = 86399;
        
        System.out.printf("%d:%d:%d", (seconds / 3600) % 24, (seconds / 60) % 60, (seconds - seconds / 3600 - seconds / 60) % 60);
    }
}