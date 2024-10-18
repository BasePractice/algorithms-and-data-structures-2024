package ru.mirea.practice.s230k754.lab11.task1;

import java.awt.Graphics;
import java.awt.Color;

public class Cube extends Shape {
    private int lenCube;

    public Cube(int lenCube, int x, int y, Color color) {
        super(color, x, y);
        this.lenCube = lenCube;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(lenCube, lenCube, lenCube, lenCube);
    }
}
