package ru.mirea.practices0000001.task2;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CountryInfoSelector extends JFrame implements ItemListener {

    private JComboBox<String> countryComboBox;
    private JLabel infoLabel;

    public CountryInfoSelector() {
        super("Выбор страны");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new FlowLayout());

        String[] countries = {"Australia", "China", "England", "Russia"};
        countryComboBox = new JComboBox<>(countries);
        countryComboBox.addItemListener(this);
        add(countryComboBox);

        infoLabel = new JLabel("Выберите страну...");
        add(infoLabel);

        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            String selectedCountry = (String) countryComboBox.getSelectedItem();
            String countryInfo = getCountryInfo(selectedCountry);
            infoLabel.setText(countryInfo);
        }
    }

    private String getCountryInfo(String country) {
        switch (country) {
            case "Australia":
                return "Столица: Канберра";
            case "China":
                return "Столица: Пекин";
            case "England":
                return "Столица: Лондон";
            case "Russia":
                return "Столица: Москва";
            default:
                return "Информация о стране не найдена.";
        }
    }

    public static void main(String[] args) {
        new CountryInfoSelector();
    }
}
