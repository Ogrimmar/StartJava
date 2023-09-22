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
            System.out.println("Ваше имя начинается с буквы M.");
        } else if (firstNameLetter == 'I') {
            System.out.println("Ваше имя начинается с буквы I.");
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
                System.out.println("Число " + num + " чётное.");
            } else {
                System.out.println("Число " + num + " нечётное.");
            }
            
            if (num > 0) {
                System.out.println("Число " + num + " положительное.");
            } else {
                System.out.println("Число " + num + " отрицательное.");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах.");
        
        int num3 = 123;
        int num4 = 223;
        System.out.println("'num3' = " + num3 + ", 'num4' = " + num4);

        int num3Hundreds = num3 / 100;
        int num4Hundreds = num4 / 100;
        int num3Tens = (num3 / 10) % 10;
        int num4Tens = (num4 / 10) % 10;
        int num3Units = num3 % 10;
        int num4Units = num4 % 10;
        if (num3Hundreds == num4Hundreds) {
            System.out.println("У трёхзначных чисел " + num3 + " и " + num4 + " совпадают третьи разряды."); 
        } else if (num3Tens == num4Tens) {
            System.out.println("У трёхзначных чисел " + num3 + " и " + num4 + " совпадают вторые разряды."); 
        } else if (num3Units == num4Units) {
            System.out.println("У трёхзначных чисел " + num3 + " и " + num4 + " совпадают первые разряды."); 
        } else {
            System.out.println("У трёхзначных чисел " + num3 + " и " + num4 + " не совпадают никакие цифры."); 
        }

        System.out.println("\n5. Определение символа по его коду.");

        char symbol = '\u0057';
        if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("Символ " + symbol + " является заглавной латинской буквой.");
        } else if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("Символ " + symbol + " является строчной латинской буквой.");
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println("Символ " + symbol + " является цифрой.");
        } else {
            System.out.println("Символ " + symbol + " не является ни строчной, ни заглавной латинской буквой, ни цифрой.");
        }

        System.out.println("\n6. Подсчёт суммы вклада и начисленных банком %.");
        
        int deposit = 301_000;
        System.out.println("Сумма начального вклада: " + deposit);
        if (deposit < 100_000) {
            deposit *= 1.05;
            
            System.out.println("Начисленные проценты: 5%.");
            System.out.println("Итоговая сумма с начисленными процентами: " + deposit);
        } else if (deposit >= 100_000 && deposit <= 300_000) {
            deposit *= 1.07;
            
            System.out.println("Начисленные проценты: 7%.");
            System.out.println("Итоговая сумма с начисленными процентами: " + deposit);
        } else {
            deposit *= 1.1;
            
            System.out.println("Начисленные проценты: 10%.");
            System.out.println("Итоговая сумма с начисленными процентами: " + deposit);
        }

        System.out.println("\n7. Определение оценки по предметам.");

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
        System.out.println("История - " + histMark);

        if (infoRes <= 60) {
            infoMark = 2;
        } else if (infoRes > 60 && infoRes <= 73) {
            infoMark = 3;
        } else if (infoRes > 73 && infoRes <= 91) {
            infoMark = 4;
        } else {
            infoMark = 5;
        }
        System.out.printf("Информатика - " + infoMark);

        double avgPercent = (double) ((histRes + infoRes) / 2);
        double avgMark = (double) ((histMark + infoMark) / 2);
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
                    System.out.println("На сумму " + gotSum + " выдано " + gotHundredBanknotes + " банкнот в 100$, " + 
                            gotFiveBanknotes + " банкнот в 5$ и " + gotSingleBanknotes + " банкнот - в 1$.");
                }
            }     
        }
    }
}