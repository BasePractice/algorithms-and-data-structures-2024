package ru.mirea.practice.s23k0375.task2;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;

public class Menu extends JFrame {

    public Menu() {
        setTitle("Hello!!");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Создание метки
        JLabel label = new JLabel("Выберите страну:");
        add(label, BorderLayout.NORTH);

        // Создание выпадающего списка
        String[] countries = {"Australia", "China", "England", "Russia"};
        JComboBox<String> comboBox = new JComboBox<>(countries);
        add(comboBox, BorderLayout.CENTER);

        // Создание кнопки ОК
        JButton okButton = new JButton("OK");
        add(okButton, BorderLayout.SOUTH);

        // Обработка нажатия кнопки ОК
        okButton.addActionListener(e -> {
            String selectedCountry = (String) comboBox.getSelectedItem();
            JOptionPane.showMessageDialog(this, "Вы выбрали: " + selectedCountry);
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Menu menuSelection = new Menu();
            menuSelection.setVisible(true);
        });
    }
}
