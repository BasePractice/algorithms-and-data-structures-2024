package ru.mirea.practice.s0000001.num2;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Image;

public class ImageWindow extends JFrame {
    private Image img;

    public ImageWindow(String path) {
        setTitle("Image Viewer");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        img = new ImageIcon(path).getImage();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(img, 0, 0, this);
    }
}
