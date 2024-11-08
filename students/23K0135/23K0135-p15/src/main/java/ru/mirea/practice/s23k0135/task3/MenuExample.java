package ru.mirea.practice.s23k0135.task3;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;

public class MenuExample extends JFrame {

    public MenuExample() {
        setTitle("Hello Swing");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create text area
        JTextArea textArea = new JTextArea(); // textArea is now local
        add(textArea, BorderLayout.CENTER);

        // Create menu bar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // File menu
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);
        JMenuItem saveItem = new JMenuItem("Save");
        saveItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement save functionality
                System.out.println("Save action triggered");
            }
        });
        fileMenu.add(saveItem);
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        fileMenu.add(exitItem);

        // Edit menu
        JMenu editMenu = new JMenu("Edit");
        menuBar.add(editMenu);
        JMenuItem copyItem = new JMenuItem("Copy");
        copyItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement copy functionality
                System.out.println("Copy action triggered");
            }
        });
        editMenu.add(copyItem);
        JMenuItem cutItem = new JMenuItem("Cut");
        cutItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement cut functionality
                System.out.println("Cut action triggered");
            }
        });
        editMenu.add(cutItem);
        JMenuItem pasteItem = new JMenuItem("Paste");
        pasteItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement paste functionality
                System.out.println("Paste action triggered");
            }
        });
        editMenu.add(pasteItem);

        // Help menu
        JMenu helpMenu = new JMenu("Help");
        menuBar.add(helpMenu);
        JMenuItem aboutItem = new JMenuItem("About");
        aboutItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement about functionality
                System.out.println("About action triggered");
            }
        });
        helpMenu.add(aboutItem);

        // Create buttons
        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton button1 = new JButton("Button 1");
        buttonPanel.add(button1);
        JButton button2 = new JButton("Button 2");
        buttonPanel.add(button2);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MenuExample());
    }
}
