package ru.mirea.practice.s0000001.task1;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

// Класс для отображения изображения
class ImageDisplayPanel extends JPanel {
    private Image image;

    public ImageDisplayPanel(String imagePath) {
        image = Toolkit.getDefaultToolkit().getImage(imagePath);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }
}
