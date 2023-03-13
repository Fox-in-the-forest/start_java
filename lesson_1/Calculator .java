public class Calculator {
    public static void main(String[] args) {
        System.out.println("1. “Калькулятор”");
        int number1 = 3;
        int number2 = -2;
        char sign = '-';
        float result = 1;
        if (sign == '+' || sign == '-' || sign == '*' || sign == '/' || sign == '^'
                || sign == '%') {
            if (sign == '+') {
                result = (int) number1 + number2;
            } else if (sign == '-') {
                result = (int) number1 - number2;
            } else if (sign == '*') {
                result = (int) number1 * number2;
            } else if (sign == '/') {
                result = (int) number1 / number2;
            } else if (sign == '^') {
                if (number2 > 0) {
                    for (int i = 0; i < number2; i++) {
                        result *= (int) number1;
                    }
                }
                if (number2 < 0) {
                    for (int i = 0; i > number2; i--) {
                        result *= number1;
                    }
                    result = 1 / result;
                }
            } else if (sign == '%') {
                result = number1 % number2;
            }
            System.out.println(number1 + " " + sign + " " + number2 + " = " + result);
        } else {
            System.out.println("Введен не корректный символ");
        }
    }
}