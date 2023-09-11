package ru.mirea.task2;

import java.util.Scanner;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}

class TestAuthor {
    public static void main(String[] args) {
        Author NoName = new Author("Григорий", "Отсутствует", 'М');
        System.out.println("Имя автора: " + NoName.getName() + "\n" +
                "Почта: " + NoName.getEmail() + "\n" +
                "Гендер: " + NoName.getGender() + "\n");
        Scanner src = new Scanner(System.in);
        System.out.println("Введите почту " + NoName.getName());
        String email = src.next();
        NoName.setEmail(email);

        System.out.println(NoName.toString());
    }
}