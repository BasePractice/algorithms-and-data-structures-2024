package ru.mirea.practice5;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class RandomShapesWindow extends JFrame {

    private Shape[] shapes;

    public RandomShapesWindow() {
        setTitle("Random Shapes");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        shapes = new Shape[20];
        Random random = new Random();

        for (int i = 0; i < shapes.length; i++) {
            int x = random.nextInt(700);
            int y = random.nextInt(500);
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

            if (random.nextBoolean()) {
                int radius = random.nextInt(50) + 10;
                shapes[i] = new Circle(color, x, y, radius);
            } else {
                int width = random.nextInt(100) + 20;
                int height = random.nextInt(100) + 20;
                shapes[i] = new Rectangle(color, x, y, width, height);
            }
        }

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                for (Shape shape : shapes) {
                    shape.draw(g);
                }
            }
        };

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RandomShapesWindow();
    }
}

