package ru.mirea.practice.s23k0135.task1;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class ShapePanel extends JPanel {
    private Shape[] shapes;

    public ShapePanel(int numberOfShapes) {
        shapes = new Shape[numberOfShapes];
        Random rand = new Random();

        for (int i = 0; i < numberOfShapes; i++) {
            Color randomColor = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
            int x = rand.nextInt(400);
            int y = rand.nextInt(400);
            int type = rand.nextInt(3);

            switch (type) {
                case 0:
                    shapes[i] = new Circle(randomColor, x, y, rand.nextInt(50) + 10);
                    break;
                case 1:
                    shapes[i] = new Rectangle(randomColor, x, y, rand.nextInt(50) + 20, rand.nextInt(50) + 20);
                    break;
                case 2:
                    shapes[i] = new Triangle(randomColor, x, y, rand.nextInt(50) + 20, rand.nextInt(50) + 20);
                    break;
                default:
                    // Обработка случая по умолчанию, если необходимо
                    System.out.println("Unexpected shape type: " + type);
                    break;
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

