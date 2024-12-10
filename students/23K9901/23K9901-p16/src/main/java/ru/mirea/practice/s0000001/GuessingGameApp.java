package ru.mirea.practice.s0000001;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public final class GuessingGameApp {
    private GuessingGameApp() {}

    private static GuessingGame game;

    public static void main(String[] args) {
        game = new GuessingGame();
        JFrame frame = new JFrame("Игра Угадайка");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        JPanel centerPanel = new JPanel();
        JLabel label = new JLabel("Угадайте число от 0 до 20:");
        JTextField textField = new JTextField(10);
        JButton guessButton = new JButton("Угадать");

        centerPanel.add(label);
        centerPanel.add(textField);
        centerPanel.add(guessButton);
        frame.add(centerPanel, BorderLayout.CENTER);

        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int userGuess = Integer.parseInt(textField.getText());
                    game.guess(userGuess);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Пожалуйста, введите корректное число.");
                }
            }
        });

        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                Component source = e.getComponent();
                if (source.getBounds().contains(e.getPoint())) {
                    if (source.equals(centerPanel)) {
                        JOptionPane.showMessageDialog(frame, "Добро пожаловать в ЦАО");
                    } else if (source.equals(frame.getContentPane().getComponent(0))) {
                        JOptionPane.showMessageDialog(frame, "Добро пожаловать в ЗАО");
                    } else if (source.equals(frame.getContentPane().getComponent(1))) {
                        JOptionPane.showMessageDialog(frame, "Добро пожаловать в ЮАО");
                    } else if (source.equals(frame.getContentPane().getComponent(2))) {
                        JOptionPane.showMessageDialog(frame, "Добро пожаловать в САО");
                    } else if (source.equals(frame.getContentPane().getComponent(3))) {
                        JOptionPane.showMessageDialog(frame, "Добро пожаловать в ВАО");
                    }
                }
            }
        });


        frame.setVisible(true);
    }
}


