package ru.mirea.practice.s23L0908;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Drawing extends JPanel {
    private List<Shape> shapes;  // Список фигур

    public Drawing() {
        shapes = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            Color randomColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            int x = random.nextInt(400);  // Случайная позиция по оси X
            int y = random.nextInt(400);  // Случайная позиция по оси Y
            if (random.nextBoolean()) {
                int radius = random.nextInt(30) + 10;  // Случайный радиус
                shapes.add(new Circle(randomColor, x, y, radius));
            } else {
                int width = random.nextInt(50) + 20;  // Случайная ширина
                int height = random.nextInt(50) + 20; // Случайная высота
                shapes.add(new RectangleShape(randomColor, x, y, width, height));
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

