package ru.mirea.practice.s0000001.task2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEditor extends JFrame {

    private JTextArea textArea;
    private JComboBox<String> colorComboBox;
    private JComboBox<String> fontComboBox;

    public TextEditor() {
        setTitle("Редактор текста");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        textArea = new JTextArea();
        textArea.setBounds(20, 20, 540, 300);
        panel.add(textArea);

        colorComboBox = new JComboBox<>(new String[]{"Синий", "Красный", "Черный"});
        colorComboBox.setBounds(20, 340, 150, 30);
        colorComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedColor = (String) colorComboBox.getSelectedItem();
                switch (selectedColor) {
                    case "Синий":
                        textArea.setForeground(Color.BLUE);
                        break;
                    case "Красный":
                        textArea.setForeground(Color.RED);
                        break;
                    case "Черный":
                        textArea.setForeground(Color.BLACK);
                        break;
                    default:
                        // Обработка случая, если выбран неизвестный цвет
                        textArea.setForeground(Color.BLACK); // или другое действие по умолчанию
                        break;
                }
            }
        });
        panel.add(colorComboBox);

        fontComboBox = new JComboBox<>(new String[]{"Times New Roman", "MS Sans Serif", "Courier New"});
        fontComboBox.setBounds(200, 340, 150, 30);
        fontComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedFont = (String) fontComboBox.getSelectedItem();
                switch (selectedFont) {
                    case "Times New Roman":
                    case "MS Sans Serif":
                    case "Courier New":
                        textArea.setFont(new Font(selectedFont, Font.PLAIN, 14));
                        break;
                    default:
                        // Обработка случая, если выбрана неизвестная шрифтовая семья
                        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14)); // или другое действие по умолчанию
                        break;
                }
            }
        });
        panel.add(fontComboBox);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextEditor();
    }
}
