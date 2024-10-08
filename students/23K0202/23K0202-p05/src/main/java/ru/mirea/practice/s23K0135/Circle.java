package ru.mirea.practice.s23K0135;

class Circle extends Shape {
    public Circle(int x, int y, String color) {
        super(x,y,color);
    }

    public void shape() {
        System.out.println("Фигура - круг \nПозиция: х = " + x + " y = " + y + "\nЦвет: " + color + "\n");
    }
}
