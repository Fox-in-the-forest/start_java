public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод значений переменных на консоль");
        byte cpu = 8;
        short ram = 16;
        int freq = 3600;
        long hdd = 40000;
        float power = 800.00f;
        double cost = 70.500;
        char cpuIndex = 'i';
        boolean play = true;
        System.out.println("Процессор: Intel Core " + cpuIndex + "7;");
        System.out.println("Количество ядер: " + cpu + ";");
        System.out.println("Оперативная память: " + ram + " GGB DDR4 с частотой от " + freq
                + " Мгц;");
        System.out.println("Место на диске: " + hdd + " Мб;");
        System.out.println("Мощность БП: " + power + " Вт;");
        System.out.println("Игровой: " + play + ";");
        System.out.println("Цена: " + cost + ";");

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int bookPrice = 200;
        int penPrice = 100;
        int discount = 11;
        int sumGoods = bookPrice + penPrice;
        int discountAmount = ((sumGoods * discount) / 100);
        float discountPrice = (sumGoods - discountAmount);
        System.out.println("Общая стоимость товаров: " + sumGoods);
        System.out.println("Сумма скидки: " + discountAmount);
        System.out.println("Общая стоимость товаров со скидкой: " + discountPrice);

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte byteMax = 127;
        short shortMax = 32767;
        int intMax = 2147483647;
        long longMax = 9223372036854775807l;
        System.out.println("Первоначальное значение " + byteMax + ". Значение после инкремента = " +
                ++byteMax + ". Значение после декремента = " + --byteMax);
        System.out.println("Первоначальное значение " + shortMax + ". Значение после инкремента = "
                + ++shortMax + ". Значение после декремента = " + --shortMax);
        System.out.println("Первоначальное значение " + intMax + ". Значение после инкремента = " +
                ++intMax + ". Значение после декремента = " + --intMax);
        System.out.println("Первоначальное значение " + longMax + ". Значение после инкремента = " +
                ++longMax + ". Значение после декремента = " + --longMax);

        System.out.println("\n5. Перестановка значений переменных");
        int number1 = 2;
        int number2 = 5;
        int number3;
        System.out.println("С помощью третьей переменной");
        System.out.println("исходные значения: a = " + number1 + " b = " + number2);
        number3 = number1;
        number1 = number2;
        number2 = number3;
        System.out.println("новые значения: a = " + number1 + " b = " + number2);
        System.out.println("С помощью арифметических операций");
        System.out.println("исходные значения: a = " + number1 + " b = " + number2);
        number1 += number2;
        number2 = number1 - number2;
        number1 -= number2;
        System.out.println("новые значения: a = " + number1 + " b = " + number2);
        System.out.println("С помощью побитовой операции");
        System.out.println("исходные значения: a = " + number1 + " b = " + number2);
        number1 ^= number2;
        number2 ^= number1;
        number1 ^= number2;
        System.out.println("новые значения: a = " + number1 + " b = " + number2);

        System.out.println("\n6. Вывод символов и их кодов");
        char octothorp = '#';
        char ampersand = '&';
        char commercialAt = '@';
        char circumflex = '^';
        char underscore = '_';
        System.out.println((int) octothorp + " " + octothorp);
        System.out.println((int) ampersand + " " + ampersand);
        System.out.println((int) commercialAt + " " + commercialAt);
        System.out.println((int) circumflex + " " + circumflex);
        System.out.println((int) underscore + " " + underscore);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char forwardSlash = '/';
        char openParenthesis = '(';
        char closeParenthesis = ')';
        char slash = '\\';
        System.out.println(forwardSlash + slash);
        System.out.println(forwardSlash + slash);
        System.out.println(forwardSlash + underscore + openParenthesis + closeParenthesis + slash);
        System.out.println(forwardSlash + slash);
        System.out.println(forwardSlash + underscore + underscore + underscore + underscore
                + forwardSlash + slash + underscore + underscore + slash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int hundreds = number / 100;
        int tens = number % 100 / 10;
        int ones = number % 10;
        int sumDigits = hundreds + tens + ones;
        int prodDigits = hundreds * tens * ones;
        System.out.println("Число " + number + " содержит:");
        System.out.println(hundreds + " сотню");
        System.out.println(tens + " десятка");
        System.out.println(ones + " единицы");
        System.out.println("Сумма его цифр = " + sumDigits);
        System.out.println("Произведение его цифр = " + prodDigits);

        System.out.println("\n9. Вывод времени");
        int totalSeconds = 86399;
        int hours = (totalSeconds / 3600);
        int minutes = totalSeconds / 60 % 60;
        int seconds = totalSeconds  % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}