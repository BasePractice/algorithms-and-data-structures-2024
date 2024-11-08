package ru.mirea.practice.s23k0505.task1.myframe;

import ru.mirea.practice.s23k0505.task1.shapes.Circle;
import ru.mirea.practice.s23k0505.task1.shapes.Rectangle;
import ru.mirea.practice.s23k0505.task1.shapes.Shape;
import ru.mirea.practice.s23k0505.task1.shapes.Square;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.util.Random;

public class PaintComponent extends Component {
    private final Dimension dimension;
    private final Random random = new Random();

    public PaintComponent(Dimension dimension) {
        this.dimension = dimension;
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Shape[] shapes = {new Rectangle(),
            new Circle(), new Square()};

        for (int i = 0; i < 20; i++) {
            Shape shape = shapes[random.nextInt(shapes.length)];
            shape.setFilled(random.nextBoolean());
            Color color = new Color(random.nextFloat(), random.nextFloat(), random.nextFloat());
            shape.setColor(color);
            int x = random.nextInt(Math.max(dimension.width - 200, 300));
            int y = random.nextInt(Math.max(dimension.height - 200, 300));
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                circle.setR(random.nextInt(150) + 50);
                circle.draw(x, y, g2);
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                rectangle.setWidth(random.nextInt(150) + 50);
                rectangle.setHeight(random.nextInt(150) + 50);
                rectangle.draw(x, y, g2);
            } else if (shape instanceof Square) {
                Square square = (Square) shape;
                square.setSide(random.nextInt(150) + 50);
                square.draw(x, y, g2);
            }
        }
    }
}
