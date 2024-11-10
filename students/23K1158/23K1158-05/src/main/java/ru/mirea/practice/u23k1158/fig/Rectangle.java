package ru.mirea.practice.u23k1158.fig;

class Rectangle extends Shape {

    public Rectangle(int x, int y, String color) {
        super(x,y,color);
    }

    public void shape() {
        System.out.println("Прямоугольник \n"
                + "Позиция: х = " + x
                + " y = " + y
                + "\nЦвет: " + color + "\n");
    }
}
