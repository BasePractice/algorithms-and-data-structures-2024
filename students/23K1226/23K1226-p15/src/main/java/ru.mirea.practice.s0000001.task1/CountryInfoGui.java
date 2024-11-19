package ru.mirea.practice.s0000001.task1;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.BorderLayout;

public class CountryInfoGui {
    public void createAndShowGui() {
        final JFrame frame = new JFrame("Country Information");
        String[] countries = {"USA", "Canada", "Russia", "India", "China"};
        JComboBox<String> countryComboBox = new JComboBox<>(countries);
        final JTextArea countryInfoArea = new JTextArea(10, 30);
        countryInfoArea.setEditable(false);

        countryComboBox.addActionListener(e -> {
            String selectedCountry = (String) countryComboBox.getSelectedItem();
            countryInfoArea.setText(getCountryInfo(selectedCountry));
        });

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(countryComboBox, BorderLayout.NORTH);
        panel.add(new JScrollPane(countryInfoArea), BorderLayout.CENTER);

        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private String getCountryInfo(String country) {
        switch (country) {
            case "USA":
                return "Capital: Washington, D.C.\nLanguage: English\nCurrency: USD";
            case "Canada":
                return "Capital: Ottawa\nLanguage: English, French\nCurrency: CAD";
            case "Russia":
                return "Capital: Moscow\nLanguage: Russian\nCurrency: RUB";
            case "India":
                return "Capital: New Delhi\nLanguage: Hindi, English\nCurrency: INR";
            case "China":
                return "Capital: Beijing\nLanguage: Mandarin\nCurrency: CNY";
            default:
                return "Country information not available.";
        }
    }
}
