package ru.mirea.practice.s23k0215.task1;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape {
    private int radius;

    public Circle(int x, int y, Color color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, radius, radius);
    }
}
