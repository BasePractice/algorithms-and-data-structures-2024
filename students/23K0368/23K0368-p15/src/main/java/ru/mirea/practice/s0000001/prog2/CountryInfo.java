package ru.mirea.practice.s0000001.prog2;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountryInfo extends JFrame {

    private JComboBox<String> countryComboBox;
    private JLabel infoLabel;

    public CountryInfo() {
        setTitle("Выбор страны");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Создаем JComboBox с названиями стран
        String[] countries = {"Россия", "США", "Китай", "Япония"};
        countryComboBox = new JComboBox<>(countries);

        // Создаем JLabel для отображения информации
        infoLabel = new JLabel();

        // Добавляем обработчик событий для JComboBox
        countryComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedCountry = (String) countryComboBox.getSelectedItem();
                String info = getCountryInfo(selectedCountry); // Метод получения информации о стране
                infoLabel.setText(info);
            }
        });

        // Добавляем элементы на окно
        add(countryComboBox);
        add(infoLabel);

        setVisible(true);
    }

    // Метод для получения информации о стране (замените его реальной логикой)
    private String getCountryInfo(String country) {
        if ("Россия".equals(country)) {
            return "Столица: Москва, Население: 146 млн";
        } else if ("США".equals(country)) {
            return "Столица: Вашингтон, Население: 331 млн";
        } else if ("Китай".equals(country)) {
            return "Столица: Пекин, Население: 1,44 млрд";
        } else if ("Япония".equals(country)) {
            return "Столица: Токио, Население: 126 млн";
        }
        return "Информация недоступна";
    }

    public static void main(String[] args) {
        new CountryInfo();
    }
}
