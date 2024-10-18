package ru.mirea.practice.s23l0908.Task2;

import java.awt.*;
import java.util.Random;

public abstract class Shape {
    protected Color color;
    protected int x;
    protected int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
        Random random = new Random();
        this.color = new Color(random.nextInt(0, 256), random.nextInt(0, 256), random.nextInt(0, 256));
    }

    public abstract void draw(Graphics g);
}
