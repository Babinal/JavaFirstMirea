package ru.mirea.task8;

public class Task8 {
    public static String IsPoly(String str) {
        char[] result = new char[str.length()];
        if (str.length() <= 1) {
            return "YES";
        }   else {
            if (str.charAt(0) == str.charAt(str.length()-1)) {
                return IsPoly(str.substring(1 ,str.length()-1));
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        System.out.println(IsPoly("ВОРОВ"));
    }
}
