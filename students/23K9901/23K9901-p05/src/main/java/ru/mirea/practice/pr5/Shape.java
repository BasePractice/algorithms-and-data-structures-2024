package ru.mirea.practice.pr5;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {
    protected Color shapeColor;
    protected int positionX;
    protected int positionY;

    public Shape(Color shapeColor, int positionX, int positionY) {
        this.shapeColor = shapeColor;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public abstract void draw(Graphics graphics);
}
