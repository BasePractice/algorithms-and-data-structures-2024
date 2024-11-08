package ru.mirea.practice.s0000001.n2;

import javax.swing.JFrame;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.Graphics;
import java.io.IOException;

public class ImageWindow extends JFrame {
    private Image img;

    public ImageWindow(String path) {
        try {
            img = ImageIO.read(new File(path));
        } catch (IOException e) {
            System.out.println("Ошибка загрузки изображения:( " + e.getMessage());
            System.exit(1);
        }

        setTitle("Image_cool_Viewer");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (img != null) {
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Пожалуйста, укажите путь к изображению в аргументах командной строки ^_^");
            System.exit(1);
        }
        String imagePath = args[0];
        ImageWindow window = new ImageWindow(imagePath);
        window.setVisible(true);
    }
}
