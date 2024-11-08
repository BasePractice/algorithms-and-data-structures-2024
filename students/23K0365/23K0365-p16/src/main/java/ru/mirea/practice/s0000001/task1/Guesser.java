package ru.mirea.practice.s0000001.task1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Guesser extends JFrame {
    JTextField guess = new JTextField(10);
    JButton button = new JButton("Guess!");
    int attempts = 0;
    int num = 1;//(int) (Math.random() * 20);

    boolean isGuessing = false;
    JPanel needed = new JPanel();

    Guesser() {
        super("Guesser");
        System.out.println(num);
        setLayout(new GridLayout(2, 10));
        setSize(400, 300);
        needed.add(new JLabel("Your guess:"));
        needed.add(guess);
        needed.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                isGuessing = true;
                if (attempts < 3) {
                    if (!guess.getText().isEmpty()) {
                        if (Integer.parseInt(guess.getText()) > num) {
                            JOptionPane.showMessageDialog(null, "Wrong. Guessed number is lower(", "Result", 1);
                        } else if (Integer.parseInt(guess.getText()) < num) {
                            JOptionPane.showMessageDialog(null, "Wrong. Guessed number is higher(", "Result", 1);
                        } else if (Integer.parseInt(guess.getText()) == num) {
                            JOptionPane.showMessageDialog(null, "You are right!!!!!", "Result", 1);
                            dispose();
                            System.exit(0);
                        }
                        attempts += 1;
                    } else {
                        JOptionPane.showMessageDialog(null, "ENTER NUMBER!", "ERORR", 2);
                    }
                    isGuessing = false;
                } else {
                    JOptionPane.showMessageDialog(null, "Your ammount of guess is over", "Good Bye!", 2);
                    System.exit(0);
                }
            }
        });

        setLayout(new BorderLayout());
        add(needed, BorderLayout.CENTER);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent a) {
                if (!isGuessing) {
                    if (a.getY() < 50) {
                        JOptionPane.showMessageDialog(null, "Welcome to 'САО'", "Welcome", 2);
                    } else if (a.getY() > getHeight() - 50) {
                        JOptionPane.showMessageDialog(null, "Welcome to 'ЮАО'", "Welcome", 2);
                    } else if (a.getX() < 50) {
                        JOptionPane.showMessageDialog(null, "Welcome to 'ЗАО'", "Welcome", 2);
                    } else if (a.getX() > getWidth() - 50) {
                        JOptionPane.showMessageDialog(null, "Welcome to 'ВАО'", "Welcome", 2);
                    } else {
                        JOptionPane.showMessageDialog(null, "Welcome to 'ЦАО'", "Welcome", 2);
                    }
                    isGuessing = true;
                }
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new Guesser();
    }
}
