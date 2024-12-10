package ru.mirea.practice.s23k0755.task3;


import javax.swing.JFrame;
import java.awt.Image;
import java.awt.Dimension;


public class ImageFrame extends JFrame {
    JFrame frame;

    public ImageFrame(Image image) {
        int height = image.getHeight(this);
        int width = image.getWidth(this);
        int frameNum = 12;

        frame = new JFrame();
        frame.setPreferredSize(new Dimension(width, height / frameNum));
        frame.add(new PaintComponent(image, 0, 0, width, height / frameNum, frameNum, this));

        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();
        frame.setVisible(true);
    }

}
