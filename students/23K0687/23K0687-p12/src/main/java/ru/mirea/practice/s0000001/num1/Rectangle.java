package ru.mirea.practice.s0000001.num1;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape {
    int w;
    int h;

    public Rectangle(int x, int y, Color color, int w, int h) {
        super(x, y, color);
        this.w = w;
        this.h = h;
    }

    @Override
    void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x - w / 2, y - h / 2, w, h);  // Центрирование прямоугольника
    }
}
