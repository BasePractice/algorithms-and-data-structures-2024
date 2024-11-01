package ru.mirea.practice.s0000005.task2;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {
    protected Color color;
    protected int a;
    protected int b;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.a = x;
        this.b = y;
    }

    public abstract void draw(Graphics g);
}