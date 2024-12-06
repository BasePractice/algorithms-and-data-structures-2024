package ru.mirea.practice.s23l0908.task3;

import java.awt.Image;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import javax.swing.JFrame;

class AnimationFrame extends JFrame {
    Image img1;
    Image img2;
    Image img3;
    Image img4;
    Image img5;
    Image img6;
    Image img7;
    Image img8;
    DemoAnimation demoAnimation;

    public AnimationFrame() {
        setTitle("Image Animation Program using AWT");
        setSize(1000, 1000);
        setLocation(200, 200);
        setBackground(Color.LIGHT_GRAY);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        img1 = toolkit.getImage("C:\\Users\\user\\IdeaProjects\\ads\\prak12-task2\\1.jpg");
        img2 = toolkit.getImage("C:\\Users\\user\\IdeaProjects\\ads\\prak12-task2\\2.jpg");
        img3 = toolkit.getImage("C:\\Users\\user\\IdeaProjects\\ads\\prak12-task2\\3.jpg");
        img4 = toolkit.getImage("C:\\Users\\user\\IdeaProjects\\ads\\prak12-task2\\4.jpg");
        img5 = toolkit.getImage("C:\\Users\\user\\IdeaProjects\\ads\\prak12-task2\\5.jpg");
        img6 = toolkit.getImage("C:\\Users\\user\\IdeaProjects\\ads\\prak12-task2\\6.jpg");
        img7 = toolkit.getImage("C:\\Users\\user\\IdeaProjects\\ads\\prak12-task2\\7.jpg");
        img8 = toolkit.getImage("C:\\Users\\user\\IdeaProjects\\ads\\prak12-task2\\8.jpg");
        demoAnimation = new DemoAnimation(img1, img2, img3, img4, img5, img6, img7, img8);
        demoAnimation.setSize(1500, 1500); // Đặt kích thước cho canvas
        add(demoAnimation);
        setVisible(true);
        demoAnimation.repaint();
    }

    public static void main(String[] args) {
        new AnimationFrame();
    }
}
