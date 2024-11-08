package ru.mirea.practice.s0000001;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Ex1 extends JPanel {
    private final Shape[] shapes = new Shape[20];

    public Ex1() {
        Random rand = new Random();
        for (int i = 0; i < shapes.length; i++) {
            int x = rand.nextInt(400);
            int y = rand.nextInt(400);
            Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));

            if (rand.nextBoolean()) {
                shapes[i] = new Circle(color, x, y, rand.nextInt(100));
            } else {
                shapes[i] = new Rectangle(color, x, y, rand.nextInt(100), rand.nextInt(100));
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
        frame.add(new Ex1());
        frame.setVisible(true);
    }
}
