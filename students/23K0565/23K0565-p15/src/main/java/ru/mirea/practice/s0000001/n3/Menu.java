package ru.mirea.practice.s0000001.n3;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
    public Menu() {
        setTitle("Hello Swing");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2));
        JButton button1 = new JButton("Кнопка 1");
        JButton button2 = new JButton("Кнопка 2");
        buttonPanel.add(button1);
        buttonPanel.add(button2);

        JTextArea textArea = new JTextArea("Ttest-text.");
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);

        JMenu editMenu = new JMenu("Edit");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem pasteItem = new JMenuItem("Paste");
        editMenu.add(copyItem);
        editMenu.add(cutItem);
        editMenu.add(pasteItem);
        menuBar.add(editMenu);

        JMenu helpMenu = new JMenu("Help");
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        add(buttonPanel, BorderLayout.NORTH);
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Menu();
    }
}
