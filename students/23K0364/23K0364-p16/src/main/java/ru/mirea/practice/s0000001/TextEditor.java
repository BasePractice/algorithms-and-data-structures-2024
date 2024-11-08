package ru.mirea.practice.s0000001;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;


public class TextEditor extends JFrame {
    private JTextArea textArea;

    public TextEditor() {
        setTitle("Text Editor");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14));

        // Declare menuBar, colorMenu, and fontMenu as final
        final JMenuBar menuBar = new JMenuBar();

        final JMenu colorMenu = new JMenu("Color");
        JMenuItem blueItem = new JMenuItem("Blue");
        JMenuItem redItem = new JMenuItem("Red");
        JMenuItem blackItem = new JMenuItem("Black");

        blueItem.addActionListener(e -> textArea.setForeground(Color.BLUE));
        redItem.addActionListener(e -> textArea.setForeground(Color.RED));
        blackItem.addActionListener(e -> textArea.setForeground(Color.BLACK));

        colorMenu.add(blueItem);
        colorMenu.add(redItem);
        colorMenu.add(blackItem);

        final JMenu fontMenu = new JMenu("Font");
        JMenuItem timesItem = new JMenuItem("Times New Roman");
        JMenuItem sansItem = new JMenuItem("MS Sans Serif");
        JMenuItem courierItem = new JMenuItem("Courier New");

        timesItem.addActionListener(e -> textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14)));
        sansItem.addActionListener(e -> textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 14)));
        courierItem.addActionListener(e -> textArea.setFont(new Font("Courier New", Font.PLAIN, 14)));

        fontMenu.add(timesItem);
        fontMenu.add(sansItem);
        fontMenu.add(courierItem);

        menuBar.add(colorMenu);
        menuBar.add(fontMenu);

        setJMenuBar(menuBar);
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new TextEditor();
    }
}

