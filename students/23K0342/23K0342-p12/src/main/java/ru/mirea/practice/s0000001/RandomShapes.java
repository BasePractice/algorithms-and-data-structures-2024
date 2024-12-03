package ru.mirea.practice.s0000001;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomShapes extends JPanel {
    private List<Shape> shapes;

    public RandomShapes() {
        shapes = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            int x = random.nextInt(400); // Ограничение по ширине
            int y = random.nextInt(400); // Ограничение по высоте

            if (random.nextBoolean()) {
                // Создаем круг
                int radius = random.nextInt(50) + 10; // Радиус от 10 до 59
                shapes.add(new Circle(color, x, y, radius));
            } else {
                // Создаем прямоугольник
                int width = random.nextInt(100) + 20; // Ширина от 20 до 119
                int height = random.nextInt(100) + 20; // Высота от 20 до 119
                shapes.add(new RectangleShape(color, x, y, width, height));
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
        RandomShapes panel = new RandomShapes();

        frame.add(panel);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
