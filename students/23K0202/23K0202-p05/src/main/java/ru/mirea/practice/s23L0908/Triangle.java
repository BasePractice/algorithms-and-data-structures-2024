package ru.mirea.practice.s23L0908;

class Triangle extends Shape {
    public Triangle(int x, int y, String color) {
        super(x,y,color);
    }

    public void shape() {
        System.out.println("Фигура - треугольник \nПозиция: х = " + x + " y = " + y + "\nЦвет: " + color + "\n");
    }
}