package com.startjava.lesson_1;

public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера.");

        byte countCpus = 4;
        short ramVolume = 8;
        int ssdVolume = 256;
        long videoCardVolume = 4L;
        float coreFreq = 1.60F;
        double physMemory = 7.78;
        char iSymbol = 'i';
        boolean isFirewallOff = true;

        System.out.println("Число процессоров на ноутбуке: " + countCpus);
        System.out.println("Объём RAM на ноутбуке: " + ramVolume + "Gb.");
        System.out.println("Объём SSD на ноутбуке: " + ssdVolume + "Gb.");
        System.out.println("Объём памяти видеокарты на ноутбуке: " + videoCardVolume + "Gb.");
        System.out.println("Частота каждого из процессоров на ноутбуке: " + coreFreq + "GHz.");
        System.out.println("Объём физической памяти на ноутбуке: " + physMemory + "Gb.");
        System.out.println("Модель процессора на ноутбуке: Intel " + iSymbol + "5.");
        System.out.println("Отключён ли Firewall на ноутбуке? " + isFirewallOff);

        System.out.println("\n2. Расчёт стоимости товара со скидкой.");

        int penPrice = 100;
        int bookPrice = 200;
        int totalSum = penPrice + bookPrice;
        double discountSum = totalSum * 0.11;
        double discountPrice = totalSum - discountSum;

        System.out.println("Стоимость товаров без скидки: " + totalSum + " рублей.");
        System.out.println("Сумма скидки: " + discountSum + " рублей.");
        System.out.println("Стоимость товаров со скидкой: " + discountPrice + " рублей.");

        System.out.println("\n3. Вывод слова JAVA.");

        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов.");

        byte maxByte = 127;
        short maxShort = 32_767;
        int maxInt = 2_147_483_647;
        long maxLong = 9_223_372_036_854_775_807L;
        System.out.println("maxByte: " + maxByte);
        System.out.println("++maxByte: " + (++maxByte));
        System.out.println("--maxByte: " + (--maxByte));
        System.out.println("maxShort: " + maxShort);
        System.out.println("++maxShort: " + (++maxShort));
        System.out.println("--maxShort: " + (--maxShort));
        System.out.println("maxInt: " + maxInt);
        System.out.println("++maxInt: " + (++maxInt));
        System.out.println("--maxInt: " + (--maxInt));
        System.out.println("maxLong: " + maxLong);
        System.out.println("++maxLong: " + (++maxLong));
        System.out.println("--maxLong: " + (--maxLong));

        System.out.println("\n5. Перестановка значений переменных.");

        int num1 = 2;
        int num2 = 5;
        System.out.println("Исходные значения 'num1' = 2, 'num2' = 5");

        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Конечные значения 'num1' = " + num1 + ", 'num2' = " + num2 + " после " +
                "перестановки.\n");

        System.out.println("Исходные значения 'num1' = 2, 'num2' = 5");
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("Конечные значения 'num1' = " + num1 + ", 'num2' = " + num2 + " после " +
                " арифметических операций.\n");

        System.out.println("Исходные значения 'num1' = 2, 'num2' = 5");
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("Конечные значения 'num1' = " + num1 + ", 'num2' = " + num2 + " после " +
                "побитовых операций.\n");

        System.out.println("\n6. Вывод символов и их кодов.");

        char dollarSign = '$';
        char asterisk = '*';
        char commercialA = '@';
        char pipeline = '|';
        char tilda = '~';

        System.out.println("Код символа " + dollarSign + " - " + (int) dollarSign);
        System.out.println("Код символа " + asterisk + " - " + (int) asterisk);
        System.out.println("Код символа " + commercialA + " - " + (int) commercialA);
        System.out.println("Код символа " + pipeline + " - " + (int) pipeline);
        System.out.println("Код символа " + tilda + " - " + (int) tilda);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка.");

        char slash = '/';
        char backlslash = '\\';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        char underscore = '_';

        System.out.println("    " + slash + backlslash);
        System.out.println("   " + slash + "  " + backlslash);
        System.out.println("  " + slash + underscore + leftParenthesis + " " + rightParenthesis + 
                backlslash);
        System.out.println(" " + slash + "      " + backlslash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash + 
                backlslash + underscore + underscore + backlslash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа.");

        int srcNumber = 123;
        int hundreds = srcNumber / 100;
        int tens = (srcNumber % 100) / 10;
        int units = srcNumber % 10;
        System.out.println("Число srcNumber = " + srcNumber + " содержит\n" +
                hundreds + " сотен\n" +
                tens + " десятков\n" +
                units + " единиц");

        int multiplicationDigits = hundreds * tens * units;
        int sumDigits = hundreds + tens + units;
        System.out.println("Сумма его цифр = " + sumDigits);
        System.out.println("Произведение его цифр = " + multiplicationDigits);

        System.out.println("\n9. Вывод времени.");

        int timeInSeconds = 86399;
        int hours = (timeInSeconds / 3600) % 24;
        int minutes = (timeInSeconds / 60) % 60;
        int seconds = timeInSeconds % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}