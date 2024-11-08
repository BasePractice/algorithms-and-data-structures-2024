package ru.mirea.practice.s0000001;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessingGame extends JFrame implements ActionListener {
    private JTextField guessField;
    private int randomNumber;
    private int attempts;

    public GuessingGame() {
        setTitle("Guess the Number");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        randomNumber = (int) (Math.random() * 21);
        attempts = 3;

        guessField = new JTextField(10);
        JButton guessButton = new JButton("Guess");
        guessButton.addActionListener(this);

        setLayout(new FlowLayout());
        add(new JLabel("Guess a number between 0 and 20:"));
        add(guessField);
        add(guessButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int guess = Integer.parseInt(guessField.getText());
        attempts--;

        if (guess == randomNumber) {
            JOptionPane.showMessageDialog(this, "Congratulations! You guessed correctly.");
            System.exit(0);
        } else if (attempts == 0) {
            JOptionPane.showMessageDialog(this, "Out of attempts! The number was " + randomNumber);
            System.exit(0);
        } else {
            String hint = guess < randomNumber ? "higher" : "lower";
            JOptionPane.showMessageDialog(this, "Try " + hint + ". Attempts left: " + attempts);
        }
    }

    public static void main(String[] args) {
        new GuessingGame();
    }
}

