package ru.mirea.practice.s23k0755.task3;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public abstract class Main {
    public static void main(String[] args) throws IOException {
        BufferedImage image = ImageIO.read(new File("students/23K0120/23K0120-p12/assets/nyan_cat.png"));
        ImageFrame frame = new ImageFrame(image);
        frame.getClass();
    }
}
