package ru.mirea.practice.s23L0908.prog3;


// Класс, представляющий точку с координатами и скоростью
class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xspeed;
    private int yspeed;


    public MovablePoint() {
        // Конструктор без аргументов
    }

    // Конструктор с аргументами
    public MovablePoint(int x, int y, int xspeed, int yspeed) {
        this.x = x;
        this.y = y;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    @Override
    public void moveUp() {
        y -= yspeed;
    }

    @Override
    public void moveDown() {
        y += yspeed;
    }

    @Override
    public void moveLeft() {
        x -= xspeed;
    }

    @Override
    public void moveRight() {
        x += xspeed;
    }

    // Метод для перевода координат в строку
    public String toCoordinatesString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public String toString() {
        return "MovablePoint{"
                + "x=" + x
                + ", y=" + y
                + ", xspeed=" + xspeed
                + ", yspeed=" + yspeed
                + '}';
    }

    // Метод для проверки скорости
    public boolean speedTest(MovablePoint other) {
        return xspeed == other.xspeed && yspeed == other.yspeed;
    }

}
