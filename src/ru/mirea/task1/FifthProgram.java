package ru.mirea.task1;


import java.util.Scanner;

public class FifthProgram {

    public static int factorial(int number) {
        int result = 1;

        for(int i = 1; i < (number+1); i++) {
            result *= i;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Введите до какого факториала: ");
        int number = src.nextInt();
        System.out.println("Факториал: " + factorial(number));
    }
}
