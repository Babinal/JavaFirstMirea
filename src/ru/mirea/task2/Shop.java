package ru.mirea.task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    private ArrayList<String> computers = new ArrayList<>();

    public Shop(ArrayList<String> computers) {
        this.computers = computers;
    }

    public void addComputer(String computer) {
        this.computers.add(computer);
    }

    public void removeComputer(String computer) {
        if (this.computers.isEmpty()) {
            System.out.println("В магазине и так нет компьютеров");
        } else {
            this.computers.remove(computer);
        }
    }

    public void findComputer(String computer) {
        if (this.computers.contains(computer)) {
            System.out.println("Данный компьютер есть в магазине");
        } else {
            System.out.println("Данного компьютера нет в магазине");
        }
    }

    @Override
    public String toString() {
        String str = "Компьютеры в магазине:";
        for (String computer : computers) {
            str += "\n" + computer;
        }
        return str;
    }
}

class TestShop {
    public static void main(String[] args) {
        ArrayList<String> ArrayList = new ArrayList<>();
        ArrayList.add("MX-12");
        Shop market = new Shop(ArrayList);
        Scanner src = new Scanner(System.in);
        System.out.println("Введите соответсвующую цифру для команды:\n" +
                "0 - закончить программу\n" +
                "1 - поиск компьютера\n" +
                "2 - ввод компьютера в базу\n" +
                "3 - удалить компьютер из системы\n" +
                "4 - вывод список компьютеров\n");

        int command;
        do {
            command = src.nextInt();

            switch (command) {
                case 0:
                    break;
                case 1:
                    System.out.print("Какой компьютер хотели бы найти? название: ");
                    market.findComputer(src.next());
                    break;
                case 2:
                    System.out.println("Какой компьютер добавить в базу? название: ");
                    market.addComputer(src.next());
                    break;
                case 3:
                    System.out.print("Какой компьютер нужно убрать из магазина? название: ");
                    market.removeComputer(src.next());
                    break;
                case 4:
                    System.out.println(market.toString());
                    break;
                default:
                    System.out.println("Неверная команда!");
            }
        } while (command != 0);
    }
}