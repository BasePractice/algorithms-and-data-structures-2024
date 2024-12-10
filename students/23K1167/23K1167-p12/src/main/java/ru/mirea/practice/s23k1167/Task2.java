package ru.mirea.practice.s23k1167;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

/**
 * Создать окно, отобразить в нем картинку, путь к которой указан в
 * аргументах командной строки.
 */

public abstract class Task2 {
    public static void main(String[] args) throws IOException {
        System.out.println(args[0]);

        JFrame f = new JFrame("Image");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new JPanelWithBG(args[0]));
        f.setSize(270, 290);
        f.setVisible(true);
    }


    static class JPanelWithBG extends JPanel {
        private final Image img;

        public JPanelWithBG(String path) throws IOException {
            img = ImageIO.read(new File(path));
        }

        public void paintComponent(Graphics g) {
            g.drawImage(img, 0, 0, this);
        }
    }
}
