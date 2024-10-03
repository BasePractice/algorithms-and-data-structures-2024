package ru.mirea.practice.lab5.shape;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class ShapePanel extends JPanel {
    private final Shape[] shapes;

    public ShapePanel() {
        shapes = new Shape[20];
        Random random = new Random();

        for (int i = 0; i < shapes.length; i++) {
            int x = random.nextInt(400);
            int y = random.nextInt(400);
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

            if (random.nextBoolean()) {
                int radius = random.nextInt(50) + 10;
                shapes[i] = new Circle(color, x, y, radius);
            } else {
                int width = random.nextInt(50) + 10;
                int height = random.nextInt(50) + 10;
                shapes[i] = new Rectangle(color, x, y, width, height);
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
}

