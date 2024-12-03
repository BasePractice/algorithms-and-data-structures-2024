package ru.mirea.practice.s0000001.task2;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEditor extends JFrame {

    private JTextArea textArea;

    public TextEditor() {
        setTitle("Текстовый редактор");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textArea = new JTextArea();
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        textArea.setForeground(Color.BLACK);
        textArea.setEditable(true);

        javax.swing.JScrollPane scrollPane = new javax.swing.JScrollPane(textArea);
        add(scrollPane, java.awt.BorderLayout.CENTER);

        final JMenuBar menuBar = new JMenuBar();
        final JMenu colorMenu = new JMenu("Цвет");
        final JMenu fontMenu = new JMenu("Шрифт");

        final JMenuItem blueItem = new JMenuItem("Синий");
        final JMenuItem redItem = new JMenuItem("Красный");
        final JMenuItem blackItem = new JMenuItem("Черный");

        colorMenu.add(blueItem);
        colorMenu.add(redItem);
        colorMenu.add(blackItem);

        final JMenuItem timesItem = new JMenuItem("Times New Roman");
        final JMenuItem msSansItem = new JMenuItem("MS Sans Serif");
        final JMenuItem courierItem = new JMenuItem("Courier New");

        fontMenu.add(timesItem);
        fontMenu.add(msSansItem);
        fontMenu.add(courierItem);

        menuBar.add(colorMenu);
        menuBar.add(fontMenu);

        setJMenuBar(menuBar);

        blueItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.BLUE);
            }
        });

        redItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.RED);
            }
        });

        blackItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.BLACK);
            }
        });

        timesItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14));
            }
        });

        msSansItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 14));
            }
        });

        courierItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("Courier New", Font.PLAIN, 14));
            }
        });
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                TextEditor editor = new TextEditor();
                editor.setVisible(true);
            }
        });
    }
}
