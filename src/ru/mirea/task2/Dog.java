package ru.mirea.task2;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Dog {
    private String nickname;
    private int age;

    public Dog(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int toHumanAge() {
        return this.age * 7;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                '}';
    }
}

class DogKennel {
    private final ArrayList<Dog> ArrayDogs;

    public DogKennel(ArrayList<Dog> arrayDogs) {
        this.ArrayDogs = arrayDogs;
    }

    @Override
    public String toString() {
        return "DogKennel{" +
                "ArrayDogs=" + ArrayDogs +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Dog> ArrayDogs = new ArrayList<>();
        Scanner src = new Scanner(System.in);
        System.out.print("Введите кол-во собак в приюте: ");
        int numDogs = src.nextInt();

        for (int i = 0; i < numDogs; i++) {
            System.out.print("Введите имя новой собаки: ");
            String nickname = src.next();
            System.out.print("Введите возраст собаки: ");
            int age = src.nextInt();
            Dog NewDog = new Dog(nickname, age);
            ArrayDogs.add(NewDog);
        }

        int command;
        int choise = -1;
        do {
            System.out.println("""
                    Введите соответсвующую цифру для команды:
                    0 - закончить программу
                    1 - выбрать собаку
                    2 - узнать возраст в человеческих годах
                    3 - установить возраст
                    4 - узнать возраст
                    5 - установить ключку
                    6 - узнать кличку
                    7 - узнать всё
                    8 - все собаки""");
            command = src.nextInt();
            switch (command) {
                case 0 -> {
                }
                case 1 -> {
                    System.out.print("Какую собаку выбираете? номер: ");
                    choise = src.nextInt();
                }
                case 2 -> {
                    if (Objects.equals(choise, -1)) {
                        System.out.println("Собака не выбрана");
                    } else {
                        System.out.println(ArrayDogs.get(choise).toHumanAge());
                    }
                }
                case 3 -> {
                    if (Objects.equals(choise, -1)) {
                        System.out.println("Собака не выбрана");
                    } else {
                        System.out.println("Введите новый возраст: ");
                        ArrayDogs.get(choise).setAge(src.nextInt());
                    }
                }
                case 4 -> {
                    if (Objects.equals(choise, -1)) {
                        System.out.println("Собака не выбрана");
                    } else {
                        System.out.println(ArrayDogs.get(choise).getAge());
                    }
                }
                case 5 -> {
                    if (Objects.equals(choise, -1)) {
                        System.out.println("Собака не выбрана");
                    } else {
                        System.out.println("Введите новую кличку: ");
                        ArrayDogs.get(choise).setNickname(src.next());
                    }
                }
                case 6 -> {
                    if (Objects.equals(choise, -1)) {
                        System.out.println("Собака не выбрана");
                    } else {
                        System.out.println(ArrayDogs.get(choise).getNickname());
                    }
                }
                case 7 -> {
                    if (Objects.equals(choise, -1)) {
                        System.out.println("Собака не выбрана");
                    } else {
                        System.out.println(ArrayDogs.get(choise).toString());
                    }
                }
                case 8 -> System.out.println(ArrayDogs);
                default -> System.out.println("Неверная команда!");
            }
        } while (command != 0);
    }
}
