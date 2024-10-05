package ru.mirea.practice.s23L0908;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex2 extends JFrame {
    private List<Shape> shapes = new ArrayList<>();

    public Ex2() {
        setTitle("Random Shapes");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Генерируем 20 случайных фигур
        generateRandomShapes();

        // Панель для отрисовки фигур
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                for (Shape shape : shapes) {
                    shape.draw(g);
                }
            }
        };

        add(panel);
        setVisible(true);
    }

    private void generateRandomShapes() {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int x = random.nextInt(750);  // Позиция X
            int y = random.nextInt(550);  // Позиция Y
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)); // Случайный цвет

            if (random.nextBoolean()) {
                // Создаем случайный круг
                int radius = random.nextInt(50) + 20;
                shapes.add(new Circle(color, x, y, radius));
            } else {
                // Создаем случайный прямоугольник
                int width = random.nextInt(100) + 30;
                int height = random.nextInt(100) + 30;
                shapes.add(new Rectangle(color, x, y, width, height));
            }
        }
    }

    public static void main(String[] args) {
        new Ex2();
    }
}
