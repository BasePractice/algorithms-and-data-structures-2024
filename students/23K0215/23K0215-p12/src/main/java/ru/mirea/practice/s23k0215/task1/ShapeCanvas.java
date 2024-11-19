package ru.mirea.practice.s23k0215.task1;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShapeCanvas extends JPanel {
    private List<Shape> shapes;

    public ShapeCanvas() {
        shapes = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 20; i++) {
            int x = rand.nextInt(400);
            int y = rand.nextInt(400);
            Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
            if (rand.nextBoolean()) {
                shapes.add(new Circle(x, y, color, rand.nextInt(50) + 10));
            } else {
                shapes.add(new Rectangle(x, y, color, rand.nextInt(50) + 10, rand.nextInt(50) + 10));
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
