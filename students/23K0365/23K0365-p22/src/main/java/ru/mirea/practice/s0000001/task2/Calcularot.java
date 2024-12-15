package ru.mirea.practice.s0000001.task2;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //протестировано на "2", "3", "*", "4", "5", "*", "+"

public class Calcularot extends JFrame {
    private JLabel res = new JLabel("", SwingConstants.RIGHT);
    private String text = "";

    Calcularot() {
        super("Calculator");
        setLayout(new BorderLayout());
        setSize(400, 500);
        res.setFont(new Font("Arial", Font.BOLD, 24));
        res.setPreferredSize(new Dimension(400, 50));
        add(res, BorderLayout.NORTH);
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", " ", "=", "+"
        };
        for (String btnText : buttons) {
            JButton button = new JButton(btnText);
            button.setFont(new Font("Arial", Font.PLAIN, 24));
            buttonPanel.add(button);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if ("=".equals(btnText)) {
                        String formattedText = formatTextForCalculation(text);
                        String[] tokens = formattedText.split(" ");
                        double result = Pln.calculateSmth(tokens);
                        if (!Double.isNaN(result)) {
                            res.setText(String.valueOf(result));
                        } else {
                            JOptionPane.showMessageDialog(null, "Calculation error", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                        text = "";
                    } else if (" ".equals(btnText)) {
                        text += " ";
                        res.setText(text);
                    } else if ("+".equals(btnText) | "*".equals(btnText)
                        | "/".equals(btnText) | "-".equals(btnText)) {
                        text += " " + btnText + " ";
                        res.setText(text);
                    } else {
                        text += btnText;
                        res.setText(text);
                    }
                }
            });
        }

        add(buttonPanel, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private String formatTextForCalculation(String input) {
        input = input.trim();
        StringBuilder formattedText = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                formattedText.append(ch);
            } else if (isOperator(ch)) {
                formattedText.append(" ").append(ch).append(" ");
            } else if (ch == ' ') {
                formattedText.append(" ");
            }
        }
        return formattedText.toString();
    }

    private boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }

    public static void main(String[] args) {
        new Calcularot();
    }
}
