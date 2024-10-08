package ru.mirea.practice.s23K0135;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex1 extends JFrame {
    private int scoreMilan = 0;
    private int scoreMadrid = 0;

    private final JLabel resultLabel;
    private final JLabel lastScorerLabel;
    private final JLabel winnerLabel;

    public Ex1() {
        setTitle("Match Results");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        final JButton acMilanButton = new JButton("AC Milan");
        final JButton realMadridButton = new JButton("Real Madrid");

        resultLabel = new JLabel("Result: 0 X 0", JLabel.CENTER);
        lastScorerLabel = new JLabel("Last Scorer: N/A", JLabel.CENTER);
        winnerLabel = new JLabel("Winner: DRAW", JLabel.CENTER);

        GridLayout layout = new GridLayout(1, 2);
        layout.setHgap(10);
        layout.setVgap(10);
        JPanel panel = new JPanel(layout);
        panel.add(acMilanButton);
        panel.add(realMadridButton);

        acMilanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scoreMilan++;
                updateResult("AC Milan");
            }
        });

        realMadridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scoreMadrid++;
                updateResult("Real Madrid");
            }
        });

        add(resultLabel, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        add(lastScorerLabel, BorderLayout.WEST);
        add(winnerLabel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void updateResult(String lastScorer) {
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
        new Ex1();
    }
}
