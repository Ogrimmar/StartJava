package com.startjava.lesson_1;

public class IfElseStatementTheme {
    
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java.");
        
        int age = 70;
        if (age > 20) {
            System.out.println("Вы старше 20 лет.");
        } else {
            System.out.println("Вам не больше 20 лет.");
        }

        boolean isGenderFemale = false;
        if (!isGenderFemale) {
            System.out.println("Вы мужчина.");
        } else {
            System.out.println("Вы женщина.");
        }

        double height = 1.80D;
        if (height < 1.80D) {
            System.out.println("Вы ниже 1.80 метров");
        } else {
            System.out.println("Вы не ниже 1.80 метров.");
        }

        char firstNameLetter = "Alexander".charAt(0);
        if (firstNameLetter == 'M') {
            System.out.println("Ваше имя начинается с буквы M.");
        } else if (firstNameLetter == 'I') {
            System.out.println("Ваше имя начинается с буквы I.");
        } else {
            System.out.println("Ваше имя не начинается с буквы 'M' или буквы 'I'.");
        }
        System.out.println();

        System.out.println("2. Поиск max и min числа.");
        
        int num1 = -100;
        int num2 = 100;
        if (num1 > num2) {
            System.out.printf("Максимальное число - это %d, а минимальное - %d.\n", num1, num2);
        } else if (num1 == num2) {
            System.out.printf("Числа равны, а значит, их максимум и минимум совпадают. Они равны %d", num1);
        } else {
            System.out.printf("Максимальное число - это %d, а минимальное - %d.\n", num2, num1);
        }
        System.out.println();

        System.out.println("3. Проверка числа.");
        
        int num = 123_456;
        if (num == 0) {
            System.out.printf("Число %d равно 0.\n", num);
        } else {
            if (num % 2 == 0) {
                System.out.printf("Число %d чётное.\n", num);
            } else {
                System.out.printf("Число %d нечётное.\n", num);
            }
            
            if (num > 0) {
                System.out.printf("Число %d положительное.\n", num);
            } else {
                System.out.printf("Число %d отрицательное.\n", num);
            }
        }
        System.out.println();

        System.out.println("4. Поиск одинаковых цифр в числах.");
        
        int num3 = 123;
        int num4 = 223;
        System.out.printf("Исходные целые трёхзначные числа: %d, %d.\n", num3, num4);

        if ((num3 / 100) == (num4 / 100)) {
            System.out.printf("У трёхзначных целых чисел %d и %d совпадают третьи разряды.\n", num1, num2); 
        } else if (((num3 / 10) % 10) == ((num4 / 10) % 10)) {
            System.out.printf("У трёхзначных целых чисел %d и %d совпадают вторые разряды.\n", num1, num2);
        } else if ((num3 % 10) == (num4 % 10)) {
            System.out.printf("У трёхзначных целых чисел %d и %d совпадают первые разряды.\n", num1, num2);
        } else {
            System.out.printf("У трёхзначных целых чисел %d и %d никакие цифры не совпадают.\n", num1, num2);
        }
        System.out.println();
        
        System.out.println("5. Определение символа по его коду.");
        char symbol = '\u0057';

        if (symbol >= 'A' && symbol <= 'Z') {
            System.out.printf("Символ %c является заглавной латинской буквой.\n", symbol);
        } else if (symbol >= 'a' && symbol <= 'z') {
            System.out.printf("Символ %c является строчной латинской буквой.\n", symbol);
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.printf("Символ %c является цифрой.\n", symbol);
        } else {
            System.out.printf("Символ %c не является ни цифрой, ни заглавной латинской буквой, ни строчной латинской буквой.\n", symbol);
        }
        System.out.println();

        System.out.println("6. Подсчёт суммы вклада и начисленных банком %.");
        
        int deposit = 301_000;
        System.out.printf("Сумма начального вклада: %d", deposit);
        if (deposit < 100_000) {
            deposit *= 1.05;
            
            System.out.println("Начисленные проценты: 5%.");
            System.out.printf("Итоговая сумма с начисленными процентами: %d\n", deposit);
        } else if (deposit >= 100_000 && deposit <= 300_000) {
            deposit *= 1.07;
            
            System.out.println("Начисленные проценты: 7%.");
            System.out.printf("Итоговая сумма с начисленными процентами: %d\n", deposit);
        } else if (deposit > 300_000) {
            deposit *= 1.1;
            
            System.out.println("Начисленные проценты: 10%.");
            System.out.printf("Итоговая сумма с начисленными процентами: %d\n", deposit);
        }
        System.out.println();

