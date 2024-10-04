package ru.mirea.practice.s23k0140.task2;

class Diamond extends Shape {
    public Diamond(int x, int y, String color) {
        super(x,y,color);
    }

    public void shape() {
        System.out.println("Фигура - ромб \nПозиция: х = " + x + " y = " + y + "\nЦвет: " + color + "\n");
    }
}