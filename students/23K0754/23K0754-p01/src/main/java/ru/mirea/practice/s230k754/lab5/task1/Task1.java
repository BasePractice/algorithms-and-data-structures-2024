package ru.mirea.practice.s230k754.lab5.task1;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;


import java.awt.Color;
import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public final class Task1 {
    private Task1() {}


    public static void main(String[] args) {
        JFrame frame = new JFrame("Task1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);

        panel.setPreferredSize(new Dimension(200, 100));

        JButton button1 = new JButton("AC Milan");

        JButton button2 = new JButton("Real Madrid");

        JLabel result = new JLabel("Result: 0 X 0");
        JLabel lastScore = new JLabel("Last Scorer: N/A");
        JLabel winner = new JLabel("Winner: DRAW");

        Score score = new Score();
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score.setScoreMilan();
                result.setText("Result: " + score.getScoreMilan() + " X " + score.getScoreReal());
                lastScore.setText(score.getLastScore());
                winner.setText(score.getWinner());
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score.setScoreReal();
                result.setText("Result: " + score.getScoreMilan() + " X " + score.getScoreReal());
                lastScore.setText(score.getLastScore());
                winner.setText(score.getWinner());
            }
        });




        panel.add(button1);
        panel.add(button2);
        panel.add(result);
        panel.add(lastScore);
        panel.add(winner);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
