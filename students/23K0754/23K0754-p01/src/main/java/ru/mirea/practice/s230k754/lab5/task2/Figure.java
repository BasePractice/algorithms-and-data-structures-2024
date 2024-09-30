package ru.mirea.practice.s230k754.lab5.task2;


import java.awt.Graphics;

public class Figure extends Shape {
    public void draw(Graphics g) {
        switch (getR().nextInt(3)) {
            case 0:
                g.setColor(getColor());
                g.drawRect(getX(), getY(), getR().nextInt(200), getR().nextInt(200));
                break;
            case 1:
                g.setColor(getColor());
                g.drawOval(getX(), getY(), getR().nextInt(200), getR().nextInt(200));
                break;
            case 2:
                g.setColor(getColor());
                g.drawLine(getX(), getY(), getR().nextInt(100), getR().nextInt(100));
                break;
            default:
                break;
        }
    }

}
