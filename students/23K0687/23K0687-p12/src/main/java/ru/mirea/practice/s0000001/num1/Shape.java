package ru.mirea.practice.s0000001.num1;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {
    Color color;
    int x;
    int y;

    public Shape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    abstract void draw(Graphics g);
}
