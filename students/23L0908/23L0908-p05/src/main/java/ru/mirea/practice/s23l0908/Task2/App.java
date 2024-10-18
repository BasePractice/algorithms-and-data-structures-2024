package ru.mirea.practice.s23l0908.Task2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class App extends JPanel {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int MIN_SIZE = 25;
    private static final int AVERAGE = 20;
    private Shape[] shapes;

    public App() {
        Random random = new Random();
        this.shapes = new Shape[AVERAGE];
        for (int i = 0; i < AVERAGE; ++i) {
            int x = random.nextInt(0, WIDTH - MIN_SIZE);
            int y = random.nextInt(0, HEIGHT - MIN_SIZE);

            if (random.nextBoolean()) {
                int width = random.nextInt(MIN_SIZE, Math.min(150, WIDTH - x));
                int height = random.nextInt(MIN_SIZE, Math.min(150, HEIGHT - y));
                shapes[i] = new Rectangle(x, y, width, height);
            } else {
                int radius = random.nextInt(MIN_SIZE / 2, Math.min(75, Math.min(WIDTH - x, HEIGHT - y)));
                shapes[i] = new Circle(Math.max(x, radius), Math.max(y, radius), radius);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : this.shapes) {
            shape.draw(g);
        }
    }

    public void run() {
        JFrame frame = new JFrame("Shapes");
        frame.setBackground(new Color(255, 255, 255));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);

        frame.add(this);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
