package ru.mirea.practice.s0000005.task1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.EventQueue;

public class MatchSimulator extends JFrame {
    // Переменные для хранения количества голов
    private int spartakGoals = 0;
    private int cskaGoals = 0;

    // Последний забивший
    private String[] lastScorers = {"N/A"};

    // Компоненты GUI
    private JLabel scoreDisplay = new JLabel("Result: 0 X 0");
    private JLabel lastGoalLabel = new JLabel("Last Scorer: N/A");
    private JLabel currentWinner = new JLabel("Winner: DRAW");

    // Конструктор класса MatchSimulator
    public MatchSimulator() {
        setTitle("Футбольный Симулятор Матча");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());


        JButton spartakButton = new JButton("Забить Спартаку!");
        JButton cskaButton = new JButton("Забить ЦСКА!");


        add(spartakButton);
        add(cskaButton);
        add(scoreDisplay);
        add(lastGoalLabel);
        add(currentWinner);


        spartakButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                spartakGoals++; // Увеличиваем счет для Спартака
                lastScorers[0] = "Спартак"; // Обновляем последнего забившего
                updateDisplay(); // Обновляем интерфейс
            }
        });


        cskaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cskaGoals++; // Увеличиваем счет для ЦСКА
                lastScorers[0] = "ЦСКА"; // Обновляем последнего забившего
                updateDisplay(); // Обновляем интерфейс
            }
        });
    }


    private void updateDisplay() {
        String currentScore = String.format("Result: %d X %d", spartakGoals, cskaGoals); // Обновляем результат
        scoreDisplay.setText(currentScore);
        lastGoalLabel.setText("Last Scorer: " + lastScorers[0]); // Обновляем последнего забившего
        currentWinner.setText(determineWinner()); // Обновляем информацию о победителе
    }


    private String determineWinner() {
        if (spartakGoals > cskaGoals) {
            return "Winner: Спартак";
        } else if (cskaGoals > spartakGoals) {
            return "Winner: ЦСКА";
        } else {
            return "Winner: DRAW"; // Если счёт равный, объявляем ничью
        }
    }


    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            MatchSimulator frame = new MatchSimulator(); // Создание окна
            frame.setVisible(true); // Отображение окна
        });
    }
}