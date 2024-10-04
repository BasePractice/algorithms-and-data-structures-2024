package ru.mirea.practice.u23k1158.fig;

class Circle extends Shape {

    public Circle(int x, int y, String color) {
        super(x,y,color);
    }

    public void shape() {
        System.out.println("Круг \n"
                + "Позиция: х = " + x
                + " y = " + y
                + "\nЦвет: " + color + "\n");
    }
}
