package ru.mirea.practice.s23l0908;

import javax.swing.JFrame;
import javax.swing.JComboBox;

public class Main extends JFrame {
    String[] ct = {"Australia", "China", "England", "Russia", "Viet Nam"};
    JComboBox<String> cb = new JComboBox<>(ct);


    Main() {
        super("JCOMBOBOX");
        setLayout(null);
        setSize(400, 300);
        cb.setBounds(100, 50, 150, 20);
        add(cb);
    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}
