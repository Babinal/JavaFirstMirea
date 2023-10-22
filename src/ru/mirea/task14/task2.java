package ru.mirea.task14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task2 {
    public static boolean matchesPattern(String input, String pattern) {
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(input);

        return matcher.matches();
    }
    public static void main(String[] args) {
        String input = "abcdefghijklmnopqrstuv18340";
        String pattern1 = "abcdefghijklmnopqrstuv18340";
        String pattern2 = "abcdefghijklmnoasdfasdpqrstuv18340";

        boolean isMatched1 = matchesPattern(input, pattern1);

        if (isMatched1) {
            System.out.println("Строка pattern1 соответствует шаблону.");
        } else {
            System.out.println("Строка pattern1 не соответствует шаблону.");
        }

        boolean isMatched2 = matchesPattern(input, pattern2);

        if (isMatched2) {
            System.out.println("Строка pattern2 соответствует шаблону.");
        } else {
            System.out.println("Строка pattern2 не соответствует шаблону.");
        }
    }
}
