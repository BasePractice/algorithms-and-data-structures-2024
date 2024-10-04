package ru.mirea.practice.s23f0011.task2;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.util.Random;

class ShapePanel extends JPanel {
    private final Random random = new Random();

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Рисуем 20 случайных фигур
        for (int i = 0; i < 20; i++) {
            int shapeType = random.nextInt(2);
            int x = random.nextInt(getWidth());
            int y = random.nextInt(getHeight());
            int size = random.nextInt(50) + 10;
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

            if (shapeType == 0) {
                new Circle(color, x, y, size).draw(g2d);
            } else {
                new Square(color, x, y, size).draw(g2d);
            }
        }
    }
}