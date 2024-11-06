package ru.mirea.practice.s0000001.task1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountrySelector {
    public static void main(String[] args) {
        // Создаем окно
        JFrame frame = new JFrame("Выбор страны");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Создаем JComboBox с названиями стран
        String[] countries = { "Россия", "США", "Канада", "Франция", "Германия", "Италия", "Испания", "Япония", "Китай", "Индия" };
        JComboBox<String> countryComboBox = new JComboBox<>(countries);

        // Создаем кнопку для подтверждения выбора
        JButton selectButton = new JButton("Выбрать страну");

        // Добавляем ActionListener для кнопки
        selectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedCountry = (String) countryComboBox.getSelectedItem();
                JOptionPane.showMessageDialog(frame, "Вы выбрали: " + selectedCountry);
            }
        });

        // Создаем панель и добавляем компоненты
        JPanel panel = new JPanel();
        panel.add(countryComboBox);
        panel.add(selectButton);

        // Добавляем панель в окно
        frame.getContentPane().add(panel);

        // Устанавливаем видимость окна
        frame.setVisible(true);
    }
}
