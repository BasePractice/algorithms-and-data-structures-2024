package ru.mirea.practice.s0000001;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;

public class Main extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Random random = new Random();
        Shape[] shapeArray = {
            new Circle("Circle", Color.BLACK, 0, 0, 0),
            new Square("Square", Color.BLACK, 0, 0, 0),
            new Rectangle("Rectangle", Color.BLACK, 0, 0, 0, 0)
        };

        Color[] availableColors = {
            Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW,
            Color.ORANGE, Color.PINK, Color.MAGENTA
        };

        for (int i = 0; i < 20; i++) {
            int shapeIndex = random.nextInt(shapeArray.length);
            Shape currentShape = shapeArray[shapeIndex];

            Color randomColor = availableColors[random.nextInt(availableColors.length)];
            currentShape.setColor(randomColor);
            int posX = random.nextInt(300);
            int posY = random.nextInt(300);

            if (currentShape instanceof Circle) {
                Circle circle = (Circle) currentShape;
                circle.setX(posX);
                circle.setY(posY);
                circle.setRadius(random.nextInt(100));
                g.setColor(circle.getColor());
                g.fillOval(circle.getX(), circle.getY(), circle.getRadius(), circle.getRadius());
            } else if (currentShape instanceof Square) {
                Square square = (Square) currentShape;
                square.setX(posX);
                square.setY(posY);
                square.setSide(random.nextInt(100));
                g.setColor(square.getColor());
                g.fillRect(square.getX(), square.getY(), square.getSide(), square.getSide());
            } else if (currentShape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) currentShape;
                rectangle.setX(posX);
                rectangle.setY(posY);
                rectangle.setWidth(random.nextInt(100));
                rectangle.setLength(random.nextInt(100));
                g.setColor(rectangle.getColor());
                g.fillRect(rectangle.getX(), rectangle.getY(), rectangle.getLength(), rectangle.getWidth());
            }
        }
    }

    public static void main(String[] args) {
        JFrame window = new JFrame("Random Shape Drawer");
        Main drawingPanel = new Main();

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(drawingPanel);
        window.setSize(400, 400);
        window.setVisible(true);
    }
}