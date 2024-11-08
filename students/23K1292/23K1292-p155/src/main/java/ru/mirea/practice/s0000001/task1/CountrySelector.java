package ru.mirea.practice.s0000001.task1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class CountrySelector {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Выбор стран");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);


        String[] countries = { "Россия", "США", "Канада", "Франция", "Германия", "Италия", "Испания", "Япония", "Китай", "Индия" };


        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(countries.length, 1));


        JCheckBox[] checkBoxes = new JCheckBox[countries.length];
        for (int i = 0; i < countries.length; i++) {
            checkBoxes[i] = new JCheckBox(countries[i]);
            panel.add(checkBoxes[i]);
        }


        JButton showSelectionButton = new JButton("Показать выбранные страны");


        showSelectionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder selectedCountries = new StringBuilder("Выбранные страны: ");
                boolean isAnySelected = false;

                for (JCheckBox checkBox : checkBoxes) {
                    if (checkBox.isSelected()) {
                        selectedCountries.append(checkBox.getText()).append(", ");
                        isAnySelected = true;
                    }
                }

                if (isAnySelected) {

                    selectedCountries.setLength(selectedCountries.length() - 2);
                    JOptionPane.showMessageDialog(frame, selectedCountries.toString());
                } else {
                    JOptionPane.showMessageDialog(frame, "Не выбрано ни одной страны.");
                }
            }
        });


        frame.getContentPane().add(panel);
        frame.getContentPane().add(showSelectionButton, "South");


        frame.setVisible(true);
    }
}
