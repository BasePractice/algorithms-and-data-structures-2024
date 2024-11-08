package ru.mirea.practice.s0000001.n2;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceM extends JFrame {
    private JTextArea textArea;

    public ChoiceM() {
        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        add(textArea);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu colorMenu = new JMenu("Цвет");
        menuBar.add(colorMenu);

        JMenuItem blueItem = new JMenuItem("Синий");
        JMenuItem redItem = new JMenuItem("Красный");
        JMenuItem blackItem = new JMenuItem("Чёрный");
        colorMenu.add(blueItem);
        colorMenu.add(redItem);
        colorMenu.add(blackItem);

        blueItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.BLUE);
            }
        });

        redItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.RED);
            }
        });

        blackItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.BLACK);
            }
        });

        JMenu fontMenu = new JMenu("Шрифт");
        menuBar.add(fontMenu);

        JMenuItem timesItem = new JMenuItem("Times New Roman");
        JMenuItem sansItem = new JMenuItem("MS Sans Serif");
        JMenuItem courierItem = new JMenuItem("Courier New");
        fontMenu.add(timesItem);
        fontMenu.add(sansItem);
        fontMenu.add(courierItem);

        timesItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("Times New Roman", Font.PLAIN, 16));
            }
        });

        sansItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 16));
            }
        });

        courierItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("Courier New", Font.PLAIN, 16));
            }
        });

        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new ChoiceM().setVisible(true);
    }
}
