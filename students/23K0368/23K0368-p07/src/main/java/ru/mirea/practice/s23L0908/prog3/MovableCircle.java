package ru.mirea.practice.s23L0908.prog3;

// Класс, представляющий круг, который может перемещаться
class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;


    public MovableCircle() {
        // Конструктор без аргументов
    }

    // Конструктор с аргументами
    public MovableCircle(int x, int y, int xspeed, int yspeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xspeed, yspeed);
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    // Метод для перевода в строку
    public String toCircleString() {
        return "Окружность с центром в " + center.toCoordinatesString() + " и радиусом " + radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{"
                + "radius=" + radius
                + ", center=" + center
                + '}';
    }
}
