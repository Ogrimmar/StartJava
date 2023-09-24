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

        boolean GenderFemale = false;

        if (!GenderFemale) {
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
            System.out.println("Максимальное число - " + num1 + ", а минимальное - " + num2);
        } else if (num1 == num2) {
            System.out.println("Числа равны.");
        } else {
            System.out.println("Максимальное число - " + num2 + ", а минимальное - " + num1);
        }

        System.out.println("\n3. Проверка числа.");

        int num = 123_456;
        String numberSign = null; 
        String numberParity = null;
        String output = "Число " + "'" + num + "' ";
        if (num == 0) {
            System.out.println("Число равно " + num);
        } else {
            if (num % 2 == 0) {
                numberParity = "чётным.";
            } else {
                numberParity = "нечётным.";
            }

            if (num > 0) {
                numberSign = "положительным ";
            } else {
                numberSign = "отрицательным ";
            }
        }

        System.out.println(output + "является " + numberSign + "и " + numberParity);

        System.out.println("\n4. Поиск одинаковых цифр в числах.");

        int num3 = 123;
        int num4 = 228;
        int num3Hundreds = num3 / 100;
        int num4Hundreds = num4 / 100;
        int num3Tens = (num3 % 100) / 10;
        int num4Tens = (num4 % 100) / 10;
        int num3Units = num3 % 10;
        int num4Units = num4 % 10;
        String sout = "У чисел " + "'" + num3 + " и " + "'" + num4 + "'" + " ";

        if (num3Hundreds == num4Hundreds && num3Tens == num4Tens && num3Units == num4Units) {
            sout = sout + "одинаковые цифры " + "'" + num3Hundreds + "', " + "'" + num3Tens + "' и " + "'" + num3Units + "'" + 
                    " во всех соответствующих разрядах.";
        } else {
            if (num3Hundreds == num4Hundreds) {
                if (num3Tens == num4Tens) {
                    sout = sout + "одинаковые цифры " + "'" + num3Tens + "' и " + "'" + num3Hundreds + "'" + " во втором и третьем " + 
                            "разрядах.";
                } else if (num3Units == num4Units) {
                    sout = sout + "одинаковые цифры " + "'" + num3Units + "' и " + "'" + num3Hundreds + "'" + " в первом и третьем " + 
                            "разрядах.";
                } else {
                    sout = sout + "одинаковая цифра " + "'" + num3Hundreds + "' и " + " в третьем разряде.";
                }
            } else if (num3Tens == num4Tens) {
                if (num3Units == num4Units) {
                    sout = sout + "одинаковые цифры " + "'" + num3Tens + "' и " + "'" + num3Units + "'" + " во втором и первом " + 
                            "разрядах.";
                } else {
                    sout = sout + "одинаковая цифра " + "'" + num3Tens + "'" + " во втором разряде.";
                }
            } else if (num3Units == num4Units) {
                sout = sout + "одинаковая цифра " + "'" + num3Units + "'" + " в первом разряде.";
            } else {
                sout = sout + "нет совпадающих цифр.";
            }
        }
        System.out.println(sout);

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
        double percent = 5.0;

        if (deposit >= 100_000 && deposit <= 300_000) {
            percent = 7.0;
        } else {
            percent = 10.0;
        }

        deposit *= (1 + percent / 100);

        System.out.println("Сумма начисленного процента: " + (int) (percent * deposit / 100));
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
        System.out.println("Программирование - " + programmingMark);

        double avgResult = (double) ((historyResult + programmingResult) / 2);
        double avgMark = (double) ((historyMark + programmingMark) / 2);
        System.out.println("Средняя оценка за два предмета - " + avgMark);
        System.out.println("Средний процент за два предмета - " + avgResult + "%");

        System.out.println("\n8. Расчёт прибыли за год.");

        int hirePrice = 5_000;
        int goodsSales = 13_000;
        int costEffectiveness = 4_000;

        int annualGoodsEarnings = goodsSales * 12;
        int annualHireExpenes = hirePrice * 12;
        int annualCostEffectiveness = costEffectiveness * 12;
        int annualProfit = annualGoodsEarnings - annualCostEffectiveness - annualHireExpenes;

        System.out.println("Прибыль за год: " + annualProfit + " руб.");

        System.out.println("\n9. Подсчёт количества банкнот.");

        int totalSum = 567;
        int hundredBanknotesAmount = 10;
        int fiveBanknotesAmount = 5;
        int singleBanknotesAmount = 50;
        int banknotesAmount = hundredBanknotesAmount + fiveBanknotesAmount + singleBanknotesAmount;

        int necessaryHundredBanknotes = (totalSum / 100);
        int necessaryFiveBanknotes = (totalSum - 100 * necessaryHundredBanknotes) / 5;
        int necessarySingleBanknotes = (totalSum - 100 * (totalSum / 100) - 5 * necessaryFiveBanknotes) % 10;
        int necessaryBanknotes = necessaryHundredBanknotes + necessaryFiveBanknotes + necessarySingleBanknotes;
        System.out.println("Имеются 3 номинала банкнот - 1$, 5$ и 100$.");

        int currSum = totalSum;

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

                while (fiveBanknotesAmount > 0 && currSum >= 5) {
                    gotFiveBanknotes++;
                    fiveBanknotesAmount--;
                    currSum -= 5;
                    gotSum += 5;
                } 

                while (singleBanknotesAmount > 0 && currSum >= 1) {
                    gotSingleBanknotes++;
                    singleBanknotesAmount--;
                    currSum -= 1;
                    gotSum += 1;
                }

                if (gotSum == totalSum) {
                    System.out.print("На сумму " + gotSum + "$ выдано " + gotHundredBanknotes + " банкнот достоинством в 100$, " + 
                            gotFiveBanknotes + " банкнот в 5$ и " + gotSingleBanknotes + " банкнот в 1$.");
                }
            }
        }
    }
}