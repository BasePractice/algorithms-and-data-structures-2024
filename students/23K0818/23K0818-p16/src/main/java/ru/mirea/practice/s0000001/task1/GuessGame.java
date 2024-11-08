package ru.mirea.practice.s0000001.task1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class GuessGame extends JFrame {

    private int targetNumber;
    private int attemptsLeft;
    private JTextField guessField;
    private JLabel resultLabel;

    public GuessGame() {
        setTitle("Угадай число");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Инициализация игры
        targetNumber = new Random().nextInt(21);
        attemptsLeft = 3;

        // Создание компонентов
        guessField = new JTextField(10);
        resultLabel = new JLabel("Угадай число от 0 до 20. У тебя 3 попытки.");

        // Установка макета
        setLayout(new BorderLayout());

        // Создание панелей для областей
        JPanel northPanel = new JPanel();
        JPanel southPanel = new JPanel();
        JPanel westPanel = new JPanel();

        // Добавление компонентов на панели
        northPanel.add(new JLabel("САО"));
        southPanel.add(new JLabel("ЮАО"));

        JPanel eastPanel = new JPanel();
        JPanel centerPanel = new JPanel();

        westPanel.add(new JLabel("ЗАО"));
        eastPanel.add(new JLabel("ВАО"));
        centerPanel.add(guessField);
        centerPanel.add(resultLabel);

        // Локальная переменная вместо поля класса
        JButton guessButton = new JButton("Угадать");
        centerPanel.add(guessButton);

        // Добавление панелей на основное окно
        add(northPanel, BorderLayout.NORTH);
        add(southPanel, BorderLayout.SOUTH);
        add(westPanel, BorderLayout.WEST);
        add(eastPanel, BorderLayout.EAST);
        add(centerPanel, BorderLayout.CENTER);

        // Обработка событий мыши
        northPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(GuessGame.this, "Добро пожаловать в САО");
            }
        });

        southPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(GuessGame.this, "Добро пожаловать в ЮАО");
            }
        });

        westPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(GuessGame.this, "Добро пожаловать в ЗАО");
            }
        });

        eastPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(GuessGame.this, "Добро пожаловать в ВАО");
            }
        });

        centerPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(GuessGame.this, "Добро пожаловать в ЦАО");
            }
        });

        // Обработка событий кнопки
        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int guess = Integer.parseInt(guessField.getText());
                    attemptsLeft--;

                    if (guess == targetNumber) {
                        JOptionPane.showMessageDialog(GuessGame.this, "Поздравляем! Ты угадал число!");
                        System.exit(0);
                    } else if (attemptsLeft == 0) {
                        JOptionPane.showMessageDialog(GuessGame.this, "Ты исчерпал все попытки. Загаданное число было " + targetNumber);
                        System.exit(0);
                    } else {
                        String message = guess < targetNumber ? "Загаданное число больше" : "Загаданное число меньше";
                        resultLabel.setText(message + ". Осталось попыток: " + attemptsLeft);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(GuessGame.this, "Пожалуйста, введите число от 0 до 20");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GuessGame().setVisible(true);
            }
        });
    }
}
