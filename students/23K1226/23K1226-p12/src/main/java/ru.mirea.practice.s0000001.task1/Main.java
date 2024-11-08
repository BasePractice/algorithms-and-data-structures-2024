package ru.mirea.practice.s0000001.task1;

import javax.swing.JFrame;

public final class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java Main <image-path>");
            return;
        }

        final String imagePath = args[0];
        final String[] animationFrames = new String[3];
        animationFrames[0] = "frame1.png";
        animationFrames[1] = "frame2.png";
        animationFrames[2] = "frame3.png";

        JFrame frame1 = new JFrame("Random Shapes");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(500, 500);
        frame1.add(new ShapePanel());
        frame1.setVisible(true);

        JFrame frame2 = new JFrame("Image Display");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(500, 500);
        frame2.add(new ImagePanel(imagePath));
        frame2.setVisible(true);

        JFrame frame3 = new JFrame("Animation");
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setSize(500, 500);
        frame3.add(new AnimationPanel(animationFrames));
        frame3.setVisible(true);
    }

    // Приватный конструктор для предотвращения создания экземпляров класса Main
    private Main() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }
}
