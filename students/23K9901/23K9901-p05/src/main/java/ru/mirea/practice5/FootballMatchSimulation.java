package ru.mirea.practice5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballMatchSimulation extends JFrame {
    private int scoreMilan = 0;
    private int scoreMadrid = 0;

    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;

    public FootballMatchSimulation() {
        setTitle("Football Match Simulation");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        JButton buttonMilan = new JButton("AC Milan");
        JButton buttonMadrid = new JButton("Real Madrid");

        resultLabel = new JLabel("Result: 0 X 0", SwingConstants.CENTER);
        lastScorerLabel = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
        winnerLabel = new JLabel("Winner: DRAW", SwingConstants.CENTER);

        buttonMilan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scoreMilan++;
                updateGame("AC Milan");
            }
        });

        buttonMadrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scoreMadrid++;
                updateGame("Real Madrid");
            }
        });

        add(buttonMilan);
        add(buttonMadrid);
        add(resultLabel);
        add(lastScorerLabel);
        add(winnerLabel);

        setVisible(true);
    }

    private void updateGame(String lastScorer) {
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

    public static void main(String[] args) {
        new FootballMatchSimulation();
    }
}

