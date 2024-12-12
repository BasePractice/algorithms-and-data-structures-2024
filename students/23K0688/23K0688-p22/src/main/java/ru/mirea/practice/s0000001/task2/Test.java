package ru.mirea.practice.s0000001.task2;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class Test {
    public static void main(String[] args) {
        StringBuilder numb = new StringBuilder();
        final JButton b1 = new JButton("0");
        final JButton b2 = new JButton("1");
        final JButton b3 = new JButton("2");
        final JButton b4 = new JButton("3");
        final JButton b5 = new JButton("4");
        final JButton b6 = new JButton("5");
        final JButton b7 = new JButton("6");
        final JButton b8 = new JButton("7");
        final JButton b9 = new JButton("8");
        final JButton b10 = new JButton("9");
        final JButton b11 = new JButton(" ");
        final JButton b12 = new JButton("*");
        final JButton b13 = new JButton("/");
        final JButton b14 = new JButton("+");
        final JButton b15 = new JButton("-");
        final JButton b16 = new JButton("=");
        JLabel l = new JLabel(String.valueOf(numb), SwingConstants.CENTER);
        l.setText(String.valueOf(numb));
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numb.append("0");
                l.setText(String.valueOf(numb));
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numb.append("1");
                l.setText(String.valueOf(numb));
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numb.append("2");
                l.setText(String.valueOf(numb));
            }
        });
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numb.append("3");
                l.setText(String.valueOf(numb));
            }
        });
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numb.append("4");
                l.setText(String.valueOf(numb));
            }
        });
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numb.append("5");
                l.setText(String.valueOf(numb));
            }
        });
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numb.append("6");
                l.setText(String.valueOf(numb));
            }
        });
        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numb.append("7");
                l.setText(String.valueOf(numb));
            }
        });
        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numb.append("8");
                l.setText(String.valueOf(numb));
            }
        });
        b10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numb.append("9");
                l.setText(String.valueOf(numb));
            }
        });
        b11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numb.append(" ");
                l.setText(String.valueOf(numb));
            }
        });
        b12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numb.append("*");
                l.setText(String.valueOf(numb));
            }
        });
        b13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numb.append("/");
                l.setText(String.valueOf(numb));
            }
        });
        b14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numb.append("+");
                l.setText(String.valueOf(numb));
            }
        });
        b15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numb.append("-");
                l.setText(String.valueOf(numb));
            }
        });
        b16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Calculus c = new Calculus();
                c.calculate(numb);
            }
        });
        JPanel p = new JPanel();
        p.setPreferredSize(new Dimension(200,200));
        p.setSize(200,200);
        JFrame f = new JFrame();
        f.setSize(200, 200);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(b10);
        p.add(b11);
        p.add(b12);
        p.add(b13);
        p.add(b14);
        p.add(b15);
        p.add(b16);
        p.add(l);
        f.getContentPane().add(p);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
