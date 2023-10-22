package ru.mirea.task11;
import java.util.*;

public class task2 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        Calendar cal1 = Calendar.getInstance();
        Date date1 = cal1.getTime();
        System.out.println("Сейчас: " + date1);

        System.out.println("Введите аналогично свою дату:");

        System.out.print("Год: ");
        int year = src.nextInt();
        System.out.print("Месяц: ");
        int month = src.nextInt() - 1;
        System.out.print("День: ");
        int day = src.nextInt();
        System.out.print("часов: ");
        int hours = src.nextInt();
        System.out.print("минут: ");
        int minutes = src.nextInt() - 1;
        System.out.print("секунд: ");
        int seconds = src.nextInt();
        Calendar cal2 = new GregorianCalendar(year, month, day, hours, minutes + 1, seconds);
        Date date2 = cal2.getTime();
        System.out.println("Ваша дата: " + date2);

        System.out.println((date1.getTime() > date2.getTime())?
                "Сейчас позже Вашей даты" : "Сейчас раньше Вашей даты");
        if (date1.getTime() == date2.getTime()) {
            System.out.println("Вы ввели нынешнюю дату");
        }
    }
}
