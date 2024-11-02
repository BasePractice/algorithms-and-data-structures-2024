package ru.mirea.practice.s0000001;

import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;

public abstract class Task3 {
    public static void main(String[] args) {
        final String p1 = "students/23K0688/23K0688-p12/src/main/java/ru/mirea/practice/s0000001/broj1.jpg";
        final String p2 = "students/23K0688/23K0688-p12/src/main/java/ru/mirea/practice/s0000001/broj2.jpg";
        final String p3 = "students/23K0688/23K0688-p12/src/main/java/ru/mirea/practice/s0000001/broj3.jpg";
        final String p4 = "students/23K0688/23K0688-p12/src/main/java/ru/mirea/practice/s0000001/broj4.jpg";
        final ImageIcon pic1 = new ImageIcon(p1);
        final ImageIcon pic2 = new ImageIcon(p2);
        final ImageIcon pic3 = new ImageIcon(p3);
        final ImageIcon pic4 = new ImageIcon(p4);
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(700, 700);
        JLabel lab = new JLabel();
        frame.setVisible(true);
        frame.add(lab);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        long time = System.currentTimeMillis();
        int cnt = 0;
        while (true) {
            if (System.currentTimeMillis() - time >= 1000L &&  System.currentTimeMillis() - time <= 2000L & cnt == 0) {
                lab.setIcon(pic1);
                cnt += 1;
            } else if (System.currentTimeMillis() - time >= 2000L &&  System.currentTimeMillis() - time <= 3000L & cnt == 1) {
                lab.setIcon(pic2);
                cnt += 1;
            } else if (System.currentTimeMillis() - time >= 3000L &&  System.currentTimeMillis() - time <= 4000L & cnt == 2) {
                lab.setIcon(pic3);
                cnt += 1;
            } else if (System.currentTimeMillis() - time >= 4000L &&  System.currentTimeMillis() - time <= 5000L & cnt == 3) {
                lab.setIcon(pic4);
                cnt += 1;
            }
            if (cnt == 4) {
                time = System.currentTimeMillis();
                cnt = 0;
            }
        }
    }
}
