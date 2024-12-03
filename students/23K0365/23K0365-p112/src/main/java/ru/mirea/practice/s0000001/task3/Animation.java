package ru.mirea.practice.s0000001.task3;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Animation extends JPanel {
    private final List<AnimatedShape> shapes;

    public Animation() {
        shapes = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            int x = rand.nextInt(300);
            int y = rand.nextInt(300);
            int dx = rand.nextInt(7) - 3;
            int dy = rand.nextInt(7) - 3;
            Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
            shapes.add(rand.nextBoolean() ? new Circle(color, x, y, dx, dy)
                    : new Rectangle(color, x, y, dx, dy));
        }
        Timer timer = new Timer(50, e -> {
            for (AnimatedShape shape : shapes) {
                shape.move(getWidth(), getHeight());
            }
            repaint();
        });
        timer.start();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (AnimatedShape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new Animation());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

