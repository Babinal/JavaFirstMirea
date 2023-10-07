package ru.mirea.task6;

interface Movable {
    public void moveUp();
    public void moveDown();
    public void moveLeft();
    public void moveRight();
}

class MovablePoint implements Movable {
    int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp() {
        System.out.println("Движение вверх");
    }

    public void moveDown() {
        System.out.println("Движение вниз");
    }

    public void moveLeft() {
        System.out.println("Движение влево");
    }

    public void moveRight() {
        System.out.println("Движение вправо");
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}

class MovableCircle extends MovablePoint {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public void moveUp() {
        System.out.println("Движение круга вверх");
    }

    public void moveDown() {
        System.out.println("Движение круга вниз");
    }

    public void moveLeft() {
        System.out.println("Движение круга влево");
    }

    public void moveRight() {
        System.out.println("Движение круга вправо");
    }
}