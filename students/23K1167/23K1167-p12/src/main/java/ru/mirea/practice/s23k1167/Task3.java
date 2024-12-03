package ru.mirea.practice.s23k1167;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Создать окно, реализовать анимацию, с помощью картинки,
 * состоящей из нескольких кадров.
 * NOTE: Папка frames находится в работе 5.
 */

public abstract class Task3 {
    public static void main(String[] args) throws IOException, InterruptedException {

        JFrame f = new JFrame("Image");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanelWithBG comp = new JPanelWithBG("23K0341-p05/src/main/java/ru/mirea/practice/s0000001/frames/0001.png");
        f.add(comp);
        f.setSize(comp.width + 14, comp.height + 37);
        f.setVisible(true);

        int maxFrameN = 6572;
        for (int i = 2; i <= maxFrameN; i++) {
            f.remove(comp);
            comp = new JPanelWithBG(String.format("23K0341-p05/src/main/java/ru/mirea/practice/s0000001/frames/%04d.png", i));
            f.add(comp);
            int a = (i % 2 == 0) ? 1 : 0;
            f.setSize(comp.width + 13 + a, comp.height + 37);
            System.out.printf("23K0341-p05/src/main/java/ru/mirea/practice/s0000001/frames/%04d.png\n", i);
            TimeUnit.MILLISECONDS.sleep(24);
        }
    }


    static class JPanelWithBG extends JPanel {
        private final BufferedImage img;
        public int width;
        public int height;

        public JPanelWithBG(String path) throws IOException {
            img = ImageIO.read(new File(path));
            width = img.getWidth();
            height = img.getHeight();
        }

        public void paintComponent(Graphics g) {
            g.drawImage(img, 0, 0, this);
        }
    }
}
