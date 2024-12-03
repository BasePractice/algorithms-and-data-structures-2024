package ru.mirea.practice.s23k0215.task1;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int x, int y, Color color, int width, int height) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}
