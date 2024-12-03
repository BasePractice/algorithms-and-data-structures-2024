package ru.mirea.practice.lab5.football;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballButton extends JFrame {
    private int scoreMilan = 0;
    private int scoreMadrid = 0;

    private final JLabel resultLabel = new JLabel("Result: 0 X 0");
    private final JLabel lastScorerLabel = new JLabel("Last Scorer: N/A");
    private final JLabel winnerLabel = new JLabel("Winner: DRAW");

    public FootballButton() {
        setTitle("Football Score");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        JButton buttonMilan = new JButton("AC Milan");
        JButton buttonMadrid = new JButton("Real Madrid");

        buttonMilan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scoreMilan++;
                updateScore("AC Milan");
            }
        });

        buttonMadrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scoreMadrid++;
                updateScore("Real Madrid");
            }
        });

        add(resultLabel);
        add(lastScorerLabel);
        add(winnerLabel);
        add(buttonMilan);
        add(buttonMadrid);

        setVisible(true);
    }

    private void updateScore(String lastScorer) {
        resultLabel.setText("Result: " + scoreMilan + " X " + scoreMadrid);
        lastScorerLabel.setText("Last Scorer: " + lastScorer);

        if (scoreMilan > scoreMadrid) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (scoreMadrid > scoreMilan) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }
}