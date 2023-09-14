package ru.mirea.task2;

import java.util.Scanner;

public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center: " + center.toString() +
                "; radius=" + radius +
                '}';
    }
}

class TestCircleNPoint {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Введите количество окружностей: ");
        int numCircles = src.nextInt();
        Circle[] circles = new Circle[numCircles];

        for (int i = 0; i < numCircles; i++) {
            System.out.println("Введите координаты центра окружности " + (i + 1) + ":");
            System.out.print("X: ");
            double x = src.nextDouble();
            System.out.print("Y: ");
            double y = src.nextDouble();
            System.out.print("Введите радиус окружности: ");
            double radius = src.nextDouble();

            Point center = new Point(x, y);
            circles[i] = new Circle(center, radius);
        }

        System.out.println("Созданные окружности:");
        for (int i = 0; i < numCircles; i++) {
            Circle circle = circles[i];
            System.out.println("Окружность " + (i + 1) + ":\n" + circle.toString());
        }
    }
}
