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

        double height = 1.80;

        if (height < 1.80) {
            System.out.println("Вы ниже 1.80 метров.");
        } else {
            System.out.println("Вы не ниже 1.80 метров.");
        }

        char firstNameLetter = "Alexander".charAt(0);

        if (firstNameLetter == 'M') {
            System.out.println("Ваше имя начинается с буквы 'M'.");
        } else if (firstNameLetter == 'I') {
            System.out.println("Ваше имя начинается с буквы 'I'.");
        } else {
            System.out.println("Ваше имя не начинается с буквы 'M' или буквы 'I'.");
        }

        System.out.println("\n2. Поиск max и min числа.");

        int num1 = -100;
        int num2 = 100;

        if (num1 > num2) {
            System.out.println("Максимальное число - это " + num1 + ", а минимальное - " + num2);
        } else if (num1 == num2) {
            System.out.printf("Числа равны. Их максимум и минимум совпадают. Они равны " + num1);
        } else {
            System.out.println("Максимальное число - это " + num2 + ", а минимальное - " + num1);
        }

        System.out.println("\n3. Проверка числа.");

        int num = 123_456;

        if (num == 0) {
            System.out.println("Число " + num + " равно 0.");
        } else {
            if (num % 2 == 0) {
                if (num > 0) {
                    System.out.println("Число " + num + " является положительным и чётным.");
                } else {
                    System.out.println("Число " + num + " является отрицательным и чётным.");
                }
            } else {
                if (num > 0) {
                    System.out.println("Число " + num + " является положительным и нечётным.");
                } else {
                    System.out.println("Число " + num + " является отрицательным и нечётным.");
                }
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах.");

        int num3 = 123;
        int num4 = 223;
        int num3Hundreds = num3 / 100;
        int num4Hundreds = num4 / 100;
        int num3Tens = (num3 % 100) / 10;
        int num4Tens = (num4 % 100) / 10;
        int num3Units = num3 % 10;
        int num4Units = num4 % 10;

        System.out.print("У чисел " + num3 + " и " + num4);
        if (num3Hundreds == num4Hundreds) {
            System.out.println(" одинаковая цифра " + num3Hundreds + " в третьем разряде.");
        } else if (num3Tens == num4Tens) {
            System.out.println(" одинаковая цифра " + num3Tens + " во втором разряде.");
        } else if (num3Units == num4Units) {
            System.out.println(" одинаковая цифра " + num3Units + " в первом разряде.");
        } else {
            System.out.println(" не совпадают никакие цифры ни в каких разрядах.");
        }

        System.out.println("\n5. Определение символа по его коду.");

        char symbol = '\u0057';

        if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println(symbol + " - это заглавная латинская буква.");
        } else if (symbol >= 'a' && symbol <= 'z') {
            System.out.println(symbol + " - это строчная латинская буква.");
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println(symbol + " - это цифра.");
        } else {
            System.out.println("Символ " + symbol + " не является ни строчной, ни заглавной латинской буквой, ни цифрой.");
        }

        System.out.println("\n6. Подсчёт суммы вклада и начисленных банком %.");

        int deposit = 301_000;
        System.out.println("Сумма начального вклада: " + deposit);
        int percent;

        if (deposit < 100_000) {
            percent = 5;
            deposit *= (1 + (double) percent / 100);
        } else if (deposit >= 100_000 && deposit <= 300_000) {
            percent = 7;
            deposit *= (1 + (double) percent / 100);
        } else {
            percent = 10;
            deposit *= (1 + (double) percent / 100);
        }
        System.out.println("Начисленные проценты: " + percent + "%");
        System.out.println("Итоговая сумма с начисленными процентами: " + deposit);

        System.out.println("\n7. Определение оценки по предметам.");

        int historyResult = 59;
        byte historyMark;
        if (historyResult <= 60) {
            historyMark = 2;
        } else if (historyResult > 60 && historyResult <= 73) {
            historyMark = 3;
        } else if (historyResult > 73 && historyResult <= 91) {
            historyMark = 4;
        } else {
            historyMark = 5;
        }
        System.out.println("История - " + historyMark);

        int programmingResult = 91;
        byte programmingMark;
        if (programmingResult <= 60) {
            programmingMark = 2;
        } else if (programmingResult > 60 && programmingResult <= 73) {
            programmingMark = 3;
        } else if (programmingResult > 73 && programmingResult <= 91) {
            programmingMark = 4;
        } else {
            programmingMark = 5;
        }
        System.out.println("Информатика - " + programmingMark);

        double avgPercent = (double) ((historyResult + programmingResult) / 2);
        double avgMark = (double) ((historyMark + programmingMark) / 2);
        System.out.println("Средняя оценка за два предмета - " + avgMark);
        System.out.println("Средний процент за два предмета - " + avgPercent + "%");

        System.out.println("\n8. Расчёт прибыли за год.");

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
            System.out.println("Прибыль составила " + profitPerMonth + " рублей.");
        } else {
            System.out.println("Прибыль составила 0 рублей.");
        }
        System.out.println("\n9. Подсчёт количества банкнот.");

        int totalSum = 567;
        int currSum = totalSum;
        int hundredBanknotesAmount = 10;
        int fiveBanknotesAmount = 5;
        int singleBanknotesAmount = 50;
        int banknotesAmount = hundredBanknotesAmount + fiveBanknotesAmount + singleBanknotesAmount;

        int necessaryHundredBanknotes = (totalSum / 100);
        int necessaryFiveBanknotes = (totalSum - 100 * necessaryHundredBanknotes) / 5;
        int necessarySingleBanknotes = (totalSum - 100 * (totalSum / 100) - 5 * necessaryFiveBanknotes) % 10;
        int necessaryBanknotes = necessaryHundredBanknotes + necessaryFiveBanknotes + necessarySingleBanknotes;
        System.out.println("Имеются 3 номинала банкнот - 1$, 5$ и 100$");

        if (necessaryBanknotes > banknotesAmount) {
            System.out.println("Нельзя выдать сумму " + totalSum + "$ из банкомата, поскольку не хватает банкнот.");
        } else {
            int gotHundredBanknotes = 0;
            int gotFiveBanknotes = 0;
            int gotSingleBanknotes = 0;
            int gotSum = 0;

            if (currSum > 0) {
               while (hundredBanknotesAmount > 0 && currSum >= 100) {
                    gotHundredBanknotes++;
                    hundredBanknotesAmount--;
                    currSum -=100;
                    gotSum += 100;
                } 

                System.out.println("Банкнот достоинством в 100$ не хватает.");

                while (fiveBanknotesAmount > 0 && currSum >= 5) {
                    gotFiveBanknotes++;
                    fiveBanknotesAmount--;
                    currSum -= 5;
                    gotSum += 5;
                } 

                System.out.println("Банкнот достоинством в 5$ не хватает.");

                while (singleBanknotesAmount > 0 && currSum >= 1) {
                    gotSingleBanknotes++;
                    singleBanknotesAmount--;
                    currSum -= 1;
                    gotSum += 1;
                }

                if (gotSum == totalSum) {
                    System.out.println("На сумму " + gotSum + " выдано " + gotHundredBanknotes + " банкнот достоинством в 100$, " + 
                            gotFiveBanknotes + " банкнот в 5$ и " + gotSingleBanknotes + " банкнот в 1$.");
                }
            }
        }
    }
}