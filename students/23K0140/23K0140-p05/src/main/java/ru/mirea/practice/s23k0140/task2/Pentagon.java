package ru.mirea.practice.s23k0140.task2;

class Pentagon extends Shape {
    public Pentagon(int x, int y, String color) {
        super(x,y,color);
    }

    public void shape() {
        System.out.println("Фигура - пятиугольник \nПозиция: х = " + x + " y = " + y + "\nЦвет: " + color + "\n");
    }
}