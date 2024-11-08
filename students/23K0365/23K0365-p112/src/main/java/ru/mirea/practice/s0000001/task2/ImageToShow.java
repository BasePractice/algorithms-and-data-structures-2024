package ru.mirea.practice.s0000001.task2;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Graphics;

public class ImageToShow extends JPanel {
    private final Image img;

    public ImageToShow(String path) {
        img = new ImageIcon(path).getImage();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, 0, 0, this);
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("insert way to picture");
            System.exit(1);
        }
        JFrame frame = new JFrame();
        frame.add(new ImageToShow(args[0]));
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
