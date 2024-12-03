package ru.mirea.practice.s230k754.lab11.task1;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;

public class ShapeDrawer extends JPanel {
    private Object[] figures;

    public ShapeDrawer() {
        figures = new Object[21];
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int type = random.nextInt(3); // 0 для круга, 1 для прямоугольника
            int x = random.nextInt(400);
            int y = random.nextInt(400);
            int radiusOrWidth = random.nextInt(50) + 10;
            int height = type == 1 ? random.nextInt(50) + 10 : 0;

            // Рандомный цвет
            Color color = new Color(random.nextFloat(), random.nextFloat(), random.nextFloat());

            if (type == 0) {
                figures[i] = new Circle(color, x, y, radiusOrWidth);
            } else if (type == 1) {
                figures[i] = new Rectangle(color, x, y, radiusOrWidth, height);
            } else {
                figures[i] = new Cube(height, x, y, color);

            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Object obj : figures) {
            if (obj instanceof Cube) {
                ((Cube) obj).draw(g);
            } else if (obj instanceof Circle) {
                ((Circle) obj).draw(g);
            } else if (obj instanceof Rectangle) {
                ((Rectangle) obj).draw(g);
            }
        }
    }
}
