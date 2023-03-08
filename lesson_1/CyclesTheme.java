public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int count = -10;
        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;
        do {
            if (count % 2 == 0 && count >= -10) {
                sumEvenNumbers += count;
            } else {
                sumOddNumbers += count;
            }
            count++;
        } while (count >= -10 && count <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumEvenNumbers + ", а нечетных = " + sumOddNumbers);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int number1 = 10;
        int number2 = 5;
        int number3 = -1;
        int maxNumber = 0;
        if (number1 > number2 && number1 > number3) {
            maxNumber = number1;
        }
        int minNumber = 0;
        if (number3 < number2 && number3 < number2) {
            minNumber = number3;
        }
        for (int i = maxNumber - 1; i > minNumber; i--) {
            System.out.printf(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int srcNumber = 1234;
        int numberSum = 0;
        int digit;
        while (srcNumber != 0) {
            digit = srcNumber % 10;
            srcNumber /= 10;
            System.out.printf(digit + "");
            numberSum += digit;
        }
        System.out.println("\n" + numberSum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        //как добавить в последнюю строку "0"?
        int numb = 0;
        for (int i = 1; i < 24; i += 2) {
            numb++;
            System.out.printf("%5d", i);
            if (numb % 5 == 0) {
                System.out.printf("%n", 0);
            }
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность");
        int srcNumber2 = 3242592;
        int srcDigit = 0;
        System.out.printf("Число " + srcNumber2);
        int count2 = 0;
        while (srcNumber2 != 0) {
            int digits2 = srcNumber2 % 10;
            srcNumber2 /= 10;
            if (digits2 == 2) {
                count2++;
            }
        }
        if (count2 % 2 == 0) {
            System.out.printf(" содержит " + count2 + " - четное количество двоек");
        } else {
            System.out.printf(" содержит " + count2 + " - нечетное количество двоек");
        }

        System.out.println("\n\n6. Отображение фигур в консоли");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
        int number4 = 5;
        while (number4 > 0) {
            int number5 = 1;
            while (number5 <= number4) {
                System.out.printf("#");
                number5++;
            }
            number4--;
            System.out.println();
        }
        int num = 5;
        int tmpNum = 0;
        do {
            if (num == 3) {
                System.out.printf("$$");
            }
            for (int i = 0; i < tmpNum; i++) {
                if (i % 2 == 0) {
                    tmpNum -= 2;
                }
                System.out.printf("$");
            }
            tmpNum++;
            num--;
            System.out.println("$");
        } while (num > 0);

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int srcNumber3 = 1234321;
        int finalsSrcNumber3 = srcNumber3;
        int checkForPalindrome = 0;
        while (srcNumber3 != 0) {
            checkForPalindrome = checkForPalindrome * 10 + srcNumber3 % 10;
            srcNumber3 /= 10;
        }
        if (finalsSrcNumber3 == checkForPalindrome) {
            System.out.println("Число " + checkForPalindrome + " является палиндромом");
        } else {
            System.out.println("Число " + checkForPalindrome + " не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        int luckyNumber = 310154;
        int finalLuckyNumber = luckyNumber;
        int count3 = 6;
        int firstThreeSum = 0;
        int lastThreeSum = 0;
        while (count3 > 0) {
            if (count3 > 3) {
                lastThreeSum += luckyNumber % 10;
            }
            if (count3 <= 3) {
                firstThreeSum += luckyNumber % 10;
            }
            count3--;
            luckyNumber /= 10;
        }
        System.out.println("Сумма цифр " + finalLuckyNumber / 1000 + " = " + firstThreeSum);
        System.out.println("Сумма цифр " + finalLuckyNumber % 1000 + " = " + lastThreeSum);
        if (firstThreeSum == lastThreeSum) {
            System.out.println("Число " + finalLuckyNumber + " - счастливое число");
        } else {
            System.out.println("Число " + finalLuckyNumber + " - не счастливое число");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        int i, j;
        System.out.printf("   |");
        for (i = 2; i < 10; i++)
            System.out.printf("%2d ", i);
        System.out.printf("\n———————————————————————————\n");
        for (i = 2; i < 10; i++) {
            System.out.printf("%2d |", i);
            for (j = 2; j < 10; j++)
                System.out.printf("%2d ", i * j);
            System.out.printf("\n");
        }
    }
}
