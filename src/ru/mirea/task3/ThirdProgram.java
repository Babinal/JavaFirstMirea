package ru.mirea.task3;
import java.util.*;

public class ThirdProgram {
    public static boolean isGrow(int[] mas) {
        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i] > mas[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Random rand = new Random();

        int[] massive = new int[4];
        System.out.print("Массив: ");
        for(int i = 0; i < massive.length; i++) {
            massive[i] = rand.nextInt(10, 100);
            System.out.print(massive[i] + " ");
        }
        System.out.println("\nВозрастающая ли последовательность: " + isGrow(massive));
    }
}
