package ru.mirea.practice.s0000001;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.io.IOException;

public abstract class Task4 {
    public static void main(String[] avg) throws IOException {
        final String p1 = "students/23K0688/23K0688-p05/src/main/java/ru/mirea/practice/s0000001/img1.png";
        final String p2 = "students/23K0688/23K0688-p05/src/main/java/ru/mirea/practice/s0000001/img2.png";
        final String p3 = "students/23K0688/23K0688-p05/src/main/java/ru/mirea/practice/s0000001/img3.png";
        final String p4 = "students/23K0688/23K0688-p05/src/main/java/ru/mirea/practice/s0000001/img4.png";
        final ImageIcon pic1 = new ImageIcon(p1);
        final ImageIcon pic2 = new ImageIcon(p2);
        final ImageIcon pic3 = new ImageIcon(p3);
        final ImageIcon pic4 = new ImageIcon(p4);
        JFrame f = new JFrame();
        f.setLayout(new FlowLayout());
        f.setSize(700,700);
        JLabel l = new JLabel();
        f.setVisible(true);
        f.add(l);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int cnt = 1;
        final int time = 100000000;
        while (true) {
            switch (cnt) {
                case 1 * time:
                    l.setIcon(pic1);
                    break;
                case 2 * time:
                    l.setIcon(pic2);
                    break;
                case 3 * time:
                    l.setIcon(pic3);
                    break;
                case 4 * time:
                    l.setIcon(pic4);
                    break;
                case 5 * time:
                    cnt = 1;
                    break;
                default:
                    break;
            }
            cnt += 1;
        }
    }
}
