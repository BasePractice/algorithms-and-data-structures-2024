package ru.mirea.practice.s23f0011;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class GuessingGame extends JFrame {
    private final JTextField guessField;
    private final JLabel messageLabel;
    private int secretNumber;
    private int attemptsLeft;

    private final JPanel northPanel;
    private final JPanel southPanel;
    private final JPanel eastPanel;
    private final JPanel westPanel;
    private final JPanel centerPanel;

    public GuessingGame() {
        super("Угадайка");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(300, 150);

        // Верхняя панель для сообщения
        northPanel = new JPanel();
        messageLabel = new JLabel("Угадайте число от 0 до 20");
        northPanel.add(messageLabel);
        add(northPanel, BorderLayout.NORTH);

        // Центральная панель для поля ввода и кнопки
        centerPanel = new JPanel(new FlowLayout());
        guessField = new JTextField(5);
        JButton guessButton = new JButton("Угадать");
        centerPanel.add(guessField);
        centerPanel.add(guessButton);
        add(centerPanel, BorderLayout.CENTER);

        // Южная панель
        southPanel = new JPanel();
        southPanel.setBackground(Color.LIGHT_GRAY);
        add(southPanel, BorderLayout.SOUTH);

        // Восточная панель
        eastPanel = new JPanel();
        eastPanel.setBackground(Color.ORANGE);
        add(eastPanel, BorderLayout.EAST);

        // Западная панель
        westPanel = new JPanel();
        westPanel.setBackground(Color.PINK);
        add(westPanel, BorderLayout.WEST);

        // Инициализация игры
        newGame();

        // Обработчик события для кнопки "Угадать"
        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int guess = Integer.parseInt(guessField.getText());
                    attemptsLeft--;
                    if (guess == secretNumber) {
                        JOptionPane.showMessageDialog(null, "Поздравляем! Вы угадали число!");
                        dispose(); // Закрыть окно
                    } else if (attemptsLeft == 0) {
                        JOptionPane.showMessageDialog(null, "Извините, у вас закончились попытки. Число было: " + secretNumber);
                        dispose(); // Закрыть окно
                    } else {
                        if (guess < secretNumber) {
                            messageLabel.setText("Число больше. Попробуйте еще раз.");
                        } else {
                            messageLabel.setText("Число меньше. Попробуйте еще раз.");
                        }
                        guessField.setText(""); // Очистка поля ввода
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ошибка: Введите число!", "Ошибка", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Обработчики событий для областей BorderLayout
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                Component component = e.getComponent();
                if (component.equals(northPanel)) {
                    JOptionPane.showMessageDialog(null, "Добро пожаловать в САО");
                } else if (component.equals(southPanel)) {
                    JOptionPane.showMessageDialog(null, "Добро пожаловать в ЮАО");
                } else if (component.equals(eastPanel)) {
                    JOptionPane.showMessageDialog(null, "Добро пожаловать в ВАО");
                } else if (component.equals(westPanel)) {
                    JOptionPane.showMessageDialog(null, "Добро пожаловать в ЗАО");
                } else if (component.equals(centerPanel)) {
                    JOptionPane.showMessageDialog(null, "Добро пожаловать в ЦАО");
                }
            }
        });

        setVisible(true);
    }

    // Метод для начала новой игры
    private void newGame() {
        Random random = new Random();
        secretNumber = random.nextInt(21); // Случайное число от 0 до 20
        attemptsLeft = 3;
        messageLabel.setText("Угадайте число от 0 до 20");
        guessField.setText(""); // Очистка поля ввода
    }
}
