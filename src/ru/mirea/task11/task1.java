package ru.mirea.task11;

import java.time.*;
import java.util.*;

class Work {
    String name, varWork;
    Calendar dateOutWork, dateGetWork;
    LocalTime timeGetWork;
    Date timeOutWork;

    public Work(String name, String varWork, Calendar dateGetWork, Calendar dateOutWork, LocalTime timeGetWork, Date timeOutWork) {
        this.name = name;
        this.varWork = varWork;
        this.dateGetWork = dateGetWork;
        this.dateOutWork = dateOutWork;
        this.timeGetWork = timeGetWork;
        this.timeOutWork = timeOutWork;
    }

    @Override
    public String toString() {
        return "Work{" +
                "name='" + name + '\'' +
                ", varWork='" + varWork + '\'' +
                ", dateOutWork=" + dateOutWork.getTime() +
                ", dateGetWork=" + dateGetWork.getTime() +
                ", timeGetWork=" + timeGetWork +
                ", timeOutWork=" + timeOutWork.getHours() +
                '}';
    }
}

public class task1 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Введите требуемые параметры:");
        ArrayList<String> str = new ArrayList<>();
        System.out.println("Имя: "); String name = src.next();
        System.out.println("Работа: "); String work = src.next();
        System.out.println("Время дедлайна: "); Date timeDeadline = new Date(src.nextInt());
        System.out.println("Введите год: "); int year = src.nextInt();
        System.out.println("Введите месяц: "); int month = src.nextInt()-1;
        System.out.println("Введите день: "); int day = src.nextInt();
        Calendar dateDeadline = new GregorianCalendar(year, month, day);
        java.time.LocalDate currentDate = java.time.LocalDate.now();
        Calendar calendar = Calendar.getInstance();
        calendar.set(currentDate.getYear(), currentDate.getMonthValue() - 1, currentDate.getDayOfMonth());
        java.time.LocalTime currentTime = java.time.LocalTime.now();
        Work result = new Work(name, work, calendar, dateDeadline, currentTime, timeDeadline);
        System.out.println("У вас есть работа: " + result.toString());
    }
}