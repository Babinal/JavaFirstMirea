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

        market.addComputer("JForce-MX16");
        System.out.print("Какой компьютер хотели бы найти, название: ");
        System.out.println(market.toString());
        market.findComputer(src.next());
        System.out.print("Введите название компьютера, который нужно убрать из магазина: ");
        market.removeComputer(src.next());
        System.out.println(market.toString());
    }
}