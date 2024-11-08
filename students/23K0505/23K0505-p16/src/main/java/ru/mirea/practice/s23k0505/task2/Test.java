package ru.mirea.practice.s23k0505.task2;

import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class Test {
    public static void main(String[] args) {
        JTextArea texts = new JTextArea(0,10);
        JFrame f = new JFrame();
        f.setTitle("text changer");
        f.setLayout(new FlowLayout());
        String[] colors = new String[] {"синий", "красный", "черный"};
        JComboBox<String> colorsbox = new JComboBox<>(colors);
        String[] fonts = new String[] {"Times New Roman", "MS Sans Serif", "Courier New"};
        JComboBox<String> fontsbox = new JComboBox<>(fonts);
        colorsbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String color = (String) colorsbox.getSelectedItem();
                if ("синий".equals(color)) {
                    texts.setForeground(Color.BLUE);
                } else if ("красный".equals(color)) {
                    texts.setForeground(Color.RED);
                } else if ("черный".equals(color)) {
                    texts.setForeground(Color.BLACK);
                }
            }
        });
        fontsbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String font = (String) fontsbox.getSelectedItem();
                if ("Times New Roman".equals(font)) {
                    texts.setFont(new Font("Times New Roman", Font.PLAIN, 22));
                } else if ("MS Sans Serif".equals(font)) {
                    texts.setFont(Font.getFont(Font.SANS_SERIF));
                } else if ("Courier New".equals(font)) {
                    texts.setFont(new Font("Courier New", Font.PLAIN, 15));
                }
            }
        });
        JPanel panel1 = new JPanel();
        panel1.add(texts,BorderLayout.CENTER);
        JPanel panel2 = new JPanel();
        panel2.add(colorsbox,BorderLayout.CENTER);
        panel2.add(fontsbox,BorderLayout.WEST);
        f.add(panel1);
        f.add(panel2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 300);
        f.setVisible(true);
    }
}
