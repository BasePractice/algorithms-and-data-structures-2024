package ru.mirea.practice.s230k754.lab11;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountrySelect extends JFrame {
    public CountrySelect() {
        super("Country Selector");
        setSize(250, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] countries = {"Australia", "China", "England", "Russia"};
        JComboBox<String> countryBox = new JComboBox<>(countries);
        JLabel messageLabel = new JLabel("Select a country");

        countryBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedCountry = (String) countryBox.getSelectedItem();
                messageLabel.setText("You selected: " + selectedCountry);
            }
        });

        JPanel panel = new JPanel();
        panel.add(countryBox);
        panel.add(messageLabel);
        add(panel);
        setVisible(true);
    }
}
