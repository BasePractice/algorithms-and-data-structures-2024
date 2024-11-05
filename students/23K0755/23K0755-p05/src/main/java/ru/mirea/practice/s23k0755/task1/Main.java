package ru.mirea.practice.s23k0755.task1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public abstract class Main {

    static int scoreMilan = 0;

    static int scoreMadrid = 0;

    public static void scoreUpdate(int scoreMilan, int scoreMadrid, JLabel score, JLabel lastScorer, Scorer scorer, Label winner) {
        score.setText(String.format("Score %d X %d", scoreMilan, scoreMadrid));
        if (scorer == Scorer.MILAN) {
            lastScorer.setText("Last Scorer: AC Milan");
        } else {
            lastScorer.setText("Last Scorer: Real Madrid");
        }
        switch (Integer.compare(scoreMilan, scoreMadrid)) {
            case -1: {
                winner.setText("Winner: Madrid");
                break;
            }
            case 1: {
                winner.setText("Winner: Milan");
                break;
            }
            default: {
                winner.setText("Winner: DRAW");
                break;
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 450);

        JPanel panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(600, 100));

        JButton buttonMilan = new JButton("AC Milan");
        buttonMilan.setHorizontalAlignment(SwingConstants.CENTER);

        JButton buttonMadrid = new JButton("Real Madrid");
        buttonMadrid.setHorizontalAlignment(SwingConstants.CENTER);

        panel1.add(buttonMilan);
        panel1.add(buttonMadrid);

        JLabel score = new JLabel("Score 0 X 0");
        JLabel lastScorer = new JLabel("Last scorer: N/A");

        JPanel panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(600, 100));
        panel2.add(score);
        panel2.add(lastScorer);

        JPanel panel3 = new JPanel();
        Label winner = new Label("Winner: Draw");
        panel2.setPreferredSize(new Dimension(600, 100));
        panel3.add(winner);

        ActionListener actionMilan = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scoreMilan += 1;
                scoreUpdate(scoreMilan, scoreMadrid, score, lastScorer, Scorer.MILAN, winner);
            }
        };

        ActionListener actionMadrid = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scoreMadrid += 1;
                scoreUpdate(scoreMilan, scoreMadrid, score, lastScorer, Scorer.MADRID, winner);
            }
        };

        buttonMadrid.addActionListener(actionMadrid);
        buttonMilan.addActionListener(actionMilan);

        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);

        frame.setLayout(new GridLayout(3, 1));
        frame.pack();
        frame.setVisible(true);
    }

    public enum Scorer {
        MILAN, MADRID
    }
}
