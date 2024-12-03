package ru.mirea.practice.s23k0623;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.SwingConstants;  // Импорт SwingConstants
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task1 extends JFrame {
    private int milanScore = 0;
    private int madridScore = 0;

    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;  // Метка для отображения победителя

    public Task1() {
        setTitle("Match AC Milan vs Real Madrid");  // Название окна
        setSize(400, 200);  // Размер окна
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Завершение программы при закрытии окна
        setLayout(new BorderLayout());  // Основная компоновка - BorderLayout

        // Панель для кнопок
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());  // Кнопки будут на одной линии

        // Кнопка для команды AC Milan
        JButton milanButton = new JButton("AC Milan");
        // Кнопка для команды Real Madrid
        JButton madridButton = new JButton("Real Madrid");

        // Добавляем кнопки на панель
        buttonPanel.add(milanButton);
        buttonPanel.add(madridButton);

        // Метки
        resultLabel = new JLabel("Result: 0 X 0", SwingConstants.CENTER);
        lastScorerLabel = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
        winnerLabel = new JLabel("Winner: DRAW", SwingConstants.CENTER);

        // Панель для меток
        JPanel labelPanel = new JPanel();
        labelPanel.setLayout(new GridLayout(3, 1));  // Метки будут друг под другом

        // Добавляем метки на панель
        labelPanel.add(resultLabel);
        labelPanel.add(lastScorerLabel);
        labelPanel.add(winnerLabel);

        // Добавляем панели на основное окно
        add(buttonPanel, BorderLayout.NORTH);  // Панель с кнопками наверху
        add(labelPanel, BorderLayout.CENTER);  // Панель с метками по центру

        // Обработчик событий для кнопки AC Milan
        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;  // Увеличиваем счет Милана
                updateScore("AC Milan");
            }
        });

        // Обработчик событий для кнопки Real Madrid
        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;  // Увеличиваем счет Мадрида
                updateScore("Real Madrid");
            }
        });

        setVisible(true);  // Делаем окно видимым
    }

    // Метод для обновления счета, последней забившей команды и победителя
    private void updateScore(String lastScorer) {
        // Обновляем метку с результатом
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
        // Обновляем метку с последней забившей командой
        lastScorerLabel.setText("Last Scorer: " + lastScorer);
        // Определяем победителя
        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (milanScore < madridScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        // Запуск программы
        new Task1();
    }
}