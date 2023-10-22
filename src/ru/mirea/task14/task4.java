package ru.mirea.task14;

public class task4 {
    public static boolean checkDigitsWithoutPlus(String text) {
        boolean containsDigitsWithoutPlus = false;

        // Разбиваем текст на отдельные символы
        char[] chars = text.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];

            // Проверяем, является ли текущий символ цифрой
            if (Character.isDigit(c)) {
                // Если символ - цифра, проверяем следующий символ
                if (i < chars.length - 1) {
                    char nextChar = chars[i + 1];
                    // Если следующий символ - не '+', то есть цифра без знака '+'
                    if (nextChar != '+') {
                        containsDigitsWithoutPlus = true;
                        break;
                    }
                }
            }
        }

        return containsDigitsWithoutPlus;
    }
    public static void main(String[] args) {
        String text = "2+3+4+"; // Текст для проверки

        boolean containsDigitsWithoutPlus = checkDigitsWithoutPlus(text);
        if (containsDigitsWithoutPlus) {
            System.out.println("В тексте есть цифры без знака '+'!");
        } else {
            System.out.println("В тексте нет цифр без знака '+'!");
        }
    }
}
