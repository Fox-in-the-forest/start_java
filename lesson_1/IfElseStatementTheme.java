public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 21;
        if (age > 20) {
            System.out.println("Вход возможен.");
        } else {
            System.out.println("Запрещено. Вам нет 20 лет.");
        }
        boolean male = true;
        if (!male) {
            System.out.println("Женщинам сегодня скидка, поздравляю!");
        } else {
            System.out.println("Для мужчин акции в следующем месяце.");
        }
        double height = 1.85;
        if (height < 1.80) {
            System.out.println("Вы не приняты в баскетбольную команду.");
        } else {
            System.out.println("Поздравляю, Вам присвоен номер 7.");
        }
        char capitalLetter = "Iren".charAt(0);
        if (capitalLetter == 'М') {
            System.out.println("Ваше имя начинается на " + capitalLetter);
        } else if (capitalLetter == 'I') {
            System.out.println("Ваше имя начинается на " + capitalLetter);
        } else {
            System.out.println("Символ не распознан");
        }

        System.out.println("\n2. Поиск max и min числа");
        int number1 = 13;
        int number2 = 51;
        if (number2 < number1) {
            System.out.println(number2 + " и " + number1 + ". Минимальное число = " + number2
                    + ". Максимальное число = " + number1);
        } else if (number2 > number1) {
            System.out.println(number2 + " и " + number1 + ". Минимальное число = "
                    + number1 + ". Максимальное число = " + number2);
        } else {
            System.out.println("Числа " + number2 + " и " + number1 + " равны.");
        }

        System.out.println("\n3. Проверка числа");
        int srcNumber = -7;
        System.out.println(srcNumber);
        if (srcNumber != 0) {
            if (srcNumber % 2 == 0) {
                System.out.println("Число четное");
            } else {
                System.out.println("Число нечетное");
            }
            if (srcNumber > 0) {
                System.out.println("Число положительное");
            } else {
                System.out.println("Число отрицательное");
            }
        } else {
            System.out.println("Проверки не проводятся");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int number3 = 123;
        int number3Ones = number3 % 10;
        int number3Tens = number3 % 100 / 10;
        int number3Hundreds = number3 / 100;
        int number4 = 123;
        int number4Ones = number4 % 10;
        int number4Tens = number4 % 100 / 10;
        int number4Hundreds = number4 / 100;
        if (number3Ones == number4Ones || number3Tens == number4Tens ||
                number3Hundreds == number4Hundreds) {
            System.out.println("Исходные числа: " + number3 + " и " + number4);
            if (number3Ones == number4Ones) {
                System.out.println("Одинаковая цифра " + number3Ones + " 1ый разряд");
            }
            if (number3Tens == number4Tens) {
                System.out.println("Одинаковая цифра " + number3Tens + " 2ой разряд");
            }
            if (number3Hundreds == number4Hundreds) {
                System.out.println("Одинаковая цифра " + number3Hundreds + " 3ий разряд");
            }
        } else {
            System.out.println("Равных цифр нет");
        }

        System.out.println("\n5. Определение символа по его коду");
        char someChar = '\u0032';
        if (someChar >= 'a' && someChar <= 'z') {
            System.out.println("маленькая буква");
        } else if (someChar >= 'A' && someChar <= 'Z') {
            System.out.println("большая буква");
        } else if (someChar >= '1' && someChar <= '9') {
            System.out.println("цифра");
        } else {
            System.out.println("не буква и не число");
        }
        System.out.println(someChar);

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int contribution = 300000;
        int bankInterest = contribution / 100;
        System.out.println("Сумма Вашего вклада = " + contribution);
        if (contribution < 100000) {
            bankInterest *= 5;
        } else if (contribution >= 100000 && contribution <= 300000) {
            bankInterest *= 7;
        } else if (contribution > 300000) {
            bankInterest *= 10;
        }
        System.out.println("Ваш начисленный процент = " + bankInterest);
        System.out.println("Ваша итоговая сумма = " + (contribution + bankInterest));

        System.out.println("\n7. Определение оценки по предметам");
        int programmingPercent = 91;
        int historyPercent = 59;
        int programmingMark = 2;
        int historyMark = 2;
        if (historyPercent > 60 && historyPercent <= 73) {
            historyMark = 3;
        } else if (historyPercent > 73 && historyPercent <= 91) {
            historyMark = 4;
        } else if (historyPercent > 91) {
            historyMark = 5;
        }
        if (programmingPercent > 60 && programmingPercent <= 73) {
            programmingMark = 3;
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
            programmingMark = 4;
        } else if (programmingPercent > 91) {
            programmingMark = 5;
        }
        int averagePoint = (programmingMark + historyMark) / 2;
        int averagePercent = (programmingPercent + historyPercent) / 2;
        System.out.println(programmingMark + " - Программирование. " + historyMark + " - История.");
        System.out.println("Средний балл оценок по предметам : " + averagePoint);
        System.out.println("Средний процент по предметам : " + averagePercent);

        System.out.println("\n8. Расчет прибыли за год");
        int rentPrice = 5000;
        int salesIncome = 14000;
        int productionCosts = 9000;
        int yearlyProfits = (salesIncome - rentPrice - productionCosts) * 12;
        if (yearlyProfits > 0) {
            System.out.println("Прибыль за год: +" + yearlyProfits + " руб.");
        } else {
            System.out.println("Прибыль за год: " + yearlyProfits + " руб.");
        }

        System.out.println("\n9. Подсчет количества банкнот");
        int requiredAmount = 567;
        int amountHundreds = 10;
        int amountTens = 5;
        int amountOnes = 50;
        int allMoneyATM = 100 * amountHundreds + 10 * amountTens + amountOnes;
        int numberOfHundreds = requiredAmount / 100;
        int numberOfTens = requiredAmount / 10 % 10;
        int numbersOfOnes = requiredAmount % 10;
        if (allMoneyATM < requiredAmount) {
            System.out.println("Операция отклонена. Недостаточно средств.");
        } else {
            if (requiredAmount == allMoneyATM) {
                amountHundreds = 0;
                amountTens = 0;
                amountOnes = 0;
            }
            if (amountHundreds >= numberOfHundreds) {
                amountHundreds -= numberOfHundreds;
            }
            if (amountTens >= numberOfTens) {
                amountTens -= numberOfTens;
            } else if (amountTens < numberOfTens) {
                amountTens -= numberOfTens;
                amountOnes += amountTens * 10;
                amountTens = 0;
            }
            if (amountOnes >= numbersOfOnes) {
                amountOnes -= numbersOfOnes;
            }
        }
        System.out.println("100$ - " + amountHundreds + " шт." + " 10$ - " +
                amountTens + "шт." + " 1$ - " + amountOnes + " шт. Итого : " +
                requiredAmount + "$");
    }
}