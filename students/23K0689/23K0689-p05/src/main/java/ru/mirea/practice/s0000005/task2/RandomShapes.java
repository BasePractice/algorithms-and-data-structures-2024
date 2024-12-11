package ru.mirea.practice.s0000005.task2;

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
                if (random.nextBoolean()) {
                    int size = random.nextInt(40) + 10; // Размер от 10 до 50
                    shapes[i] = new Star(color, x, y, size);
                } else {
                    int radius = random.nextInt(50) + 10; // Радиус от 10 до 60
                    shapes[i] = new Circle(color, x, y, radius);
                }
            } else {
                int width = random.nextInt(60) + 10; // Ширина от 10 до 70
                int height = random.nextInt(60) + 10; // Высота от 10 до 70
                shapes[i] = new RectangleShape(color, x, y, width, height);
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
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}