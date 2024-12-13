package ru.mirea.practice.s0000001.num1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class RandomShapeWindow extends JPanel {
    private Shape[] shapes = new Shape[20];
    private Random rand = new Random();

    public RandomShapeWindow() {
        for (int i = 0; i < 20; i++) {
            int x = rand.nextInt(500);
            int y = rand.nextInt(500);
            Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));

            if (rand.nextBoolean()) {
                int radius = rand.nextInt(50) + 20;
                shapes[i] = new Circle(x, y, color, radius);
            } else {
                int width = rand.nextInt(100) + 50;
                int height = rand.nextInt(100) + 50;
                shapes[i] = new Rectangle(x, y, color, width, height);
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
        RandomShapeWindow panel = new RandomShapeWindow();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.add(panel);
        frame.setVisible(true);
    }
}
