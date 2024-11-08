package ru.mirea.practice.s0000001.task1;

import java.awt.Color;
import java.awt.Graphics;

// Класс Rectangle, наследующий от Shape
class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}
