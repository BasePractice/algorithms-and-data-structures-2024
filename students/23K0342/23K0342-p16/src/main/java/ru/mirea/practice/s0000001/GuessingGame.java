package ru.mirea.practice.s0000001;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class GuessingGame extends JFrame {
    private JTextField guessField;
    private JButton guessButton;
    private JLabel messageLabel;
    private int numberToGuess;
    private int attempts;

    public GuessingGame() {
        setTitle("Игра-угадайка");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        guessField = new JTextField();
        guessButton = new JButton("Угадать");
        messageLabel = new JLabel("Введите число от 0 до 20 и нажмите 'Угадать'.");

        Random random = new Random();
        numberToGuess = random.nextInt(21);
        attempts = 0;

        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                makeGuess();
            }
        });

        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.LIGHT_GRAY);
        centerPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ЦАО");
            }
        });

        JPanel westPanel = new JPanel();
        westPanel.setBackground(Color.GRAY);
        westPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ЗАО");
            }
        });

        JPanel southPanel = new JPanel();
        southPanel.setBackground(Color.DARK_GRAY);
        southPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать ЮАО");
            }
        });

        JPanel northPanel = new JPanel();
        northPanel.setBackground(Color.LIGHT_GRAY);
        northPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в САО");
            }
        });

        JPanel eastPanel = new JPanel();
        eastPanel.setBackground(Color.GRAY);
        eastPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ВАО");
            }
        });

        add(centerPanel, BorderLayout.CENTER);
        add(westPanel, BorderLayout.WEST);
        add(southPanel, BorderLayout.SOUTH);
        add(northPanel, BorderLayout.NORTH);
        add(eastPanel, BorderLayout.EAST);

        JPanel inputPanel = new JPanel();
        inputPanel.add(guessField);
        inputPanel.add(guessButton);

        add(inputPanel, BorderLayout.SOUTH);
        add(messageLabel, BorderLayout.NORTH);

        setVisible(true);
    }

    private void makeGuess() {
        try {
            int userGuess = Integer.parseInt(guessField.getText());
            attempts++;

            if (userGuess < 0 || userGuess > 20) {
                messageLabel.setText("Пожалуйста, введите число от 0 до 20.");
                return;
            }

            if (userGuess == numberToGuess) {
                messageLabel.setText("Поздравляем! Вы угадали число!");
                guessField.setEnabled(false);
                guessButton.setEnabled(false);
            } else if (attempts >= 3) {
                messageLabel.setText("Вы исчерпали все попытки. Загаданное число: " + numberToGuess);
                guessField.setEnabled(false);
                guessButton.setEnabled(false);
            } else if (userGuess < numberToGuess) {
                messageLabel.setText("Загаданное число больше. У вас осталось " + (3 - attempts) + " попытки.");
            } else {
                messageLabel.setText("Загаданное число меньше. У вас осталось " + (3 - attempts) + " попытки.");
            }
        } catch (NumberFormatException e) {
            messageLabel.setText("Пожалуйста, введите корректное число.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GuessingGame());
    }
}

