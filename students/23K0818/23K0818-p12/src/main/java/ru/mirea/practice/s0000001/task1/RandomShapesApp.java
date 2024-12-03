package ru.mirea.practice.s0000001.task1;

import javax.swing.JFrame;
import java.awt.Color;
import java.util.Random;






// Основной класс приложения
public abstract class RandomShapesApp {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int SHAPE_COUNT = 20;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);

        Shape[] shapes = new Shape[SHAPE_COUNT];
        Random random = new Random();

        for (int i = 0; i < SHAPE_COUNT; i++) {
            int x = random.nextInt(WIDTH);
            int y = random.nextInt(HEIGHT);
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            int shapeType = random.nextInt(3);
            int size = random.nextInt(50) + 20;

            switch (shapeType) {
                case 0:
                    shapes[i] = new Circle(color, x, y, size / 2);
                    break;
                case 1:
                    shapes[i] = new Rectangle(color, x, y, size, size);
                    break;
                case 2:
                    shapes[i] = new Triangle(color, x, y, size, size);
                    break;
                default:
                    System.out.println("Unknown shape type: " + shapeType);
                    break;
            }
        }

        DrawingPanel panel = new DrawingPanel(shapes);
        frame.add(panel);
        frame.setVisible(true);
    }
}
