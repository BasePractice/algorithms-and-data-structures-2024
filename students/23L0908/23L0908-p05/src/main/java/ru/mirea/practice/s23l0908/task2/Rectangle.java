package ru.mirea.practice.s23l0908.task2;


import java.awt.Graphics;


public class Rectangle extends Shape {
    protected int width;
    protected int height;

    Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.color);
        g.fillRect(x, y, width, height);
    }
}
