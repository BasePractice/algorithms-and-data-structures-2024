package ru.mirea.practice.s23l0908.task2;

import java.awt.Graphics;

public class Circle extends Shape {
    private final int radius;

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
