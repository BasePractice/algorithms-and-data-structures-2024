package ru.mirea.practice.s0000001.task2;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class Test {
    public static void main(String[] args) {
        JPanel p = new JPanel();
        p.setSize(200,200);
        JFrame f = new JFrame();
        f.setSize(200, 200);
        f.setTitle("menu selector");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setLayout(new FlowLayout());
        String[] menus = {"Australia", "China", "England", "Russia"};
        JComboBox<String> menu = new JComboBox<>(menus);
        JLabel l = new JLabel("current menu: ");
        menu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setText("current menu: " + (String) menu.getSelectedItem());
            }
        });
        p.add(menu);
        p.add(l);
        f.add(p);
        f.setVisible(true);
    }
}
