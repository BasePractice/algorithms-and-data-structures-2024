package ru.mirea.practice.s23k0120.task1;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.JOptionPane;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessGameFrame extends JFrame {
    private final GuessGame game;
    private JTextField textField;
    private JLabel infoText;

    public GuessGameFrame(int minNum, int maxNum, int tries) throws HeadlessException {
        game = new GuessGame(minNum, maxNum, tries);
        initFrame();
    }

    private void initFrame() {
        textField = new JTextField(5);

        textField.setSize(300, 50);

        JButton button = new JButton("Enter");
        button.setSize(100, 50);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputGuessNum();
                processGame();
            }
        });

        infoText = new JLabel("Guessing game! Enter a number between "
            + game.getMinNum() + " and " + game.getMaxNum()
            + "    Tries left: " + game.getTries());

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createParallelGroup()
            .addGroup(layout.createSequentialGroup()
                .addComponent(textField))
            .addComponent(button)
            .addComponent(infoText));

        layout.setVerticalGroup(layout.createSequentialGroup()
            .addComponent(textField)
            .addComponent(button)
            .addComponent(infoText));

        setSize(700, 150);
        setResizable(false);
        setLocation(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void inputGuessNum() {
        int num;
        try {
            num = Integer.parseInt(textField.getText());
        } catch (NumberFormatException e) {
            setExceptionText();
            game.setIncorrect();
            return;
        }

        if (num > game.getMaxNum() || num < game.getMinNum()) {
            setExceptionText();
        } else {
            game.guess(num);
        }
    }

    public void processGame() {
        switch (game.getStateOfGame()) {
            case WIN:
                showWinWindow();
                break;
            case LOSE:
                showLoseWindow();
                break;
            case INPROGRESS:
                textField.setText("");
                if (game.getStateOfGuess() != GuessGame.GuessState.INCORRECT) {
                    setGuessText();
                }
                break;
            default: break;
        }
    }

    private void setGuessText() {
        String guess = "";

        switch (game.getStateOfGuess()) {
            case GREATER:
                guess = "greater";
                break;
            case SMALLER:
                guess = "smaller";
                break;
            case INCORRECT:
                break;
            default: break;
        }
        String guessText = "Your number is " + guess + " than the chosen number! Enter a number between "
            + game.getMinNum() + " and " + game.getMaxNum() + "    Tries left: " + game.getTries();

        infoText.setText(guessText);
    }

    private void showLoseWindow() {
        JOptionPane.showMessageDialog(null, "You've lost! Correct number is: " + game.getNumToGuess());
        System.exit(0);
    }

    private void showWinWindow() {
        JOptionPane.showMessageDialog(null, "You've won! You guessed the correct number: " + game.getNumToGuess());
        System.exit(0);
    }

    private void setExceptionText() {
        infoText.setText("Incorrect number! Enter a number between " + game.getMinNum()
            +  " and " + game.getMaxNum() + "    Tries left: " + game.getTries());
    }
}
