package ru.mirea.practice.s23K0135.prog3;


//Квадрат
class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle() {
        //Конструктор без аргументов
    }

    // Конструктор с аргументами
    public MovableRectangle(int x1, int y1, int x2, int y2, int xspeed, int yspeed) {
        this.topLeft = new MovablePoint(x1, y1, xspeed, yspeed);
        this.bottomRight = new MovablePoint(x2, y2, xspeed, yspeed);
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    // Метод для перевода в строку
    public String toRectangleString() {
        return "Прямоугольник с вершинами: "
                + "Верхняя левая: " + topLeft.toCoordinatesString() + ", "
                + "Нижняя правая: " + bottomRight.toCoordinatesString();
    }

    @Override
    public String toString() {
        return "MovableRectangle{"
                + "topLeft=" + topLeft
                + ", bottomRight=" + bottomRight
                + '}';
    }

    // Метод для проверки скорости
    public boolean speedTest() {
        return topLeft.speedTest(bottomRight);
    }
}
