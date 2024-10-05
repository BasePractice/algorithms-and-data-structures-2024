package ru.mirea.practice.s23L0908;

import java.awt.Color;
import java.awt.Graphics;

public class RectangleShape extends Shape {
    private int width;
    private int height;

    public RectangleShape(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);  // Рисуем прямоугольник
    }
}

