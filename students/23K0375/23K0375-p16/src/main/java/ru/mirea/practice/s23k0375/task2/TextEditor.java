package ru.mirea.practice.s23k0375.task2;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
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

        // Создание JTextArea
        textArea = new JTextArea();
        add(textArea);

        // Создание меню
        final JMenuBar menuBar = new JMenuBar();

        // Меню выбора цвета
        final JMenu colorMenu = new JMenu("Цвет");
        JMenuItem blueItem = new JMenuItem("Синий");
        JMenuItem redItem = new JMenuItem("Красный");
        JMenuItem blackItem = new JMenuItem("Черный");

        blueItem.addActionListener(new ColorActionListener(Color.BLUE));
        redItem.addActionListener(new ColorActionListener(Color.RED));
        blackItem.addActionListener(new ColorActionListener(Color.BLACK));

        colorMenu.add(blueItem);
        colorMenu.add(redItem);
        colorMenu.add(blackItem);

        // Меню выбора шрифта
        final JMenu fontMenu = new JMenu("Шрифт");
        JMenuItem timesNewRomanItem = new JMenuItem("Times New Roman");
        JMenuItem msSansSerifItem = new JMenuItem("MS Sans Serif");
        JMenuItem courierNewItem = new JMenuItem("Courier New");

        timesNewRomanItem.addActionListener(new FontActionListener("Times New Roman"));
        msSansSerifItem.addActionListener(new FontActionListener("MS Sans Serif"));
        courierNewItem.addActionListener(new FontActionListener("Courier New"));

        fontMenu.add(timesNewRomanItem);
        fontMenu.add(msSansSerifItem);
        fontMenu.add(courierNewItem);

        // Добавление меню в меню-бар
        menuBar.add(colorMenu);
        menuBar.add(fontMenu);

        // Установка меню-бара в окно
        setJMenuBar(menuBar);
    }

    // Обработчик событий для выбора цвета
    private class ColorActionListener implements ActionListener {
        private Color color;

        public ColorActionListener(Color color) {
            this.color = color;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            textArea.setForeground(color);
        }
    }

    // Обработчик событий для выбора шрифта
    private class FontActionListener implements ActionListener {
        private String fontName;

        public FontActionListener(String fontName) {
            this.fontName = fontName;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Font currentFont = textArea.getFont();
            Font newFont = new Font(fontName, currentFont.getStyle(), currentFont.getSize());
            textArea.setFont(newFont);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TextEditor textEditor = new TextEditor();
            textEditor.setVisible(true);
        });
    }
}
