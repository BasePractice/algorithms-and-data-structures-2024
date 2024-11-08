package ru.mirea.practice.s0000001.prog2;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;

public class TextEditor extends JFrame {
    private final JTextArea textArea;

    public TextEditor() {
        setTitle("Text Editor");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Создаем текстовое поле
        textArea = new JTextArea();
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        // Создаем меню
        final JMenuBar menuBar = new JMenuBar();

        // Меню "Цвет"
        final JMenu colorMenu = new JMenu("Цвет");
        final JMenuItem blueItem = new JMenuItem("Синий");
        final JMenuItem redItem = new JMenuItem("Красный");
        final JMenuItem blackItem = new JMenuItem("Черный");

        // Добавляем обработчики событий для изменения цвета
        blueItem.addActionListener(e -> textArea.setForeground(Color.BLUE));
        redItem.addActionListener(e -> textArea.setForeground(Color.RED));
        blackItem.addActionListener(e -> textArea.setForeground(Color.BLACK));

        colorMenu.add(blueItem);
        colorMenu.add(redItem);
        colorMenu.add(blackItem);
        menuBar.add(colorMenu);

        // Меню "Шрифт"
        final JMenu fontMenu = new JMenu("Шрифт");
        final JMenuItem timesItem = new JMenuItem("Times New Roman");
        final JMenuItem sansSerifItem = new JMenuItem("MS Sans Serif");
        JMenuItem courierItem = new JMenuItem("Courier New");

        // Добавляем обработчики событий для изменения шрифта
        timesItem.addActionListener(e -> textArea.setFont(new Font("Times New Roman", Font.PLAIN, 16)));
        sansSerifItem.addActionListener(e -> textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 16)));
        courierItem.addActionListener(e -> textArea.setFont(new Font("Courier New", Font.PLAIN, 16)));

        fontMenu.add(timesItem);
        fontMenu.add(sansSerifItem);
        fontMenu.add(courierItem);
        menuBar.add(fontMenu);

        // Устанавливаем меню в окно
        setJMenuBar(menuBar);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TextEditor editor = new TextEditor();
            editor.setVisible(true);
        });
    }
}
