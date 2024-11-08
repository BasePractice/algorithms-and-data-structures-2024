package ru.mirea.practice.s0000001.task1;

import java.awt.Graphics;
import java.util.Random;

public class Circle extends Shape {
    private int radius;

    public Circle() {
        super();
        Random rand = new Random();
        this.radius = rand.nextInt(50) + 20;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, radius, radius);
    }
}
