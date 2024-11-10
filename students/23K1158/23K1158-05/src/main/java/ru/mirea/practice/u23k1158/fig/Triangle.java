package ru.mirea.practice.u23k1158.fig;

class Triangle extends Shape {

    public Triangle(int x, int y, String color) {
        super(x,y,color);
    }

    public void shape() {
        System.out.println("Треугольник \n"
                + "Позиция: х = " + x
                + " y = " + y
                + "\nЦвет: " + color + "\n");
    }
}
