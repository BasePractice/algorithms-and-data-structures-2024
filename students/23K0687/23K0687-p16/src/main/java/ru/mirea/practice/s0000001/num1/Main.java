package ru.mirea.practice.s0000001.num1;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.Font;

public final class Main { // Сделан класс final
    public static void main(String[] args) {
        final JFrame frame = new JFrame("Text Editor");
        final JTextArea textArea = new JTextArea(20, 50);
        final JScrollPane scrollPane = new JScrollPane(textArea);
        final JMenuBar menuBar = new JMenuBar();

        final JMenu colorMenu = new JMenu("Цвет");
        final JMenu fontMenu = new JMenu("Шрифт");

        final JMenuItem blueColor = new JMenuItem("Синий");
        final JMenuItem redColor = new JMenuItem("Красный");
        final JMenuItem blackColor = new JMenuItem("Черный");

        final JMenuItem timesFont = new JMenuItem("Times New Roman");
        final JMenuItem msFont = new JMenuItem("MS Sans Serif");
        final JMenuItem courierFont = new JMenuItem("Courier New");

        blueColor.addActionListener(e -> textArea.setForeground(Color.BLUE));
        redColor.addActionListener(e -> textArea.setForeground(Color.RED));
        blackColor.addActionListener(e -> textArea.setForeground(Color.BLACK));

        timesFont.addActionListener(e -> textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14)));
        msFont.addActionListener(e -> textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 14)));
        courierFont.addActionListener(e -> textArea.setFont(new Font("Courier New", Font.PLAIN, 14)));

        colorMenu.add(blueColor);
        colorMenu.add(redColor);
        colorMenu.add(blackColor);

        fontMenu.add(timesFont);
        fontMenu.add(msFont);
        fontMenu.add(courierFont);

        menuBar.add(colorMenu);
        menuBar.add(fontMenu);

        frame.setJMenuBar(menuBar);
        frame.add(scrollPane);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private Main() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }
}

