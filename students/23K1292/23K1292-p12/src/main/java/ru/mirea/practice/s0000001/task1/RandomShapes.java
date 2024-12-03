package ru.mirea.practice.s0000001.task1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class RandomShapes extends JPanel {
    private Shape[] shapes;

    public RandomShapes() {
        shapes = new Shape[20];
        Random random = new Random();

        for (int i = 0; i < shapes.length; i++) {
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            int x = random.nextInt(400);
            int y = random.nextInt(400);
            if (random.nextBoolean()) {
                int radius = random.nextInt(50) + 10; // Радиус от 10 до 59
                shapes[i] = new Circle(color, x, y, radius);
            } else {
                int width = random.nextInt(100) + 20;  // Ширина от 20 до 119
                int height = random.nextInt(100) + 20; // Высота от 20 до 119
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

    public static void main(String[] args) {
        JFrame frame = new JFrame("Случайные фигуры");
        RandomShapes panel = new RandomShapes();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
