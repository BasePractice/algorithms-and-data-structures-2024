package ru.mirea.practice.s0000001.task1;

import java.awt.Graphics;
import java.util.Random;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle() {
        super();
        Random rand = new Random();
        this.width = rand.nextInt(50) + 30;
        this.height = rand.nextInt(50) + 30;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}
