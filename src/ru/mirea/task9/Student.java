package ru.mirea.task9;

import java.util.*;

public class Student {
    private String name, surname, group;
    private int age, marks;

    public Student(String name, String surname, String group, int age, int marks) {
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.age = age;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", group='" + group + '\'' +
                ", age=" + age +
                ", marks=" + marks +
                '}';
    }
}

class Main {
    public static void selectionSort (ArrayList<Student> list) {
        for (int left = 0; left < list.size(); left++) {
            // Вытаскиваем значение элемента
            Student value = list.get(left);
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value.getAge() < list.get(i).getAge()) {
                    list.set(i + 1, list.get(i));
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            list.set(i + 1, value);
        }
    }
    public static void main(String[] args) {
        ArrayList<Student> iDNumber = new ArrayList<>();
        iDNumber.add(new Student("Максим", "Степанов", "КАБО-02-22", 18, 5));
        iDNumber.add(new Student("Влад", "Степанов", "КАБО-02-22", 13, 5));
        iDNumber.add(new Student("Никита", "Степанов", "КАБО-02-22", 14, 5));
        iDNumber.add(new Student("Семён", "Степанов", "КАБО-02-22", 15, 5));
        for(Student x : iDNumber) {
            System.out.println(x);
        }
        selectionSort(iDNumber);
        System.out.println();
        for(Student x : iDNumber) {
            System.out.println(x);
        }
    }
}