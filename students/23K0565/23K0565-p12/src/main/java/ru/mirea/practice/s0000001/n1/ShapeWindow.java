package ru.mirea.practice.s0000001.n1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;
import java.awt.Graphics;
import java.awt.Color;

public class ShapeWindow extends JPanel {
    private List<Shape> shapes = new ArrayList<>();

    public ShapeWindow() {
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
            int x = rand.nextInt(400);
            int y = rand.nextInt(400);

            if (rand.nextBoolean()) {
                shapes.add(new Circle(color, x, y, rand.nextInt(50) + 10));
            } else {
                shapes.add(new Rectangle(color, x, y, rand.nextInt(50) + 10, rand.nextInt(50) + 10));
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
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(new ShapeWindow());
        frame.setVisible(true);
    }
}
