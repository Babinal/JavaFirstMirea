package ru.mirea.task4;

import java.util.Scanner;

public class SeasonsTime {
    public enum Seasons {
        winter(-20), autumn(10), spring(15), summer(30);
        private final int temp;
        Seasons(int temp) {
            this.temp = temp;
        }
        public int getTemp(){ return temp;}
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Введите ваше любимое время года: ");
        Seasons favoriteSeason = Seasons.valueOf(src.next());
        switch(favoriteSeason) {
            case autumn -> {
                System.out.println("Не люблю это время, т.к. температура: " + favoriteSeason.getTemp());
            }
            case spring -> {
                System.out.println("Красиво, но температура более менее: " + favoriteSeason.getTemp());
            }
            case summer -> {
                System.out.println("Хоть и температура " + favoriteSeason.getTemp()
                + ", но погода неплоха.");
            }
            case winter -> {
                System.out.println("Лучшее время года, люблю температуру в " + favoriteSeason.getTemp()
                + " градусов");
            }
            default -> {
                System.out.println("Сюда невозможно попасть");
            }
        }
    }
}
