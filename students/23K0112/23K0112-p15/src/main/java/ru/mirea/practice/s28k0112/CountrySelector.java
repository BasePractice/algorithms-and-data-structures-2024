package ru.mirea.practice.s28k0112;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.JScrollPane;
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

        String[] countries = {"США", "Канада", "Германия", "Франция", "Италия"};
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

        add(countryComboBox);
        add(new JScrollPane(infoArea));
    }

    private void showCountryInfo(String country) {
        String info;
        switch (country) {
            case "США":
                info = "Соединенные Штаты Америки (США) — это страна, расположенная в основном в Северной Америке.";
                break;
            case "Канада":
                info = "Канада — это страна в Северной Америке, простирающаяся от Атлантического океана до Тихого и на север в Арктический океан.";
                break;
            case "Германия":
                info = "Германия — это страна в Центральной Европе, известная своей богатой историей и культурным наследием.";
                break;
            case "Франция":
                info = "Франция — это страна в Западной Европе, известная своим искусством, модой и кухней.";
                break;
            case "Италия":
                info = "Италия — это европейская страна, известная своими историческими памятниками, искусством и вкусной кухней.";
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