package ru.mirea.practice.s23k0140.task2;

class Hexagon extends Shape {
    public Hexagon(int x, int y, String color) {
        super(x,y,color);
    }

    public void shape() {
        System.out.println("Фигура - шестиугольник \nПозиция: х = " + x + " y = " + y + "\nЦвет: " + color + "\n");
    }
}