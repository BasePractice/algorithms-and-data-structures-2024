package ru.mirea.practice.s23f0011;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class RandomShapes extends JPanel {
    private final Shape[] shapes;

    public RandomShapes() {
        shapes = new Shape[20];
        Random random = new Random();

        for (int i = 0; i < shapes.length; i++) {
            // Генерируем случайный цвет
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            // Генерируем случайные позиции
            int x = random.nextInt(400);
            int y = random.nextInt(400);
            // Генерируем случайный тип фигуры
            if (random.nextBoolean()) {
                // Создаем круг с радиусом от 10 до 50
                int radius = 10 + random.nextInt(41);
                shapes[i] = new Circle(color, x, y, radius);
            } else {
                // Создаем прямоугольник с шириной и высотой от 20 до 80
                int width = 20 + random.nextInt(61);
                int height = 20 + random.nextInt(61);
                shapes[i] = new RectangleShape(color, x, y, width, height);
            }
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

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
}
