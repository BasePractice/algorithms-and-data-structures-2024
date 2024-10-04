package ru.mirea.practice.s23k0145.lab5.task;

class Rectangle extends Shape {
    public Rectangle(int x, int y, String color) {
        super(x, y, color);
    }

    public void shape() {
        System.out.println("Фигура: Прямоугольник \n"
                + "Позиция: х = " + x
                + " y = " + y
                + "\nЦвет: " + color + "\n");
    }
}
