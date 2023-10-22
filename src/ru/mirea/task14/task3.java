package ru.mirea.task14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task3 {
    public static void main(String[] args) {
        String text = "цены: 25.98 USD, 1500 RUB, 10.5 EU.";

        // Используем регулярные выражения для извлечения цен
        Pattern pattern = Pattern.compile("(\\d+(\\.\\d+)?) (USD|RUB|EU)");
        Matcher matcher = pattern.matcher(text);

        // Извлекаем цены и выводим результат
        while (matcher.find()) {
            double price = Double.parseDouble(matcher.group(1));
            String currency = matcher.group(3);

            System.out.println("Цена: " + price + " " + currency);
        }
    }
}
