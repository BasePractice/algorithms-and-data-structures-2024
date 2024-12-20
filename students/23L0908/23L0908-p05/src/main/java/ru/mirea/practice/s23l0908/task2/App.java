package ru.mirea.practice.s23l0908.task2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.WindowConstants;
import java.awt.Graphics;
import java.util.Random;

public class App extends JPanel {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int MIN_SIZE = 25;
    private static final int AVERAGE = 20;
    private final Shape[] shapes;

    public App() {
        Random random = new Random();
        this.shapes = new Shape[AVERAGE];
        for (int i = 0; i < AVERAGE; ++i) {
            // Sửa lỗi nextInt để tạo giá trị ngẫu nhiên trong phạm vi
            int x = random.nextInt(WIDTH - MIN_SIZE) + MIN_SIZE;
            int y = random.nextInt(HEIGHT - MIN_SIZE) + MIN_SIZE;

            if (random.nextBoolean()) {
                // Sửa lỗi nextInt cho width và height
                int width = random.nextInt(Math.min(150, WIDTH - x - MIN_SIZE)) + MIN_SIZE;
                int height = random.nextInt(Math.min(150, HEIGHT - y - MIN_SIZE)) + MIN_SIZE;
                shapes[i] = new Rectangle(x, y, width, height);
            } else {
                // Sửa lỗi nextInt cho radius
                int radius = random.nextInt(Math.min(75, Math.min(WIDTH - x, HEIGHT - y))) + MIN_SIZE / 2;
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

