package ru.mirea.practice.s0000001.num3;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public final class Main {
    private Main() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Укажите путь к изображению.");
            return;
        }

        try {
            Image img = ImageIO.read(new File(args[0]));
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 600);
            frame.add(new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    g.drawImage(img, 0, 0, this);
                }
            });
            frame.setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
