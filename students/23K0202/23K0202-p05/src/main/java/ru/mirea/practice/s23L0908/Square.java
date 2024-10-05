package ru.mirea.practice.s23L0908;

class Square extends Shape {
    public Square(int x, int y, String color) {
        super(x,y,color);
    }

    public void shape() {
        System.out.println("Фигура - квадрат \nПозиция: х = " + x + " y = " + y + "\nЦвет: " + color + "\n");
    }
}
