package ru.mirea.practice.s23k0135.task2;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;

public class CountryInfoMenu extends JFrame {

    private JComboBox<String> countryComboBox;
    private JLabel infoLabel;

    public CountryInfoMenu() {
        setTitle("Hello Swing");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create country list
        String[] countries = {"Australia", "China", "England", "Russia"};
        countryComboBox = new JComboBox<>(countries);
        add(countryComboBox);

        // Create label for information
        infoLabel = new JLabel("");
        add(infoLabel);

        // Add item listener to update info label
        countryComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedCountry = (String) countryComboBox.getSelectedItem();
                switch (selectedCountry) {
                    case "Australia":
                        infoLabel.setText("Australia is a continent and country comprising the mainland of the Australian continent, "
                            + "the island of Tasmania, and numerous smaller islands. "
                            + "It is the world's sixth-largest country by total area.");
                        break;
                    case "China":
                        infoLabel.setText("China, officially the People's Republic of China, "
                            + "is a transcontinental country mainly located in East Asia. "
                            + "It is the world's most populous country, with a population of over 1.4 billion.");
                        break;
                    case "England":
                        infoLabel.setText("England is a country that is part of the United Kingdom. "
                            + "It shares land borders with Scotland to the north and Wales to the west. "
                            + "England is separated from continental Europe by the North Sea.");
                        break;
                    case "Russia":
                        infoLabel.setText("Russia, officially the Russian Federation, "
                            + "is a transcontinental country spanning Eastern Europe and Northern Asia. "
                            + "It is the largest country in the world by area, covering more than one-eighth of the Earth's inhabited land area.");
                        break;
                    default:
                        infoLabel.setText("");
                        break;
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CountryInfoMenu());
    }
}


