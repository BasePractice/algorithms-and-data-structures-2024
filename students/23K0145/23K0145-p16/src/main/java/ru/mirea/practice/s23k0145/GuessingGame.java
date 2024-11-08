package ru.mirea.practice.s23k0145;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public abstract class GuessingGame {
    private static int randomNumber;
    private static int attempts = 0;
    private static final int MAX_ATTEMPTS = 3;
    private static boolean welcomeShown = false;

    public static void main(String[] args) {
        randomNumber = new Random().nextInt(21);

        JFrame frame = new JFrame("Игра Угадайка");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        JTextField textField = new JTextField(10);
        JButton guessButton = new JButton("Угадать");

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());
        inputPanel.add(textField);
        inputPanel.add(guessButton);

        frame.add(inputPanel, BorderLayout.SOUTH);

        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (!welcomeShown) {
                    if (e.getY() < 50) {
                        JOptionPane.showMessageDialog(frame, "Добро пожаловать в САО");
                    } else if (e.getY() > frame.getHeight() - 50) {
                        JOptionPane.showMessageDialog(frame, "Добро пожаловать ЮАО");
                    } else if (e.getX() < 50) {
                        JOptionPane.showMessageDialog(frame, "Добро пожаловать в ЗАО");
                    } else if (e.getX() > frame.getWidth() - 50) {
                        JOptionPane.showMessageDialog(frame, "Добро пожаловать в ВАО");
                    } else {
                        JOptionPane.showMessageDialog(frame, "Добро пожаловать в ЦАО");
                    }
                    welcomeShown = true;
                }
            }
        });

        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Введите число перед нажатием кнопки!");
                    return;
                }

                try {
                    int userGuess = Integer.parseInt(textField.getText());
                    attempts++;

                    if (userGuess < 0 || userGuess > 20) {
                        JOptionPane.showMessageDialog(frame, "Введите число от 0 до 20!");
                    } else if (userGuess == randomNumber) {
                        JOptionPane.showMessageDialog(frame, "Поздравляем! Вы угадали число: " + randomNumber);
                        System.exit(0);
                    } else if (attempts < MAX_ATTEMPTS) {
                        String hint = userGuess < randomNumber ? "Больше!" : "Меньше!";
                        JOptionPane.showMessageDialog(frame, hint);
                    } else {
                        JOptionPane.showMessageDialog(frame, "Вы исчерпали попытки! Загаданное число: " + randomNumber);
                        System.exit(0);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Введите корректное число!");
                }

                textField.setText("");
                textField.requestFocus();
            }
        });

        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowOpened(java.awt.event.WindowEvent e) {
                textField.requestFocus();
            }
        });

        frame.setVisible(true);
    }
}
