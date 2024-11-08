package ru.mirea.practice.s0000001.task1;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TwentyShapes extends JPanel {
    private final List<Shape> shapes;

    public TwentyShapes() {
        shapes = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            int x = rand.nextInt(300);
            int y = rand.nextInt(300);
            Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
            shapes.add(rand.nextBoolean() ? new Circle(color, x, y) : new Rectangle(color, x, y));
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new TwentyShapes());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
