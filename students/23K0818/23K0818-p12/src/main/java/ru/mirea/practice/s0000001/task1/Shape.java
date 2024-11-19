package ru.mirea.practice.s0000001.task1;

import java.awt.Color;
import java.awt.Graphics;


// Абстрактный класс Shape
abstract class Shape {
    protected Color color;
    protected int x;
    protected int y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public abstract void draw(Graphics g);
}
