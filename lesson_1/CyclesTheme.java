public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int counter = -10;
        int sumEvenNum = 0;
        int sumOddNum = 0;
        do {
            if (counter % 2 == 0) {
                sumEvenNum += counter;
            } else {
                sumOddNum += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = "
                + sumEvenNum + ", а нечетных = " + sumOddNum);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        int min = num2;
        if (num1 < min) {
            min = num1;
        }
        if (num3 < min) {
            min = num3;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int srcNum = 1234;
        int sumDigits = 0;
        while (srcNum > 0) {
            int digit = srcNum % 10;
            System.out.print(digit + "");
            srcNum /= 10;
            sumDigits += digit;
        }
        System.out.println("\n" + sumDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        counter = 0;
        int countNumbersInLine = 1;
        for (int i = 1; i < 24; i += 2) {
            countNumbersInLine++;
            if (counter % 5 == 0) {
                System.out.println();
                countNumbersInLine = 0;
            }
            counter++;
            System.out.printf("%5d", i);
        }
        for (int j = 0; j < 4 - countNumbersInLine; j++) {
            System.out.printf("%5d", 0);
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность");
        int srcNum2 = 3242592;
        System.out.print("Число " + srcNum2);
        int countTwos = 0;
        while (srcNum2 > 0) {
            if (srcNum2 % 10 == 2) {
                countTwos++;
            }
            srcNum2 /= 10;
        }
        if (countTwos % 2 == 0) {
            System.out.print(" содержит " + countTwos + " - четное количество двоек");
        } else {
            System.out.print(" содержит " + countTwos + " - нечетное количество двоек");
        }

        System.out.println("\n\n6. Отображение фигур в консоли");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int countColumns = 5;
        while (countColumns > 0) {
            counter = 1;
            while (counter <= countColumns) {
                System.out.print("#");
                counter++;
            }
            countColumns--;
            System.out.println();
        }

        counter = 0;
        do {
            for (int i = 0; i < counter; i++) {
                System.out.print("$");
                if (i == countColumns) {
                    counter -= 2;
                }
            }
            System.out.println();
            counter++;
            countColumns--;
        } while (countColumns >= 0);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.println("   Dec " + " Char");
        for (int i = 1; i < 127; i++) {
            if (i % 2 != 0 && i < 48) {
                System.out.printf("%5d%5s %n", i, (char) i);
            }
            if (i >= 'a' && i <= 'z' && i % 2 == 0) {
                System.out.printf("%5d%5s %n", i, (char) i);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int srcNum3 = 1234321;
        int copySrcNum3 = srcNum3;
        int srcReversibleNum3 = 0;
        while (srcNum3 != 0) {
            srcReversibleNum3 = srcReversibleNum3 * 10 + srcNum3 % 10;
            srcNum3 /= 10;
        }
        if (copySrcNum3 == srcReversibleNum3) {
            System.out.println("Число " + srcReversibleNum3 + " является палиндромом");
        } else {
            System.out.println("Число " + srcReversibleNum3 + " не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        int srcNum4 = 123600;
        int luckyNum = srcNum4;
        counter = 6;
        int firstSumDigits = 0;
        int lastSumDigits = 0;
        while (counter > 0) {
            if (counter > 3) {
                lastSumDigits += srcNum4 % 10;
            }
            if (counter <= 3) {
                firstSumDigits += srcNum4 % 10;
            }
            counter--;
            srcNum4 /= 10;
        }
        System.out.println("Сумма цифр " + luckyNum / 1000 + " = " + firstSumDigits);
        System.out.println("Сумма цифр " + luckyNum % 1000 + " = " + lastSumDigits);
        if (firstSumDigits == lastSumDigits) {
            System.out.println("Число " + luckyNum + " - счастливое число");
        } else {
            System.out.println("Число " + luckyNum + " - не счастливое число");
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