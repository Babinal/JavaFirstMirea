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
    private ArrayList<Dog> ArrayDogs = new ArrayList();

    public DogKennel(ArrayList<Dog> arrayDogs) {
        ArrayDogs = arrayDogs;
    }

    public void addDog(String nickname, int age) {
        Dog NewDog = new Dog(nickname, age);
        this.ArrayDogs.add(NewDog);
    }

    @Override
    public String toString() {
        return "DogKennel{" +
                "ArrayDogs=" + ArrayDogs +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Dog> ArrayDogs = new ArrayList();
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

        int command = 0;
        int choise = -1;
        do {
            System.out.println("Введите соответсвующую цифру для команды:\n" +
                    "0 - закончить программу\n" +
                    "1 - выбрать собаку\n" +
                    "2 - узнать возраст в человеческих годах\n" +
                    "3 - установить возраст\n" +
                    "4 - узнать возраст\n" +
                    "5 - установить ключку\n" +
                    "6 - узнать кличку\n" +
                    "7 - узнать всё\n" +
                    "8 - все собаки");
            command = src.nextInt();
            switch (command) {
                case 0:
                    break;
                case 1:
                    System.out.print("Какую собаку выбираете? номер: ");
                    choise = src.nextInt();
                    break;
                case 2:
                    if (Objects.equals(choise, -1)) {
                        System.out.println("Собака не выбрана");
                    } else {
                        System.out.println(ArrayDogs.get(choise).toHumanAge());
                    }
                    break;
                case 3:
                    if (Objects.equals(choise, -1)) {
                        System.out.println("Собака не выбрана");
                    } else {
                        System.out.println("Введите новый возраст: ");
                        ArrayDogs.get(choise).setAge(src.nextInt());
                    }
                    break;
                case 4:
                    if (Objects.equals(choise, -1)) {
                        System.out.println("Собака не выбрана");
                    } else {
                        System.out.println(ArrayDogs.get(choise).getAge());
                    }
                    break;
                case 5:
                    if (Objects.equals(choise, -1)) {
                        System.out.println("Собака не выбрана");
                    } else {
                        System.out.println("Введите новую кличку: ");
                        ArrayDogs.get(choise).setNickname(src.next());
                    }
                    break;
                case 6:
                    if (Objects.equals(choise, -1)) {
                        System.out.println("Собака не выбрана");
                    } else {
                        System.out.println(ArrayDogs.get(choise).getNickname());
                    }
                    break;
                case 7:
                    if (Objects.equals(choise, -1)) {
                        System.out.println("Собака не выбрана");
                    } else {
                        System.out.println(ArrayDogs.get(choise).toString());
                    }
                    break;
                case 8:
                    System.out.println(ArrayDogs.toString());
                    break;
                default:
                    System.out.println("Неверная команда!");
            }
        } while (command != 0);
    }
}
