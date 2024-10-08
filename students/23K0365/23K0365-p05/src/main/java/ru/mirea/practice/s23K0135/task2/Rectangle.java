package ru.mirea.practice.s23K0135.task2;

public class Rectangle extends Shape implements Shapes {
    int x2;
    int y2;

    @Override
    public void getShape() {
        System.out.println("Recatngle, " + this);
    }

    public Rectangle(Color color, double x, double y, int x2, int y2) {
        super(color, x, y);
        this.x2 = x2;
        this.y2 = y2;
    }
}
