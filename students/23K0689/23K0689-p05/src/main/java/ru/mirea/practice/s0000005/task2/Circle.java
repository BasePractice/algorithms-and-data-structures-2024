package ru.mirea.practice.s0000005.task2;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape {
    private int radius;

    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(a, b, radius * 2, radius * 2);
    }
}