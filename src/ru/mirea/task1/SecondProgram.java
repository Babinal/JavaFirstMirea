package ru.mirea.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class SecondProgram {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("Введите 0, чтобы перестать заполнять массив:");
        int number;
        do {
            Scanner src = new Scanner(System.in);
            number = src.nextInt();
            arrayList.add(number);
        } while (number != 0);

        int max = -1000000, min = 1000000, i = 0;
        do {
            number = arrayList.get(i);
            if (number > max && number != 0) {
                max = number;
            }
            if (number < min && number != 0) {
                min = number;
            }
            i += 1;
        } while (number != 0);

        String str = String.format("Max число массива - %s; Min число - %s", max, min);
        System.out.println(str);
    }
}
