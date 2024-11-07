package ru.mirea.practice.s0000005.task2;

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
        g.fillRect(a, b, width, height);

        g.setColor(Color.WHITE); // Цвет выреза
        g.fillRect(a + width / 4, b + height / 4, width / 2, height / 2);
    }
}