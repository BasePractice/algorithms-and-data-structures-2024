package ru.mirea.practice.s0000001.prog1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public abstract class Shape {
    protected Color color;
    protected Point position;

    public Shape(Color color, Point position) {
        this.color = color;
        this.position = position;
    }

    public abstract void draw(Graphics g);
}
