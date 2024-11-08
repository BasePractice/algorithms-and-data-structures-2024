package ru.mirea.practice.s0000001.task2;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountryChoice extends JFrame {
    String[] a = {"Ausrtalia", "China", "England", "Russia"};
    Font font = new Font("Times new roman", Font.BOLD, 14);
    Container cont = getContentPane();

    CountryChoice() {
        super("Country choice");
        setLayout(new GridLayout(5, 10));
        setSize(350, 150);
        ActionListener act = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Default
            }
        };

        JComboBox comboBox = new JComboBox(a);
        comboBox.setFont(font);
        comboBox.setAlignmentX(LEFT_ALIGNMENT);
        comboBox.addActionListener(act);
        cont.add(comboBox);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CountryChoice();
    }
}
