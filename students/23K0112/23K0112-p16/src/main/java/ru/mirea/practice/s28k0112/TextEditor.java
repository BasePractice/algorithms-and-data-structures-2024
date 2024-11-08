package ru.mirea.practice.s28k0112;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class TextEditor extends JFrame {
    private JTextArea textArea;
    private JComboBox<String> colorComboBox;
    private JComboBox<String> fontComboBox;

    public TextEditor() {
        setTitle("Text Editor");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Создание JComboBox для выбора цвета
        colorComboBox = new JComboBox<>();
        colorComboBox.addItem("Синий");
        colorComboBox.addItem("Красный");
        colorComboBox.addItem("Черный");

        colorComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeTextColor((String) colorComboBox.getSelectedItem());
            }
        });

        // Создание JComboBox для выбора шрифта
        fontComboBox = new JComboBox<>();
        fontComboBox.addItem("Times New Roman");
        fontComboBox.addItem("MS Sans Serif");
        fontComboBox.addItem("Courier New");

        fontComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeFont((String) fontComboBox.getSelectedItem());
            }
        });

        panel.add(new JLabel("Цвет:"));
        panel.add(colorComboBox);
        panel.add(new JLabel("Шрифт:"));
        panel.add(fontComboBox);

        add(panel, BorderLayout.NORTH);
    }

    private void changeTextColor(String color) {
        switch (color) {
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
                break;
        }
    }

    private void changeFont(String font) {
        switch (font) {
            case "Times New Roman":
                textArea.setFont(new Font("Times New Roman", Font.PLAIN, 12));
                break;
            case "MS Sans Serif":
                textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 12));
                break;
            case "Courier New":
                textArea.setFont(new Font("Courier New", Font.PLAIN, 12));
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TextEditor editor = new TextEditor();
            editor.setVisible(true);
        });
    }
}
