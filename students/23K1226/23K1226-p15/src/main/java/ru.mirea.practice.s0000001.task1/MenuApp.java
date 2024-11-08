package ru.mirea.practice.s0000001.task1;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public final class MenuApp {
    private MenuApp() {
        // Приватный конструктор предотвращает создание экземпляра
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            final JFrame frame = new JFrame("Menu Application");
            frame.setSize(400, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            final JMenuBar menuBar = new JMenuBar();
            final JMenu fileMenu = new JMenu("File");
            final JMenuItem saveItem = new JMenuItem("Save");
            final JMenuItem exitItem = new JMenuItem("Exit");

            final JMenu editMenu = new JMenu("Edit");
            final JMenuItem copyItem = new JMenuItem("Copy");
            final JMenuItem cutItem = new JMenuItem("Cut");
            final JMenuItem pasteItem = new JMenuItem("Paste");

            final JMenu helpMenu = new JMenu("Help");

            saveItem.addActionListener(new MenuActionListener());
            exitItem.addActionListener(new MenuActionListener());
            copyItem.addActionListener(new MenuActionListener());
            cutItem.addActionListener(new MenuActionListener());
            pasteItem.addActionListener(new MenuActionListener());

            fileMenu.add(saveItem);
            fileMenu.add(exitItem);
            editMenu.add(copyItem);
            editMenu.add(cutItem);
            editMenu.add(pasteItem);
            menuBar.add(fileMenu);
            menuBar.add(editMenu);
            menuBar.add(helpMenu);
            frame.setJMenuBar(menuBar);

            final JPanel panel = new JPanel();
            panel.setLayout(new BorderLayout());
            final JTextArea textArea = new JTextArea();
            textArea.setEditable(true);
            panel.add(new JScrollPane(textArea), BorderLayout.CENTER);

            frame.add(panel);
            frame.setVisible(true);
        });
    }

    private static class MenuActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JMenuItem source = (JMenuItem) e.getSource();
            if ("Exit".equals(source.getText())) {
                System.exit(0);
            } else {
                System.out.println(source.getText() + " selected");
            }
        }
    }
}
