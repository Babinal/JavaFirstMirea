package ru.mirea.task1;

public class FirstProgram {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;
        for (int number : array) {
            sum += number;
        }

        System.out.println("Сумма массива: " + sum + "\nСр. Арифметическое: " + (sum/array.length));
    }
}
