package ru.mirea.practice.s23k0823.task1.task1;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;

public class FontAndColorProgram extends JFrame {
    private JTextArea textArea;

    public FontAndColorProgram() {
        super("WORD 2000");
        setLayout(new BorderLayout());

        textArea = new JTextArea(20, 40);
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu colorMenu = new JMenu("Цвет");
        menuBar.add(colorMenu);
        JMenuItem blueItem = new JMenuItem("Синий");
        JMenuItem redItem = new JMenuItem("Красный");
        JMenuItem blackItem = new JMenuItem("Черный");
        colorMenu.add(blueItem);
        colorMenu.add(redItem);
        colorMenu.add(blackItem);

        JMenu fontMenu = new JMenu("Шрифт");
        menuBar.add(fontMenu);
        JMenuItem timesNewItem = new JMenuItem("Times New Roman");
        JMenuItem msSansSerifItem = new JMenuItem("MS Sans Serif");
        JMenuItem courierNewItem = new JMenuItem("Courier New");
        fontMenu.add(timesNewItem);
        fontMenu.add(msSansSerifItem);
        fontMenu.add(courierNewItem);

        blueItem.addActionListener(new ColorActionListener(Color.BLUE));
        redItem.addActionListener(new ColorActionListener(Color.RED));
        blackItem.addActionListener(new ColorActionListener(Color.BLACK));
        timesNewItem.addActionListener(new FontActionListener("Times New Roman"));
        msSansSerifItem.addActionListener(new FontActionListener("MS Sans Serif"));
        courierNewItem.addActionListener(new FontActionListener("Courier New"));
    }

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

    private class FontActionListener implements ActionListener {
        private String fontName;

        public FontActionListener(String fontName) {
            this.fontName = fontName;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Font font = new Font(fontName, Font.PLAIN, 12);
            textArea.setFont(font);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FontAndColorProgram program = new FontAndColorProgram();
                program.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                program.pack();
                program.setVisible(true);
            }
        });
    }
}