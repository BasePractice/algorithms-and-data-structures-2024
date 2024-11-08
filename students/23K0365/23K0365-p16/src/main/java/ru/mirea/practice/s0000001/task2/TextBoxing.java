package ru.mirea.practice.s0000001.task2;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;

public class TextBoxing extends JFrame {
    private JTextArea text;
    private JComboBox colorComb;
    private JComboBox fontComb;

    TextBoxing() {
        super("Choice");
        text = new JTextArea(10,30);
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        text.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        final JPanel a = new JPanel();
        add(new JScrollPane(text), BorderLayout.CENTER);
        setSize(500, 300);
        String[] colors = {"Red", "Blue", "Black"};
        colorComb = new JComboBox<>(colors);
        a.add(new JLabel("Colors:"));
        a.add(colorComb);
        colorComb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String choice = (String) colorComb.getSelectedItem();
                switch (choice) {
                    case "Black":
                        text.setBackground(Color.BLACK);
                        break;
                    case "Red":
                        text.setBackground(Color.RED);
                        break;
                    case "Blue":
                        text.setBackground(Color.BLUE);
                        break;
                    default:
                        break;
                }
            }
        });
        String[] fonts = {"Times New Roman", "MS Sans Serif", "Courier New"};
        fontComb = new JComboBox<>(fonts);
        a.add(new JLabel("Fonts:"));
        a.add(fontComb);
        fontComb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String choice = (String) fontComb.getSelectedItem();
                switch (choice) {
                    case "Times New Roman":
                        text.setFont(new Font("Times New Roman", Font.PLAIN, 14));
                        break;
                    case "MS Sans Serif":
                        text.setFont(new Font("MS Sans Serif", Font.PLAIN, 14));
                        break;
                    case "Courier New":
                        text.setFont(new Font("Courier New", Font.PLAIN, 14));
                        break;
                    default:
                        break;
                }
            }
        });
        add(a, BorderLayout.NORTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextBoxing();
    }

}
