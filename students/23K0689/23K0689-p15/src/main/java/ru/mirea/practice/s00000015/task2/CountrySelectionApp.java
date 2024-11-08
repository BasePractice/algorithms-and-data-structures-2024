package ru.mirea.practice.s00000015.task2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class CountrySelectionApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Выбор стран");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new BorderLayout());

        String[] countries = {"Ausrtalia", "China", "England", "Russia"};
        DefaultListModel<String> listModel = new DefaultListModel<>();

        for (String country : countries) {
            listModel.addElement(country);
        }

        JList<String> countryList = new JList<>(listModel);
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        countryList.setVisibleRowCount(-1);
        JScrollPane listScroller = new JScrollPane(countryList);

        JButton selectButton = new JButton("Выбрать страны");
        JLabel resultLabel = new JLabel("Выберите страны из списка и нажмите 'Выбрать'.");

        selectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder selectedCountries = new StringBuilder("Вы выбрали: ");
                for (String country : countryList.getSelectedValuesList()) {
                    selectedCountries.append(country).append(", ");
                }
                if (selectedCountries.length() > 15) {
                    selectedCountries.setLength(selectedCountries.length() - 2);
                }
                resultLabel.setText(selectedCountries.toString());
            }
        });

        frame.add(listScroller, BorderLayout.CENTER);
        frame.add(selectButton, BorderLayout.SOUTH);
        frame.add(resultLabel, BorderLayout.NORTH);

        frame.setVisible(true);
    }
}
