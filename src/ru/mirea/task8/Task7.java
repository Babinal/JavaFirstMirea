package ru.mirea.task8;
import java.util.*;

public class Task7 {
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

    public static ArrayList<Integer> divs (int n, ArrayList<Integer> result, int div) {
        if (div == 0) {
            div = 2;
        } else {
            div += 1;
        }

        if ((n % div == 0) && (Prime(div, 0).equals("YES"))) {
            result.add(div);
        }
        if (div != ((int)n/2)) {
            return divs(n, result, div);
        } else {
            return result;
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> Empty = new ArrayList<>();
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        System.out.println("Простые делители числа: "+divs(n, Empty, 0));
    }
}
