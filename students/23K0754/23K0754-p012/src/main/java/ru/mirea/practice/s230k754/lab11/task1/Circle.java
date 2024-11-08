package ru.mirea.practice.s230k754.lab11.task1;

import java.awt.Graphics;
import java.awt.Color;

public class Circle extends Shape {
    private int radius;

    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x - radius / 2, y - radius / 2, radius, radius);
    }
}

