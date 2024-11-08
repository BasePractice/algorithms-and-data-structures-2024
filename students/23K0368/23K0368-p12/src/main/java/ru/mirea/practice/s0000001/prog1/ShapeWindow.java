package ru.mirea.practice.s0000001.prog1;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShapeWindow extends JFrame {
    private static final int WIDTH = 600;
    private static final int HEIGHT = 400;
    private List<Shape> shapes = new ArrayList<>();

    public ShapeWindow() {
        setTitle("Случайные фигуры");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Создание 20 случайных фигур
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int shapeType = random.nextInt(3); // 0 - круг, 1 - квадрат, 2 - прямоугольник
            switch (shapeType) {
                case 0:
                    shapes.add(new Circle(randomColor(), randomPosition(WIDTH, HEIGHT)));
                    break;
                case 1:
                    shapes.add(new Square(randomColor(), randomPosition(WIDTH, HEIGHT)));
                    break;
                case 2:
                    shapes.add(new Rectangle(randomColor(), randomPosition(WIDTH, HEIGHT)));
                    break;
                default:
                    System.out.println("Выход из switch");
                    break;
            }
        }

        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    private Color randomColor() {
        Random random = new Random();
        return new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }

    private Point randomPosition(int width, int height) {
        Random random = new Random();
        return new Point(random.nextInt(width), random.nextInt(height));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ShapeWindow::new);
    }
}