        System.out.println("7. Определение оценки по предметам.");
        
        int histRes = 59;
        int infoRes = 91;

        byte histMark, infoMark;
        if (histRes <= 60) {
            histMark = 2;
        } else if (histRes > 60 && histRes <= 73) {
            histMark = 3;
        } else if (histRes > 73 && histRes <= 91) {
            histMark = 4;
        } else {
            histMark = 5;
        }
        System.out.printf("История - %d.\n", histMark);

        if (infoRes <= 60) {
            infoMark = 2;
        } else if (infoRes > 60 && infoRes <= 73) {
            infoMark = 3;
        } else if (infoRes > 73 && infoRes <= 91) {
            infoMark = 4;
        } else {
            infoMark = 5;
        }
        System.out.printf("Информатика - %d.\n", infoMark);

        double avgPercent = (double) ((histRes + infoRes) / 2);
        double avgMark = (double) ((histMark + infoMark) / 2);
        System.out.printf("Средняя оценка за два предмета - %.2f\n", avgMark);
        System.out.printf("Средний процент за два предмета - %.2f%c\n", avgPercent, '%');
        System.out.println();

        System.out.println("8. Расчёт прибыли за год.");
        
        int hirePrice = 5_000;
        int goodsSales = 13_000;
        int costEffectiveness = 4_000;
        int profitPerMonth = 0;
        for (int i = 0; i < 12; i++) {
            if (profitPerMonth >= hirePrice) {
                profitPerMonth = goodsSales - hirePrice - costEffectiveness;
            } else {
                profitPerMonth = goodsSales - costEffectiveness;
            }
        }

        if (profitPerMonth != 0) {
            System.out.printf("Прибыль составила %(d рублей.\n", profitPerMonth);
        } else {
            System.out.println("Прибыль составила 0 рублей.");
        }
        System.out.println();

        System.out.println("9. Подсчёт количества банкнот.");
        int totalSum = 567;
        int currentSum = totalSum;
        int hundredBanknotesAmount = 10;
        int fiveBanknotesAmount = 5;
        int singleBanknotesAmount = 50;
        int banknotesAmount = hundredBanknotesAmount + fiveBanknotesAmount + singleBanknotesAmount;

        int necessaryHundredBanknotes = (totalSum / 100);
        int necessaryFiveBanknotes = (totalSum - 100 * necessaryHundredBanknotes) / 5;
        int necessarySingleBanknotes = (totalSum - 100 * (totalSum / 100) - 5 * necessaryFiveBanknotes) % 10;
        int necessaryBanknotes = necessaryHundredBanknotes + necessaryFiveBanknotes + necessarySingleBanknotes;
        System.out.println("Имеются 3 номинала банкнот - 1, 5 и 100 долларов США.");

        if (necessaryBanknotes > banknotesAmount) {
            System.out.printf("Нельзя выдать сумму %d из банкомата, поскольку не хватает банкнот.\n", totalSum);
        } else {
            int gotHundredBanknotes = 0;
            int gotFiveBanknotes = 0;
            int gotSingleBanknotes = 0;
            int gotSum = 0;

            if (currentSum > 0) {
               while (hundredBanknotesAmount > 0 && currentSum >= 100) {
                    gotHundredBanknotes++;
                    hundredBanknotesAmount--;
                    currentSum -=100;
                    gotSum += 100;
                } 

                System.out.println("Банкнот достоинством в 100$ США не хватает.");

                while (fiveBanknotesAmount > 0 && currentSum >= 5) {
                    gotFiveBanknotes++;
                    fiveBanknotesAmount--;
                    currentSum -= 5;
                    gotSum += 5;
                } 

                System.out.println("Банкнот достоинством в 5$ США не хватает.");

                while (singleBanknotesAmount > 0 && currentSum >= 1) {
                    gotSingleBanknotes++;
                    singleBanknotesAmount--;
                    currentSum -= 1;
                    gotSum += 1;
                }
                
                if (gotSum == totalSum) {
                    System.out.printf("На сумму %d выдано %d банкнот достоинством в 100$ США, %d банкнот достоинством в 5$ США и" +  
                            "%d банкнот - в 1$ США." + "\n", gotSum, gotHundredBanknotes, gotFiveBanknotes, gotSingleBanknotes);
                }
            }     
        }
    }
}