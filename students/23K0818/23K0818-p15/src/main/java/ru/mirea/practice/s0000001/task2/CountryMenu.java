package ru.mirea.practice.s0000001.task2;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class CountryMenu extends JFrame {

    private JComboBox<String> countryComboBox;
    private JLabel infoLabel;

    private Map<String, String> countryInfoMap;

    public CountryMenu() {
        setTitle("Выбор страны");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        countryComboBox = new JComboBox<>(new String[]{"Россия", "США", "Китай", "Германия", "Франция"});
        panel.add(countryComboBox, BorderLayout.NORTH);

        infoLabel = new JLabel();
        infoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(infoLabel, BorderLayout.CENTER);

        countryInfoMap = new HashMap<>();
        countryInfoMap.put("Россия", "Россия: Москва, рубль, 146 млн. человек.");
        countryInfoMap.put("США", "США: Вашингтон, доллар, 331 млн. человек.");
        countryInfoMap.put("Китай", "Китай: Пекин, юань, 1,4 млрд. человек.");
        countryInfoMap.put("Германия", "Германия: Берлин, евро, 83 млн. человек.");
        countryInfoMap.put("Франция", "Франция: Париж, евро, 67 млн. человек.");

        countryComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedCountry = (String) countryComboBox.getSelectedItem();
                String info = countryInfoMap.get(selectedCountry);
                infoLabel.setText(info);
            }
        });

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CountryMenu();
    }
}
