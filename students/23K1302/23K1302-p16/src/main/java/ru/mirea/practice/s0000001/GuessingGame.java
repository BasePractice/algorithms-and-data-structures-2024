package ru.mirea.practice.s0000001;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GuessingGame extends JFrame {
    private JTextField inputField;
    private JButton guessButton;
    private int targetNumber;
    private int attempts;

    public GuessingGame() {
        targetNumber = (int) (Math.random() * 21);
        System.out.println("Загаданное число: " + targetNumber);
        attempts = 3;

        setTitle("Угадай число");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        inputField = new JTextField(10);
        guessButton = new JButton("Угадать");

        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkGuess();
            }
        });

        inputField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // Тут пусто(
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // Тут пусто(
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    checkGuess();
                }
            }
        });

        inputField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                inputField.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Тут пусто(
            }
        });

        guessButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                guessButton.setText("Попробуй!");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                guessButton.setText("Угадать");
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                JOptionPane.showMessageDialog(null, "Спасибо за игру!");
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Введите число от 0 до 20:"));
        panel.add(inputField);
        panel.add(guessButton);

        add(panel);
    }

    private void checkGuess() {
        try {
            int guess = Integer.parseInt(inputField.getText());
            if (guess == targetNumber) {
                JOptionPane.showMessageDialog(this, "Поздравляем! Вы угадали!");
                System.exit(0);
            } else {
                attempts--;
                if (attempts > 0) {
                    String hint = guess < targetNumber ? "Загаданное число больше." : "Загаданное число меньше.";
                    JOptionPane.showMessageDialog(this, hint + " Осталось попыток: " + attempts);
                } else {
                    JOptionPane.showMessageDialog(this, "Попытки закончились. Вы не угадали! Загаданное число: " + targetNumber);
                    System.exit(0);
                }
            }
            inputField.setText("");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Введите целое число.");
            inputField.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new GuessingGame().setVisible(true);
        });
    }
}
