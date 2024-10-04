package ru.mirea.practice.s23k0130.figure;

class Triangle extends Shape {
    public Triangle(int x, int y, String color) {
        super(x,y,color);
    }

    public void shape() {
        System.out.println("Фигура: Треугольник \n"
                + "Позиция: х = " + x
                + " y = " + y
                + "\nЦвет: " + color + "\n");
    }
}
