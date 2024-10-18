package ru.mirea.practice.s0000001;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

/**
 * Разработайте программу выбора меню как на рис. 15.8 ниже. Вам
 * понадобится JComboBox. <br>
 * При выборе пункта меню должна выводится информация о стране
 */

public abstract class Task2 {
    public static void main(String[] args) {
        new CountrySelectionProgram();
    }

    static class CountrySelectionProgram {
        private JComboBox<String> countryComboBox;
        private JLabel countryInfoLabel;

        private final String[] countries = {"United States", "Canada", "Mexico", "United Kingdom", "France", "Germany"};
        private final String[] countryInfos = {
            "Capital: Washington D.C., Population: 331 million",
            "Capital: Ottawa, Population: 37 million",
            "Capital: Mexico City, Population: 127 million",
            "Capital: London, Population: 67 million",
            "Capital: Paris, Population: 67 million",
            "Capital: Berlin, Population: 83 million"
        };

        public CountrySelectionProgram() {
            createGraphicalUserInterface();
        }

        private void createGraphicalUserInterface() {
            JFrame frame = new JFrame("Country selector");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new FlowLayout());

            countryComboBox = new JComboBox<>(countries);
            countryComboBox.addActionListener(new CountrySelectionListener());
            frame.add(countryComboBox);

            countryInfoLabel = new JLabel("Select a country...");
            frame.add(countryInfoLabel);

            frame.pack();
            frame.setMinimumSize(new Dimension(800, 600));
            frame.setVisible(true);
        }

        private class CountrySelectionListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = countryComboBox.getSelectedIndex();
                String selectedCountry = Objects.requireNonNull(countryComboBox.getSelectedItem()).toString();
                String countryInfo = countryInfos[selectedIndex];
                countryInfoLabel.setText("You selected " + selectedCountry + ": " + countryInfo);
            }
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new CountrySelectionProgram();
                }
            });
        }
    }
}
