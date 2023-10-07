package ru.mirea.task8;
import java.util.*;

public class Task6 {
    public static String Prime(int num, int div) {
        if (div == 0) {
            div = (int)(Math.sqrt(num) + 1);
        } if (div > 2) {
            div -= 1;
            if (num % div == 0) {
                return ("NO");
            } else {
                return Prime(num, div);
            }
        }
        return ("YES");
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        System.out.println(Prime(n, 0));
    }
}
