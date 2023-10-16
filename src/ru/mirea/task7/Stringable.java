package ru.mirea.task7;

public interface Stringable {
    int countSymb();
    String ranString();
    String reverseString();
}

class DoString implements Stringable {
    String str;

    public DoString(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public int countSymb() {
        return str.length();
    }

    @Override
    public String ranString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                result.insert(0, String.valueOf(str.charAt(i)));
            }
        }
        result.reverse();
        return result.toString();
    }

    @Override
    public String reverseString() {
        char[] s = str.toCharArray(); char temp;
        /* Можно, конечно, добавить этот вариант, он был бы быстрее
        StringBuilder h = new StringBuilder(str);
        return h.reverse().toString();
        */
        for (int i = 0; i < (int)(s.length/2); i++) {
            temp = s[s.length-1-i];
            s[s.length-1-i] = s[i];
            s[i] = temp;
        }
        return String.valueOf(s);
    }

    @Override
    public String toString() {
        return str;
    }
}

class TestString {
    public static void main(String[] args) {
        Stringable str = new DoString("Абудабдам");
        System.out.println("Изначальное слово: " + str);
        System.out.println("Кол-во символов: " + str.countSymb());
        System.out.println("Бардак из символов: " + str.ranString());
        System.out.println("Реверс: " + str.reverseString());
    }
}