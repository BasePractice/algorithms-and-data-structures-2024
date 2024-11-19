package ru.mirea.practice.s23k0690;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;


public class Task1 extends JPanel {
    private Shape[] shapes;

    public Task1() {
        shapes = new Shape[20];
        Random random = new Random();

        for (int i = 0; i < shapes.length; i++) {
            Color randomColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            int x = random.nextInt(800);
            int y = random.nextInt(600);
            if (random.nextBoolean()) {
                int radius = random.nextInt(100) + 20; // Радиус от 20 до 119
                shapes[i] = new Circle(randomColor, x, y, radius);
            } else {
                int width = random.nextInt(100) + 20; // Ширина от 20 до 119
                int height = random.nextInt(100) + 20; // Высота от 20 до 119
                shapes[i] = new Rectangle(randomColor, x, y, width, height);
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
        Task1 randomShapes = new Task1();
        frame.add(randomShapes);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
