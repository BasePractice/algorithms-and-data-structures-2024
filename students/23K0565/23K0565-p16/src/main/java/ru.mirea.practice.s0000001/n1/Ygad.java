package ru.mirea.practice.s0000001.n1;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ygad extends JFrame {
    private int targetNumber;
    private int attemptsLeft = 3;
    private JTextField guessField;
    private JLabel messageLabel;

    public Ygad() {
        setTitle("Игра-Угадайка:)");
        setSize(400, 400);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        targetNumber = (int) (Math.random() * 21);

        guessField = new JTextField();
        guessField.setHorizontalAlignment(JTextField.CENTER);
        add(guessField, BorderLayout.CENTER);

        JButton guessButton = new JButton("Угадать");
        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkGuess();
            }
        });
        add(guessButton, BorderLayout.SOUTH);

        messageLabel = new JLabel("Угадайте число от 0 до 20. У Вас 3 попытки", SwingConstants.CENTER);
        add(messageLabel, BorderLayout.NORTH);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                showRegionMessage(e.getComponent().getName());
            }
        });

        addRegionPanels();
        setVisible(true);
    }

    private void checkGuess() {
        try {
            int guess = Integer.parseInt(guessField.getText());
            attemptsLeft--;

            if (guess == targetNumber) {
                messageLabel.setText("Поздравляем! Вы угадали число! ^V^");
                guessField.setEnabled(false);
            } else if (attemptsLeft > 0) {
                if (guess < targetNumber) {
                    messageLabel.setText("Неправильно! Загаданное число больше указанного. Осталось попыток: " + attemptsLeft);
                } else {
                    messageLabel.setText("Неправильно! Загаданное число меньше указанного. Осталось попыток: " + attemptsLeft);
                }
            } else {
                messageLabel.setText("Вы исчерпали попытки:( Загаданное число было: " + targetNumber);
                guessField.setEnabled(false);
            }
        } catch (NumberFormatException ex) {
            messageLabel.setText("Пожалуйста, введите целое число");
        }
    }

    private void addRegionPanels() {

        JPanel centerPanel = new JPanel();
        centerPanel.setName("CENTER");
        add(centerPanel, BorderLayout.CENTER);

        JPanel westPanel = new JPanel();
        westPanel.setName("WEST");
        add(westPanel, BorderLayout.WEST);

        JPanel southPanel = new JPanel();
        southPanel.setName("SOUTH");
        add(southPanel, BorderLayout.SOUTH);

        JPanel northPanel = new JPanel();
        northPanel.setName("NORTH");
        add(northPanel, BorderLayout.NORTH);

        JPanel eastPanel = new JPanel();
        eastPanel.setName("EAST");
        add(eastPanel, BorderLayout.EAST);
    }

    private void showRegionMessage(String region) {
        String message = "";
        switch (region) {
            case "CENTER":
                message = "Добро пожаловать в ЦАО";
                break;
            case "WEST":
                message = "Добро пожаловать в ЗАО";
                break;
            case "SOUTH":
                message = "Добро пожаловать в ЮАО";
                break;
            case "NORTH":
                message = "Добро пожаловать в САО";
                break;
            case "EAST":
                message = "Добро пожаловать в ВАО";
                break;
            default:
                message = "Неизвестная область";
                break;
        }
        if (!message.isEmpty()) {
            JOptionPane.showMessageDialog(this, message);
        }
    }

    public static void main(String[] args) {
        new Ygad();
    }
}
