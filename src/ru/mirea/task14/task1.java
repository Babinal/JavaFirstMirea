package ru.mirea.task14;
import java.util.*;

public class task1 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = src.nextLine();
        String[] elements = input.split("\\s+");

        System.out.println("Элементы строки:");
        for (String element : elements) {
            System.out.println(element);
        }
    }
}
