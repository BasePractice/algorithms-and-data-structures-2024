package ru.mirea.practice.s24k0112;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;

public class ShapeDrawingExample extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Random rd = new Random();
        Shape[] shapes = {new Circle("circle", Color.BLACK, 0, 0, 0),
                          new Square("square", Color.BLACK, 0, 0, 0), new Rectangle("rectangle",
                          Color.BLACK, 0, 0, 0, 0)};
        Color[] colors = {Color.RED, Color.BLACK, Color.CYAN, Color.BLUE, Color.GRAY, Color.ORANGE, Color.MAGENTA};

        for (int i = 0; i < 20; i++) {
            int randomShapeIndex = rd.nextInt(3);
            Shape randomShape = shapes[randomShapeIndex];

            if ("circle".equals(randomShape.getName())) {
                Circle randomShapeChanged = (Circle) randomShape;
                randomShapeChanged.setColor(colors[rd.nextInt(colors.length)]);
                randomShapeChanged.setX(rd.nextInt(300));
                randomShapeChanged.setY(rd.nextInt(300));
                randomShapeChanged.setRadius(rd.nextInt(100));

                g.setColor(randomShapeChanged.getColor());
                g.fillOval(randomShapeChanged.getX(), randomShapeChanged.getY(), randomShapeChanged.getRadius(), randomShapeChanged.getRadius());
            } else if ("square".equals(randomShape.getName())) {
                Square randomShapeChanged = (Square) randomShape;
                randomShapeChanged.setColor(colors[rd.nextInt(colors.length)]);
                randomShapeChanged.setX(rd.nextInt(300));
                randomShapeChanged.setY(rd.nextInt(300));
                randomShapeChanged.setSide(rd.nextInt(100));

                g.setColor(randomShapeChanged.getColor());
                g.fillRect(randomShapeChanged.getX(), randomShapeChanged.getY(), randomShapeChanged.getSide(), randomShapeChanged.getSide());
            } else {
                Rectangle randomShapeChanged = (Rectangle) randomShape;
                randomShapeChanged.setColor(colors[rd.nextInt(colors.length)]);
                randomShapeChanged.setX(rd.nextInt(300));
                randomShapeChanged.setY(rd.nextInt(300));
                randomShapeChanged.setWidth(rd.nextInt(100));
                randomShapeChanged.setLength(rd.nextInt(100));

                g.setColor(randomShapeChanged.getColor());
                g.fillRect(randomShapeChanged.getX(), randomShapeChanged.getY(), randomShapeChanged.getLength(), randomShapeChanged.getWidth());
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Shape Drawing Example");
        ShapeDrawingExample panel = new ShapeDrawingExample();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}