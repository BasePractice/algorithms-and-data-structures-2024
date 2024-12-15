package ru.mirea.practice.s0000001;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEditorApp {
    private JTextArea textArea;

    public TextEditorApp() {
        JFrame frame = new JFrame("Text Editor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        textArea = new JTextArea();
        textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();

        JMenu colorMenu = new JMenu("Цвет");
        String[] colors = {"Синий", "Красный", "Черный"};
        for (String color : colors) {
            JMenuItem menuItem = new JMenuItem(color);
            menuItem.addActionListener(new ColorActionListener());
            colorMenu.add(menuItem);
        }
        menuBar.add(colorMenu);

        JMenu fontMenu = new JMenu("Шрифт");
        String[] fonts = {"Times New Roman", "MS Sans Serif", "Courier New"};
        for (String font : fonts) {
            JMenuItem menuItem = new JMenuItem(font);
            menuItem.addActionListener(new FontActionListener());
            fontMenu.add(menuItem);
        }
        menuBar.add(fontMenu);

        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }

    private class ColorActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String selectedColor = e.getActionCommand();
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
                    textArea.setForeground(Color.BLACK);
                    break;
            }
        }
    }

    private class FontActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String selectedFont = e.getActionCommand();
            switch (selectedFont) {
                case "Times New Roman":
                    textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14));
                    break;
                case "MS Sans Serif":
                    textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 14));
                    break;
                case "Courier New":
                    textArea.setFont(new Font("Courier New", Font.PLAIN, 14));
                    break;
                default:
                    textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 14));
                    break;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TextEditorApp::new);
    }
}
