package ru.mirea.practice.s0000001.num1;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class EditorFrame extends JFrame {

    public EditorFrame(ICreateDocument factory) {
        setTitle("Text Editor");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        JMenuItem newItem = new JMenuItem("New");
        fileMenu.add(newItem);

        JMenuItem openItem = new JMenuItem("Open");
        fileMenu.add(openItem);

        JMenuItem saveItem = new JMenuItem("Save");
        fileMenu.add(saveItem);

        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(exitItem);

        newItem.addActionListener(e -> {
            factory.createNew();
            System.out.println("New document created");
        });

        openItem.addActionListener(e -> {
            factory.createOpen();
            System.out.println("Document opened");
        });

        saveItem.addActionListener(e -> System.out.println("Document saved"));

        exitItem.addActionListener(e -> System.exit(0));
    }
}
