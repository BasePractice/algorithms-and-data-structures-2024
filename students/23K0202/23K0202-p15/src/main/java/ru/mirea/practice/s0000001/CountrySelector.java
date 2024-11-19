package ru.mirea.practice.s0000001;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountrySelector extends JFrame {
    private JComboBox<String> countryComboBox;
    private JTextArea infoArea;

    public CountrySelector() {
        setTitle("Выбор страны");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        String[] countries = {"Австралия", "Китай", "Англия", "Россия"};
        countryComboBox = new JComboBox<>(countries);

        infoArea = new JTextArea(10, 30);
        infoArea.setEditable(false);

        countryComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedCountry = (String) countryComboBox.getSelectedItem();
                showCountryInfo(selectedCountry);
            }
        });

        add(new JLabel("Выберите страну:"));
        add(countryComboBox);
        add(new JScrollPane(infoArea));
    }

    private void showCountryInfo(String country) {
        String info;
        switch (country) {
            case "Австралия":
                info = "Австралия — это страна и континент, расположенный в южном полушарии.";
                break;
            case "Китай":
                info = "Китай — это самая населённая страна в мире с богатой историей и культурой.";
                break;
            case "Англия":
                info = "Англия — это часть Соединённого Королевства, известная своим историческим наследием.";
                break;
            case "Россия":
                info = "Россия — крупнейшая страна в мире, простирающаяся от Европы до Азии.";
                break;
            default:
                info = "Информация недоступна.";
                break;
        }
        infoArea.setText(info);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CountrySelector selector = new CountrySelector();
            selector.setVisible(true);
        });
    }
}