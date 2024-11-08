package ru.mirea.practice.s23k0215.task2;


import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TextEditor {
    private JTextArea textArea;

    public TextEditor() {
        JFrame frame = new JFrame("Текстовый редактор");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JMenuBar menuBar = new JMenuBar();

        JMenu colorMenu = new JMenu("Цвет");
        String[] colors = {"Синий", "Красный", "Черный"};

        for (String color : colors) {
            JMenuItem colorItem = new JMenuItem(color);
            colorItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
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
            });
            colorMenu.add(colorItem);
        }

        JMenu fontMenu = new JMenu("Шрифт");
        String[] fonts = {"Times New Roman", "MS Sans Serif", "Courier New"};

        for (String font : fonts) {
            JMenuItem fontItem = new JMenuItem(font);
            fontItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
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
            });
            fontMenu.add(fontItem);
        }

        menuBar.add(colorMenu);
        menuBar.add(fontMenu);

        frame.setJMenuBar(menuBar);
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> new TextEditor());
    }
}
