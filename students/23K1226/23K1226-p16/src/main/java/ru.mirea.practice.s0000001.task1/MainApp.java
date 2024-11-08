package ru.mirea.practice.s0000001.task1;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Container;
import java.util.Random;

public final class MainApp {

    // Приватный конструктор предотвращает создание экземпляров класса
    private MainApp() {
        throw new UnsupportedOperationException("MainApp cannot be instantiated");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainApp::run);
    }

    private static void run() {
        JFrame frame = new JFrame("Java Swing Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        Container container = frame.getContentPane();
        container.setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea();
        container.add(new JScrollPane(textArea), BorderLayout.CENTER);

        final JMenuBar menuBar = new JMenuBar();
        final JMenu colorMenu = new JMenu("Цвет");
        final JMenu fontMenu = new JMenu("Шрифт");

        final JMenuItem blueItem = new JMenuItem("Синий");
        blueItem.addActionListener(e -> textArea.setForeground(Color.BLUE));
        final JMenuItem redItem = new JMenuItem("Красный");
        redItem.addActionListener(e -> textArea.setForeground(Color.RED));
        final JMenuItem blackItem = new JMenuItem("Черный");
        blackItem.addActionListener(e -> textArea.setForeground(Color.BLACK));

        final JMenuItem timesItem = new JMenuItem("Times New Roman");
        timesItem.addActionListener(e -> textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14)));
        final JMenuItem msSansItem = new JMenuItem("MS Sans Serif");
        msSansItem.addActionListener(e -> textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 14)));
        final JMenuItem courierItem = new JMenuItem("Courier New");
        courierItem.addActionListener(e -> textArea.setFont(new Font("Courier New", Font.PLAIN, 14)));

        colorMenu.add(blueItem);
        colorMenu.add(redItem);
        colorMenu.add(blackItem);
        fontMenu.add(timesItem);
        fontMenu.add(msSansItem);
        fontMenu.add(courierItem);

        menuBar.add(colorMenu);
        menuBar.add(fontMenu);
        frame.setJMenuBar(menuBar);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 1));
        JButton guessButton = new JButton("Угадать число");
        panel.add(guessButton);
        container.add(panel, BorderLayout.SOUTH);

        guessButton.addActionListener(e -> startGuessingGame());

        JPanel regionsPanel = new JPanel();
        regionsPanel.setLayout(new BorderLayout());

        regionsPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (e.getSource().equals(regionsPanel.getComponent(0))) {
                    JOptionPane.showMessageDialog(frame, "Добро пожаловать в ЦАО");
                } else if (e.getSource().equals(regionsPanel.getComponent(1))) {
                    JOptionPane.showMessageDialog(frame, "Добро пожаловать в ЗАО");
                } else if (e.getSource().equals(regionsPanel.getComponent(2))) {
                    JOptionPane.showMessageDialog(frame, "Добро пожаловать в ЮАО");
                } else if (e.getSource().equals(regionsPanel.getComponent(3))) {
                    JOptionPane.showMessageDialog(frame, "Добро пожаловать в САО");
                } else if (e.getSource().equals(regionsPanel.getComponent(4))) {
                    JOptionPane.showMessageDialog(frame, "Добро пожаловать в ВАО");
                }
            }
        });

        frame.add(regionsPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private static void startGuessingGame() {
        Random random = new Random();
        int numberToGuess = random.nextInt(21);
        int attempts = 0;
        int maxAttempts = 3;

        while (attempts < maxAttempts) {
            String userGuess = JOptionPane.showInputDialog("Угадайте число от 0 до 20:");
            if (userGuess == null) {
                break;
            }

            try {
                int guess = Integer.parseInt(userGuess);
                if (guess == numberToGuess) {
                    JOptionPane.showMessageDialog(null, "Поздравляем, вы угадали!");
                    break;
                } else if (guess < numberToGuess) {
                    JOptionPane.showMessageDialog(null, "Число больше, попробуйте снова.");
                } else {
                    JOptionPane.showMessageDialog(null, "Число меньше, попробуйте снова.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Пожалуйста, введите действительное число.");
            }

            attempts++;

            if (attempts == maxAttempts) {
                JOptionPane.showMessageDialog(null, "Увы, вы не угадали. Правильное число было " + numberToGuess);
            }
        }
    }
}
