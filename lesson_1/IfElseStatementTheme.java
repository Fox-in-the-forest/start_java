public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 21;
        boolean male = true;
        double growth = 1.85;
        char firstLetterOfName = "Iren".charAt(0);
        if (age > 20) {
            System.out.println("Вход возможен.");
        } else {
            System.out.println("Запрещено. Вам нет 20 лет.");
        }
        if (!male) {
            System.out.println("Женщинам сегодня скидка, поздравляю!");
        } else {
            System.out.println("Для мужчин акции в следующем месяце.");
        }
        if (growth < 1.80) {
            System.out.println("Вы не приняты в баскетбольную команду.");
        } else {
            System.out.println("Поздравляю, Вам присвоен номер 7.");
        }
        if (firstLetterOfName == 'М') {
            System.out.println("Ваше имя начинается на " + firstLetterOfName);
        } else if (firstLetterOfName == 'I') {
            System.out.println("Ваше имя начинается на " + firstLetterOfName);
        } else {
            System.out.println("Символ не распознан");
        }

        System.out.println("\n2. Поиск max и min числа");
        int number1 = 13;
        int number2 = 51;
        if (number2 < number1) {
            System.out.println(number2 + " и " + number1 + ". Минимальное число = " + number2 +
                ". Максимальное число = " + number1);
        } else if (number2 > number1) {
            System.out.println(number2 + " и " + number1 + ". Минимальное число = " + number1 +
                ". Максимальное число = " + number2);
        } else {
            System.out.println("Числа " + number2 + " и " + number1 + " равны.");
        }

        System.out.println("\n3. Проверка числа");
        int verifiedNumber = 13;
        System.out.println(verifiedNumber);
        if (verifiedNumber != 0) {
            if (verifiedNumber % 2 == 0) {
                System.out.println("Число четное");
            } else {
                System.out.println("Число нечетное");
            }
            if (verifiedNumber > 0) {
                System.out.println("Число положительное");
            } else System.out.println("Число отрицательное");
        } else {
            System.out.println("Проверки не проводятся");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int number3 = 129;
        int number4 = 329;
        int number3Ones = number3 % 10;
        int number3Tens = number3 % 100 / 10;
        int number3Hundreds = number3 / 100;
        int number4Ones = number4 % 10;
        int number4Tens = number4 % 100 / 10;
        int number4Hundreds = number4 / 100;
        if (number3Hundreds == number4Hundreds | number3Tens == number4Tens
            | number3Ones == number4Ones) {
            System.out.println("Исходные числа: " + number3 + " и " + number4);
            if (number3Hundreds == number4Hundreds) {
                System.out.println("Одинаковая цифра " + number3Hundreds + " 1ый разряд");
            } else if (number3Tens == number4Tens) {
                System.out.println("Одинаковая цифра " + number3Tens + " 2ой разряд");
            } else if (number3Ones == number4Ones) {
                System.out.println("Одинаковая цифра " + number3Ones + " 3ий разряд");
            }
        } else {
            System.out.println("Равных цифр нет");
        }

        System.out.println("\n5. Определение символа по его коду");
        char unicodeCharacter = '\u0032';
        if (unicodeCharacter >= 'a' && unicodeCharacter <= 'z') {
            System.out.printf("маленькая буква");
        } else if (unicodeCharacter >= 'A' && unicodeCharacter <= 'Z') {
            System.out.printf("большая буква");
        } else if (unicodeCharacter >= '\u0030' && unicodeCharacter <= '\u0039') {
            System.out.printf("цифра");
        } else {
            System.out.printf("не буква и не число");
        }
        System.out.printf(" " + unicodeCharacter + "\n");

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int contribution = 300000;
        int month = 1;
        int smallDepositAmount = 5;
        int averageDepositAmount = 7;
        int largeDepositAmount = 10;
        int bankInterest = (contribution * month) / (12 * 100);
        System.out.println("Сумма Вашего вклада = " + contribution);
        if (contribution < 100000) {
            bankInterest *= smallDepositAmount;
            contribution += bankInterest;
        } else if (contribution >= 100000 && contribution <= 300000) {
            bankInterest *= averageDepositAmount;
            contribution += bankInterest;
        } else if (contribution > 300000) {
            bankInterest *= largeDepositAmount;
            contribution += bankInterest;
        }
        System.out.println("Ваш начисленный процент = " + bankInterest);
        System.out.println("Ваша итоговая сумма = " + contribution);

        System.out.println("\n7. Определение оценки по предметам");
        int percentageProgramming = 91;
        int percentageHistory = 59;
        int markProgramming = 2;
        int markHistory = 2;
        if (percentageHistory > 60 && percentageHistory <= 73) {
            markHistory = 3;
        } else if (percentageHistory > 73 && percentageHistory <= 91) {
            markHistory = 4;
        } else if (percentageHistory > 91) {
            markHistory = 5;
        }
        if (percentageProgramming > 60 && percentageProgramming <= 73) {
            markProgramming = 3;
        } else if (percentageProgramming > 73 && percentageProgramming <= 91) {
            markProgramming = 4;
        } else if (percentageProgramming > 91) {
            markProgramming = 5;
        }
        int averagePoint = (markProgramming + markHistory) / 2;
        int averagePercentage = (percentageProgramming + percentageHistory) / 2;
        System.out.println(markProgramming + " - Программирование. " + markHistory + " - История.");
        System.out.println("Средний балл оценок по предметам : " + averagePoint);
        System.out.println("Средний процент по предметам : " + averagePercentage);

        System.out.println("\n8. Расчет прибыли за год");
        int rentPrice = 5000;
        int salesIncome = 13000;
        int productionCosts = 9000;
        int yearlyProfits = (salesIncome - rentPrice - productionCosts) * 12;
        System.out.println("Прибыль за год: " + yearlyProfits);

        System.out.println("\n9. Подсчет количества банкнот");
        int requiredAmount = 567;
        int amountHundreds = 10;
        int amountTens = 5;
        int amountOnes = 50;
        int allMoneyATM = 100 * amountHundreds + 10 * amountTens + amountOnes;
        int numberOfHundreds = requiredAmount / 100;
        int numberOfTens = requiredAmount / 10 % 10;
        int numbersOfOnes = requiredAmount % 10;
        System.out.println("100$ - " + amountHundreds + " шт." + " 10$ - " + amountTens
            + "шт." + " 1$ - " + amountOnes + " шт. Итого : " + allMoneyATM + "$"); // наглядно
        if (allMoneyATM < requiredAmount) {
            System.out.println("Операция отклонена. Недостаточно средств.");
        } else {
            if (amountHundreds >= numberOfHundreds && amountTens >= numberOfTens
                && amountOnes>=numbersOfOnes) {
                System.out.println("100$ - " + numberOfHundreds + " шт." + " 10$ - " + numberOfTens
                    + "шт." + " 1$ - " + numbersOfOnes + " шт. Итого : " + requiredAmount + "$");
            }
            if(numberOfTens > amountTens) {
                amountOnes =  ((numberOfTens - amountTens) * 10) + numbersOfOnes;
                System.out.println("100$ - " + numberOfHundreds + " шт." + " 10$ - " + amountTens
                    + "шт." + " 1$ - " + amountOnes + " шт. Итого : " + requiredAmount + "$");
            }
        }
    }
}