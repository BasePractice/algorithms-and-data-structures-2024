package ru.mirea.practices0000001.task1;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.swing.ImageIcon;

public abstract class ShapeGenerator {
    public static void main(String[] args) {

        BufferedImage image = new BufferedImage(800, 600, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 800, 600);

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            Color color = new Color(random.nextFloat(), random.nextFloat(), random.nextFloat());
            int x = random.nextInt(750);
            int y = random.nextInt(550);
            int type = random.nextInt(3);
            if (type == 0) {
                Circle circle = new Circle(color, x, y, random.nextInt(50) + 10);
                circle.draw(g);
            } else if (type == 1) {
                Rectangle rectangle = new Rectangle(color, x, y, random.nextInt(50) + 10, random.nextInt(50) + 10);
                rectangle.draw(g);
            } else {
                Triangle triangle = new Triangle(color, x, y, random.nextInt(50) + 10, random.nextInt(50) + 10);
                triangle.draw(g);
            }
        }

        try {
            ImageIO.write(image, "png", new File("shapes.png"));
        } catch (IOException e) {
            System.err.println("Error saving image: " + e.getMessage());
            System.exit(1);
        }

        JFrame frame = new JFrame("Davinchi8000");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel(new ImageIcon("shapes.png"));
        frame.add(label);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
}
