package ru.mirea.task7;

import java.awt.*;
import java.util.*;

interface MathCalculable {
    public static final double pi = 3.141592;

    double power(int num, int pow);
    double absComplex(int realPart, int imaginaryPart);
    double getSquareCircle(int radius);
    double getLengthCircle(int radius);
}

class MathFunc implements MathCalculable {
    public double power(int num, int pow) {
        double result = 1;
        for(int i = 0; i < pow; i++) {
            result *= num;
        }
        return result;
    }

    public double absComplex(int realPart, int imaginaryPart) {
        return Math.sqrt(power(realPart, 2) + power(imaginaryPart, 2));
    }

    public double getSquareCircle(int radius) {
        return pi*power(radius, 2);
    }

    public double getLengthCircle(int radius) {
        return 2*pi*radius;
    }
}

class Main {
    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc();
        Scanner src = new Scanner(System.in);
        System.out.println("Введите следующие параметры:");
        System.out.print("radius = "); int radius = src.nextInt();
        System.out.print("Комплексные части числа:" +
                "\nrealPart = "); int realPart = src.nextInt();
        System.out.print("imaginaryPart = "); int imaginaryPart = src.nextInt();
        System.out.println("\nМодуль комлексного числа: " + mc1.absComplex(realPart, imaginaryPart));
        System.out.println("Площадь круга: " + mc1.getSquareCircle(radius));
        System.out.println("Окружность круга: " + mc1.getLengthCircle(radius));
    }
}