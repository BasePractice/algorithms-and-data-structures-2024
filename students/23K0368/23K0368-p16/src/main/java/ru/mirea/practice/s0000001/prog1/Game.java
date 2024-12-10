package ru.mirea.practice.s0000001.prog1;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class Game extends JFrame implements ActionListener, MouseListener {
    private final JTextField textField;
    private final JButton button;
    private final int secretNumber;
    private int attemptsLeft;

    // Панели для областей BorderLayout
    private final JPanel northPanel;
    private final JPanel eastPanel;
    private final JPanel westPanel;
    private final JPanel southPanel;
    private final JPanel inputPanel;

    public Game() {
        setTitle("Угадайка");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        // Панель для текстового поля и кнопки
        inputPanel = new JPanel(); // Создаем inputPanel
        inputPanel.setLayout(new FlowLayout());
        add(inputPanel, BorderLayout.CENTER);

        textField = new JTextField(10);
        inputPanel.add(textField);

        button = new JButton("Угадать");
        button.addActionListener(this);
        inputPanel.add(button);

        // Панель для сообщения
        JLabel label = new JLabel("");
        add(label, BorderLayout.SOUTH);

        // Генерация случайного числа
        Random random = new Random();
        secretNumber = random.nextInt(21);

        attemptsLeft = 3;

        // Настройка слушателя мыши для областей
        northPanel = new JPanel();
        northPanel.addMouseListener(this);
        add(northPanel, BorderLayout.NORTH);

        eastPanel = new JPanel();
        eastPanel.addMouseListener(this);
        add(eastPanel, BorderLayout.EAST);

        westPanel = new JPanel();
        westPanel.addMouseListener(this);
        add(westPanel, BorderLayout.WEST);

        southPanel = new JPanel();
        southPanel.addMouseListener(this);
        add(southPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(button)) {
            try {
                int guess = Integer.parseInt(textField.getText());
                attemptsLeft--;

                if (guess == secretNumber) {
                    JOptionPane.showMessageDialog(this, "Вы угадали!");
                    System.exit(0);
                } else {
                    if (attemptsLeft == 0) {
                        JOptionPane.showMessageDialog(this, "Вы исчерпали все попытки. Число"
                            + " было " + secretNumber);
                        System.exit(0);
                    } else {
                        System.out.println("Заходим сюда");
                        if (guess < secretNumber) {
                            JOptionPane.showMessageDialog(this, "Число больше. Осталось"
                                + " попыток: " + attemptsLeft);
                        } else {
                            JOptionPane.showMessageDialog(this, "Число меньше. Осталось"
                                + " попыток: " + attemptsLeft);
                        }
                        textField.setText("");
                    }
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Введите число!");
            }
        }
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        // Не используется в этой игре
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Не используется в этой игре
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Не используется в этой игре
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Object source = e.getSource();

        // Проверка на соответствие областям BorderLayout с использованием обычного instanceof
        if (source instanceof JPanel) {
            JPanel panel = (JPanel) source;

            if (panel.equals(northPanel)) {
                JOptionPane.showMessageDialog(this, "Добро пожаловать в САО");
            } else if (panel.equals(eastPanel)) {
                JOptionPane.showMessageDialog(this, "Добро пожаловать в ВАО");
            } else if (panel.equals(southPanel)) {
                JOptionPane.showMessageDialog(this, "Добро пожаловать в ЮАО");
            } else if (panel.equals(westPanel)) {
                JOptionPane.showMessageDialog(this, "Добро пожаловать в ЗАО");
            } else if (panel.equals(inputPanel)) {
                JOptionPane.showMessageDialog(this, "Добро пожаловать в ЦАО");
            }
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Не используется в этой игре
    }

    public static void main(String[] args) {
        new Game();
    }
}
