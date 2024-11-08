package ru.mirea.practice.s23k0215.task1;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class CountrySelector {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Выбор страны");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.CENTER);

        String[] countries = {"Россия", "США", "Китай", "Индия", "Германия", };
        JComboBox<String> comboBox = new JComboBox<>(countries);
        panel.add(comboBox);

        JLabel label = new JLabel("Выберите страну");
        panel.add(label);

        JButton button = new JButton("Показать информацию");
        panel.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedCountry = (String) comboBox.getSelectedItem();
                String info = "Информация о " + selectedCountry + ": ";

                switch (selectedCountry) {
                    case "Россия":
                        info += "самая большая страна в мире и с большими бомбами.";
                        break;
                    case "США":
                        info += "страна с крупнейшей экономикой и наркотиками.";
                        break;
                    case "Китай":
                        info += "страна с самым большим населением.";
                        break;
                    case "Индия":
                        info += "вторая по численности населения страна.";
                        break;
                    case "Германия":
                        info += "одна из ведущих экономик Европы.";
                        break;
                    default:
                        break;
                }
                label.setText(info);
            }
        });

        frame.setVisible(true);
    }
}
