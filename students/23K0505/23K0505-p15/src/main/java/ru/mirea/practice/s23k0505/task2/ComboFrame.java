package ru.mirea.practice.s23k0505.task2;

//import javax.swing.*;
//import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboFrame extends JFrame {
    JComboBox countries;
    JLabel description = new JLabel();
    JLabel label = new JLabel();


    ComboFrame(Country[] items) {
        label.setSize(50, 200);
        label.setLayout(new FlowLayout());
        label.setVisible(true);

        countries = new JComboBox<Country>(items);

        countries.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox cb = (JComboBox) e.getSource();
                Country selectedCountry = (Country) cb.getSelectedItem();
                description.setText(selectedCountry.getDescription());
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);


        label.add(countries);
        label.add(description);
        add(label);
    }
}
