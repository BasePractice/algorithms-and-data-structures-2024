package ru.mirea.practice.s23k0215.task1;


import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {
    protected int x; // Позиция фигуры по оси X
    protected int y; // Позиция фигуры по оси Y
    protected Color color; // Цвет фигуры

    public Shape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public abstract void draw(Graphics g);
}
