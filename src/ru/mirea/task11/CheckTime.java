package ru.mirea.task11;

import java.util.*;

public class CheckTime {
    public static void main(String[] args) {
        ArrayList<Integer> ArEx = new ArrayList<>();
        LinkedList<Integer> LiEx = new LinkedList<>();
        long startTime, estimatedTime;

        // Добавление
        startTime = System.currentTimeMillis();
        ArEx.add(1);
        estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("Время добавления ArrayList: " + estimatedTime);

        startTime = System.currentTimeMillis();
        LiEx.add(2);
        estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("Время добавления LinkedList: " + estimatedTime);

        // Вставка
        startTime = System.nanoTime();
        ArEx.remove(0);
        ArEx.add(0, 2);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Время вставки(с заменой) ArrayList: " + estimatedTime);

        startTime = System.nanoTime();
        LiEx.set(0, 3);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Время вставки(с заменой) LinkedList: " + estimatedTime);

        // Поиск по образцу
        startTime = System.nanoTime();
        boolean phrase = ArEx.contains(2);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Время поиска ArrayList: " + estimatedTime);

        startTime = System.nanoTime();
        phrase = LiEx.contains(1);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Время поиска LinkedList: " + estimatedTime);

        // удаление
        startTime = System.nanoTime();
        ArEx.remove(0);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Время удаления ArrayList: " + estimatedTime);

        startTime = System.nanoTime();
        LiEx.remove();
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Время удаления LinkedList: " + estimatedTime);
    }
}