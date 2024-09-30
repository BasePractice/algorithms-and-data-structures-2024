package ru.mirea.practice.s0000001;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class Task1 {
    public static void main(String[] args) {
        int[] r1 = {0};
        int[] r2 = {0};
        JButton b1 = new JButton("AC Milan");
        JButton b2 = new JButton("Real Madrid");
        JLabel l1 = new JLabel("Result: 0 X 0", JLabel.CENTER);
        JLabel l2 = new JLabel("Last Scorer:", JLabel.LEFT);
        JLabel l3 = new JLabel("Winner: DRAW", JLabel.RIGHT);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                r1[0] += 1;
                l1.setText("Result: " + r1[0] + " X " + r2[0]);
                l2.setText("Last Scorer:AC Milan");
                if (r1[0] > r2[0]) {
                    l3.setText("Winner: AC Milan");
                } else if (r1[0] == r2[0]) {
                    l3.setText("Winner: Draw");
                } else if (r1[0] < r2[0]) {
                    l3.setText("Winner: Real Madrid");
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                r2[0] += 1;
                l1.setText("Result: " + r1[0] + " X " + r2[0]);
                l2.setText("Last Scorer:Real Madrid");
                if (r1[0] > r2[0]) {
                    l3.setText("Winner: AC Milan");
                } else if (r1[0] == r2[0]) {
                    l3.setText("Winner: Draw");
                } else if (r1[0] < r2[0]) {
                    l3.setText("Winner: Real Madrid");
                }
            }
        });
        JPanel p = new JPanel();
        p.setPreferredSize(new Dimension(400,400));
        p.setSize(400,400);
        JFrame f = new JFrame();
        f.setSize(400, 400);
        p.add(b1);
        p.add(b2);
        p.add(l1);
        p.add(l2);
        p.add(l3);
        f.getContentPane().add(p);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}