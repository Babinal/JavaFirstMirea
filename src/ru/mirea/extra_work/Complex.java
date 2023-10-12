package ru.mirea.extra_work;

import java.util.Arrays;

public class Complex {
    private int re, im;

    public Complex(int re, int im) {
        this.re = re;
        this.im = im;
    }

    public Complex minus(Complex z) {
        return new Complex(this.re - z.getRe(), this.im - z.getIm());
    }

    public Complex plus(Complex z) {
        return new Complex(this.re + z.getRe(), this.im + z.getIm());
    }
    public int getRe() {
        return this.re;
    }

    public int getIm() {
        return im;
    }

    @Override
    public String toString() {
        return String.format("%di + %d", re, im);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Complex other = (Complex) obj;
        return Double.compare(other.re, re) == 0 && Double.compare(other.im, im) == 0;
    }
}


class ComplexTest {
    public static void main(String[] args) {
        Complex z = new Complex(3,4);
        System.out.println("Комплексное число z: " + z);
        z = z.plus(new Complex(3, 2));
        System.out.println("Комплексное число z: " + z);
        z = z.minus(new Complex(2,1));
        System.out.println("Комплексное число z: " + z);
        Complex z1 = new Complex(4,5);
        System.out.println("Комплексное число z1: " + z1);
        System.out.println(z.equals(z1) ? "z == z1":"z != z1");
    }
}