package ru.mirea.practice.s0000001;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Task1 {
    // Абстрактный класс Shape
    abstract class Shape {
        protected Color color;
        protected int x;
        protected int y;

        public Shape(Color color, int x, int y) {
            this.color = color;
            this.x = x;
            this.y = y;
        }

        public abstract void draw(Graphics g);
    }

    // Класс Circle
    class Circle extends Shape {
        private int radius;

        public Circle(Color color, int x, int y, int radius) {
            super(color, x, y);
            this.radius = radius;
        }

        @Override
        public void draw(Graphics g) {
            g.setColor(color);
            g.fillOval(x, y, radius, radius);
        }
    }

    // Класс Rectangle
    class RectangleShape extends Shape {
        private int width;
        private int height;

        public RectangleShape(Color color, int x, int y, int width, int height) {
            super(color, x, y);
            this.width = width;
            this.height = height;
        }

        @Override
        public void draw(Graphics g) {
            g.setColor(color);
            g.fillRect(x, y, width, height);
        }
    }

    // Панель для отрисовки фигур
    class ShapePanel extends JPanel {
        private Shape[] shapes;

        public ShapePanel() {
            Random random = new Random();
            shapes = new Shape[20];

            for (int i = 0; i < shapes.length; i++) {
                Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
                int x = random.nextInt(400);
                int y = random.nextInt(400);

                if (random.nextBoolean()) {
                    int radius = random.nextInt(50) + 10;
                    shapes[i] = new Circle(color, x, y, radius);
                } else {
                    int width = random.nextInt(50) + 10;
                    int height = random.nextInt(50) + 10;
                    shapes[i] = new RectangleShape(color, x, y, width, height);
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
    }

    // Главный класс для отображения окна
    public abstract class Main {
        public void main(String[] args) {
            JFrame frame = new JFrame("Random Shapes");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 500);
            frame.add(new Task1().new ShapePanel());
            frame.setVisible(true);
        }
    }
}
