package ru.mirea.practice.s0000007.task3;


public class MovablePoint implements Movable {
    private int x;      // Координата по оси X
    private int y;      // Координата по оси Y
    private int speed;  // Скорость точки

    public MovablePoint(int x, int y, int speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    @Override
    public void moveUp() {
        y -= speed;
    }

    @Override
    public void moveDown() {
        y += speed;
    }

    @Override
    public void moveLeft() {
        x -= speed;
    }

    @Override
    public void moveRight() {
        x += speed;
    }

    @Override
    public String toString() {
        return "MovablePoint [x=" + x + ", y=" + y + ", speed=" + speed + "]";
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSpeed() {
        return speed;
    }

    // Метод для проверки скорости
    public boolean isSameSpeed(MovablePoint other) {
        return this.speed == other.getSpeed();
    }
}