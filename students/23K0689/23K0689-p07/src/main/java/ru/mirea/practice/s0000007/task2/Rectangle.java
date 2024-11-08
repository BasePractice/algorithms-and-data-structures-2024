package ru.mirea.practice.s0000007.task2;


// Класс Rectangle
public class Rectangle {
    protected MovablePoint topLeft;     // Верхняя левая точка
    protected MovablePoint bottomRight;  // Нижняя правая точка

    public Rectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public String toString() {
        return "Rectangle [topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }
}