public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int counterRow = -10;
        int sumEvenNum = 0;
        int sumOddNum = 0;
        do {
            if (counterRow % 2 == 0) {
                sumEvenNum += counterRow;
            } else {
                sumOddNum += counterRow;
            }
            counterRow++;
        } while (counterRow <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " 
                + sumEvenNum + ", а нечетных = " + sumOddNum);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int maxNum = 0;
        if (num1 > num2 && num1 > num3) {
            maxNum = num1;
        } else if (num2 > num1 && num2 > num3) {
            maxNum = num2;
        } else {
            maxNum = num3;
        }
        int minNum = 0;
        if (num2 < num3 && num2 < maxNum) {
            minNum = num2;
        } else if (num1 < num3 && num1 < maxNum) {
            minNum = num1;
        } else {
            minNum = num3;
        }
        for (int i = maxNum - 1; i > minNum; i--) {
            System.out.printf(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int srcNum = 1234;
        int SumDigits = 0;
        while (srcNum > 0) {
            int digit = srcNum % 10;
            System.out.printf(digit + "");
            srcNum /= 10;
            SumDigits += digit;
        }
        System.out.println("\n" + SumDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        counterRow = 0;
        int counterZeros = 1;
        for (int i = 1; i < 24; i += 2) {
            counterZeros++;
            if (counterRow % 5 == 0) {
                System.out.printf("%n");
                counterZeros = 0;
            }
            counterRow++;
            System.out.printf("%5d", i);
        }
        for (int j = 0; j < 4 - counterZeros; j++) {
            System.out.printf("%5d", 0);
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность");
        int srcNum2 = 3242592;
        System.out.printf("Число " + srcNum2);
        int counterTwos = 0;
        while (srcNum2 > 0) {
            if (srcNum2 % 10 == 2) {
                counterTwos++;
            }
            srcNum2 /= 10;
        }
        if (counterTwos % 2 == 0) {
            System.out.printf(" содержит " + counterTwos + " - четное количество двоек");
        } else {
            System.out.printf(" содержит " + counterTwos + " - нечетное количество двоек");
        }

        System.out.println("\n\n6. Отображение фигур в консоли");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
        int counterColumn = 5;
        while (counterColumn > 0) {
            counterRow = 1;
            while (counterRow <= counterColumn) {
                System.out.printf("#");
                counterRow++;
            }
            counterColumn--;
            System.out.println();
        }
        counterColumn = 5;
        counterRow = 0;
        do {
            if (counterColumn == 3) {
                System.out.printf("$$");
            }
            for (int i = 0; i < counterRow; i++) {
                if (i % 2 == 0) {
                    counterRow -= 2;
                }
                System.out.printf("$");
            }
            counterRow++;
            counterColumn--;
            System.out.println("$");
        } while (counterColumn > 0);

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int srcNum3 = 1234321;
        int finalsNum = srcNum3;
        int checkingNum3 = 0;
        while (srcNum3 != 0) {
            checkingNum3 = checkingNum3 * 10 + srcNum3 % 10;
            srcNum3 /= 10;
        }
        if (finalsNum == checkingNum3) {
            System.out.println("Число " + checkingNum3 + " является палиндромом");
        } else {
            System.out.println("Число " + checkingNum3 + " не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        int srcNum4 = 123600;
        int LuckyNum = srcNum4;
        counterRow = 6;
        int firstSumDigits = 0;
        int lastSumDigits = 0;
        while (counterRow > 0) {
            if (counterRow > 3) {
                lastSumDigits += srcNum4 % 10;
            }
            if (counterRow <= 3) {
                firstSumDigits += srcNum4 % 10;
            }
            counterRow--;
            srcNum4 /= 10;
        }
        System.out.println("Сумма цифр " + LuckyNum / 1000 + " = " + firstSumDigits);
        System.out.println("Сумма цифр " + LuckyNum % 1000 + " = " + lastSumDigits);
        if (firstSumDigits == lastSumDigits) {
            System.out.println("Число " + LuckyNum + " - счастливое число");
        } else {
            System.out.println("Число " + LuckyNum + " - не счастливое число");
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