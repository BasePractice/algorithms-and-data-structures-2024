package ru.mirea.practice.s23f0011;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task1 extends JFrame {
    private final JLabel resultLabel;
    private final JLabel lastScorerLabel;
    private final JLabel winnerLabel;
    private int milanScore = 0;
    private int madridScore = 0;
    private String lastScorer = "N/A";

    public Task1() {
        super("Match Simulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new GridLayout(5, 1));
        setLocationRelativeTo(null);

        // Первая кнопка
        JButton milanButton = new JButton("AC Milan");
        milanButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                updateScore();
                lastScorer = "AC Milan";
                updateLastScorer();
                updateWinner();
            }
        });

        // Вторая кнопка
        JButton madridButton = new JButton("Real Madrid");
        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                updateScore();
                lastScorer = "Real Madrid";
                updateLastScorer();
                updateWinner();
            }
        });

        resultLabel = new JLabel("Result: 0 X 0");

        lastScorerLabel = new JLabel("Last Scorer: " + lastScorer);

        winnerLabel = new JLabel("Winner: DRAW");

        add(milanButton);
        add(madridButton);
        add(resultLabel);
        add(lastScorerLabel);
        add(winnerLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Task1();
    }

    private void updateScore() {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
    }

    private void updateLastScorer() {
        lastScorerLabel.setText("Last Scorer: " + lastScorer);
    }

    private void updateWinner() {
        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (madridScore > milanScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }
}


