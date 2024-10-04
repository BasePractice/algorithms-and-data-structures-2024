package ru.mirea.practice.s0000001.task2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

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

class Circle extends Shape {
    public Circle(Color color, int x, int y) {
        super(color, x, y);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, 30, 30);
    }
}

class RectangleShape extends Shape {
    public RectangleShape(Color color, int x, int y) {
        super(color, x, y);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, 40, 20);
    }
}

class RandomShapes extends JPanel {
    private Shape[] shapes;

    public RandomShapes() {
        shapes = new Shape[20];
        Random random = new Random();
        for (int i = 0; i < shapes.length; i++) {
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            int x = random.nextInt(300);
            int y = random.nextInt(300);
            if (random.nextBoolean()) {
                shapes[i] = new Circle(color, x, y);
            } else {
                shapes[i] = new RectangleShape(color, x, y);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        RandomShapes panel = new RandomShapes();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
