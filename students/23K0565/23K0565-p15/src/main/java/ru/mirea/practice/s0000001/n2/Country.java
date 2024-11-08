package ru.mirea.practice.s0000001.n2;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class Country extends JFrame {
    private JComboBox<String> countryComboBox;
    private JLabel infoLabel;
    private Map<String, String> countryInfo;

    public Country() {
        setTitle("Country Information");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        String[] countries = {"Австралия", "Китай", "Англия", "Россия"};
        countryComboBox = new JComboBox<>(countries);
        countryComboBox.setBounds(50, 20, 200, 30);

        countryInfo = new HashMap<>();
        countryInfo.put("Австралия", "Столица: Канберра");
        countryInfo.put("Китай", "Столица: Пекин");
        countryInfo.put("Англия", "Столица: Лондон");
        countryInfo.put("Россия", "Столица: Москва");

        infoLabel = new JLabel("Пожалуйста, выберете");
        infoLabel.setBounds(50, 60, 200, 30);

        countryComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedCountry = (String) countryComboBox.getSelectedItem();
                infoLabel.setText(countryInfo.get(selectedCountry));
            }
        });

        add(countryComboBox);
        add(infoLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Country();
    }
}
