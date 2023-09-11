package ru.mirea.task2;

import java.util.Scanner;

public class Ball {
    private double x;
    private double y;
    private double xDisp;
    private double yDisp;

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class TestBall {
    public static void main(String[] args) {
        double x, y, xDisp, yDisp;

        Ball toy = new Ball(200, 400);
        System.out.println("Координаты мяча \nx: " + toy.getX() + "\n" +
                "y: " + toy.getY());

        Scanner src = new Scanner(System.in);
        System.out.print("Введите новую координату x: ");
        x = src.nextDouble();
        toy.setX(x);
        System.out.println(toy.toString());

        src = new Scanner(System.in);
        System.out.print("Введите новую координату y: ");
        y = src.nextDouble();
        toy.setY(y);
        System.out.println(toy.toString());

        System.out.println("Введите новые координаты 'x' и 'y' по отдельности");
        src = new Scanner(System.in);
        x = src.nextDouble();
        src = new Scanner(System.in);
        y = src.nextDouble();
        toy.setXY(x, y);
        System.out.println(toy.toString());

        System.out.println("Введите смещение мяча по 'x' и 'y' по отдельности");
        src = new Scanner(System.in);
        xDisp = src.nextDouble();
        src = new Scanner(System.in);
        yDisp = src.nextDouble();
        toy.move(xDisp, yDisp);
        System.out.println(toy.toString());
    }
}