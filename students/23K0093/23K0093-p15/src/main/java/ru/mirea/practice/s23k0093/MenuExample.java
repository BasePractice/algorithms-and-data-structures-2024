package ru.mirea.practice.s23k0093;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public abstract class MenuExample {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Menu Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JTextField textField = new JTextField();
        textField.setBounds(50, 50, 300, 30);

        JButton button1 = new JButton("Button1");
        JButton button2 = new JButton("Button2");
        button1.setBounds(50, 100, 100, 30);
        button2.setBounds(200, 100, 100, 30);

        var menuBar = getjMenuBar();

        frame.setJMenuBar(menuBar);
        frame.setLayout(null);
        frame.add(textField);
        frame.add(button1);
        frame.add(button2);

        frame.setVisible(true);
    }

    private static JMenuBar getjMenuBar() {

        JMenu fileMenu = new JMenu("File");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        exitItem.addActionListener(e -> System.exit(0));

        var menuBar = new JMenuBar();

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
        return menuBar;
    }
}
