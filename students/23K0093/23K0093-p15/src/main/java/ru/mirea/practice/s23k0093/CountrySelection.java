package ru.mirea.practice.s23k0093;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public abstract class CountrySelection {

    // Массив стран и их информации
    private static final String[][] COUNTRY_INFO = {
            {"USA", "Capital: Washington D.C. \nPopulation: 331 million"},
            {"Canada", "Capital: Ottawa \nPopulation: 38 million"},
            {"Germany", "Capital: Berlin \nPopulation: 83 million"},
            {"France", "Capital: Paris \nPopulation: 67 million"},
            {"Spain", "Capital: Madrid \nPopulation: 47 million"}
    };

    public static void main(String[] args) {

        JFrame frame = new JFrame("Country Selector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);

        String[] countries = {"USA", "Canada", "Germany", "France", "Spain"};
        JComboBox<String> comboBox = new JComboBox<>(countries);
        comboBox.setBounds(50, 50, 200, 30);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(50, 100, 300, 100);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);

        comboBox.addActionListener(e -> {
            String selectedCountry = (String) comboBox.getSelectedItem();
            String info = "";

            for (String[] country : COUNTRY_INFO) {
                if (country[0].equals(selectedCountry)) {
                    info = country[1];
                    break;
                }
            }

            textArea.setText(info);
        });

        frame.add(comboBox);
        frame.add(textArea);

        frame.setVisible(true);
    }
}
