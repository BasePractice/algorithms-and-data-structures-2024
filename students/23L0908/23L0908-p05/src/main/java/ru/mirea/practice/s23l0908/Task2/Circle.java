package ru.mirea.practice.s23l0908.Task2;

import java.awt.*;

public class Circle extends Shape {
    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}
