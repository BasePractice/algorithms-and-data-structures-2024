package ru.mirea.practice.s23k0690;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class Task2 {
    public static void main(String[] args) {
        final JFrame frame = new JFrame("Text Modifier");
        final JTextArea textArea = new JTextArea(0, 10);
        String[] colorOptions = {"Red", "Green", "Blue", "Black"};
        String[] fontOptions = {"Times New Roman", "MS Sans Serif", "Courier New"};

        JComboBox<String> colorComboBox = new JComboBox<>(colorOptions);
        JComboBox<String> fontComboBox = new JComboBox<>(fontOptions);

        colorComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedColor = (String) colorComboBox.getSelectedItem();
                switch (selectedColor) {
                    case "Red":
                        textArea.setForeground(Color.RED);
                        break;
                    case "Green":
                        textArea.setForeground(Color.GREEN);
                        break;
                    case "Blue":
                        textArea.setForeground(Color.BLUE);
                        break;
                    case "Black":
                        textArea.setForeground(Color.BLACK);
                        break;
                    default:
                        textArea.setForeground(Color.BLACK); // Default color
                        break;
                }
            }
        });

        fontComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedFont = (String) fontComboBox.getSelectedItem();
                switch (selectedFont) {
                    case "Times New Roman":
                        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 22));
                        break;
                    case "MS Sans Serif":
                        textArea.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
                        break;
                    case "Courier New":
                        textArea.setFont(new Font("Courier New", Font.PLAIN, 15));
                        break;
                    default:
                        textArea.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12)); // Default font
                        break;
                }
            }
        });

        JPanel textPanel = new JPanel();
        textPanel.add(textArea, BorderLayout.CENTER);
        JPanel controlPanel = new JPanel();
        controlPanel.add(colorComboBox);
        controlPanel.add(fontComboBox);

        frame.setLayout(new FlowLayout());
        frame.add(textPanel);
        frame.add(controlPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 130);
        frame.setVisible(true);
    }
}