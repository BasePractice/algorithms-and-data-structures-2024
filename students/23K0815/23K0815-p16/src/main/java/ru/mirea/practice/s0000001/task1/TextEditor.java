package ru.mirea.practice.s0000001.task1;

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

public class TextEditor extends JFrame {
    private JTextArea textArea;

    public TextEditor() {
        setTitle("Text Editor");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        // Создание меню
        final JMenuBar menuBar = new JMenuBar();

        // Создание меню выбора цвета
        final JMenu colorMenu = new JMenu("Цвет");
        JMenuItem blueItem = new JMenuItem("Синий");
        JMenuItem redItem = new JMenuItem("Красный");
        JMenuItem blackItem = new JMenuItem("Черный");

        blueItem.addActionListener(new ColorAction(Color.BLUE));
        redItem.addActionListener(new ColorAction(Color.RED));
        blackItem.addActionListener(new ColorAction(Color.BLACK));

        colorMenu.add(blueItem);
        colorMenu.add(redItem);
        colorMenu.add(blackItem);

        // Создание меню выбора шрифта
        final JMenu fontMenu = new JMenu("ШШрифт");
        JMenuItem timesNewRomanItem = new JMenuItem("Times New Roman");
        JMenuItem msSansSerifItem = new JMenuItem("MS Sans Serif");
        JMenuItem courierNewItem = new JMenuItem("Courier New");

        timesNewRomanItem.addActionListener(new FontAction("Times New Roman", Font.PLAIN, 12));
        msSansSerifItem.addActionListener(new FontAction("MS Sans Serif", Font.PLAIN, 12));
        courierNewItem.addActionListener(new FontAction("Courier New", Font.PLAIN, 12));

        fontMenu.add(timesNewRomanItem);
        fontMenu.add(msSansSerifItem);
        fontMenu.add(courierNewItem);

        menuBar.add(colorMenu);
        menuBar.add(fontMenu);

        setJMenuBar(menuBar);
    }

    private class ColorAction implements ActionListener {
        private Color color;

        public ColorAction(Color color) {
            this.color = color;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            textArea.setForeground(color);
        }
    }

    private class FontAction implements ActionListener {
        private String fontName;
        private int fontStyle;
        private int fontSize;

        public FontAction(String fontName, int fontStyle, int fontSize) {
            this.fontName = fontName;
            this.fontStyle = fontStyle;
            this.fontSize = fontSize;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            textArea.setFont(new Font(fontName, fontStyle, fontSize));
        }
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            TextEditor editor = new TextEditor();
            editor.setVisible(true);
        });
    }
}