package ru.mirea.task11;

import java.util.*;

class Work {
    String name, varWork;
    Date dateGetWork, dateOutWork;
    long timeGetWork, timeOutWork;

    public Work(String name, String varWork, Date dateDeadline, long timeDeadline) {
        this.name = name;
        this.varWork = varWork;
        this.dateGetWork = new Date();
        this.timeGetWork = System.currentTimeMillis();
        this.dateOutWork = dateDeadline;
        this.timeOutWork = timeDeadline;
    }

    @Override
    public String toString() {
        return "Work{" +
                "name='" + name + '\'' +
                ", Work='" + varWork + '\'' +
                ", date of get=" + dateGetWork +
                ", date of perform=" + dateOutWork +
                ", time of get=" + timeGetWork +
                ", time of perform=" + timeOutWork +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVarWork() {
        return varWork;
    }

    public void setVarWork(String varWork) {
        this.varWork = varWork;
    }

    public Date getDateGetWork() {
        return dateGetWork;
    }

    public void setDateGetWork(Date dateGetWork) {
        this.dateGetWork = dateGetWork;
    }

    public Date getDateOutWork() {
        return dateOutWork;
    }

    public void setDateOutWork(Date dateOutWork) {
        this.dateOutWork = dateOutWork;
    }

    public long getTimeGetWork() {
        return timeGetWork;
    }

    public void setTimeGetWork(long timeGetWork) {
        this.timeGetWork = timeGetWork;
    }

    public long getTimeOutWork() {
        return timeOutWork;
    }

    public void setTimeOutWork(long timeOutWork) {
        this.timeOutWork = timeOutWork;
    }
}

public class task1 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Введите требуемые параметры:");
        ArrayList<String> str = new ArrayList<>();
        System.out.println("Имя: "); String name = src.next();
        System.out.println("Работа: "); String work = src.next();
        System.out.println("Дату получения: "); //Date date = src.next();
    }
}