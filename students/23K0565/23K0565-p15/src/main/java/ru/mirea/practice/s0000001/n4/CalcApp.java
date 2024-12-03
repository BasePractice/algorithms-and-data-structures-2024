package ru.mirea.practice.s0000001.n4;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcApp extends JFrame {
    private JTextField display;
    private double firstNum = 0;
    private double secondNum = 0;
    private String operator = "";

    public CalcApp() {
        setTitle("Simple Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        display = new JTextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String cmd = e.getActionCommand();

            if ("+".equals(cmd) || "-".equals(cmd) || "*".equals(cmd) || "/".equals(cmd)) {
                operator = cmd;
                firstNum = Double.parseDouble(display.getText());
                display.setText("");
            } else if ("=".equals(cmd)) {
                secondNum = Double.parseDouble(display.getText());
                display.setText(calculateResult());
            } else {
                display.setText(display.getText() + cmd);
            }
        }

        private String calculateResult() {
            double result = 0;
            switch (operator) {
                case "+":
                    result = firstNum + secondNum;
                    break;
                case "-":
                    result = firstNum - secondNum;
                    break;
                case "*":
                    result = firstNum * secondNum;
                    break;
                case "/":
                    result = secondNum != 0 ? firstNum / secondNum : 0;
                    break;
                default:
                    break;
            }
            return String.valueOf(result);
        }
    }

    public static void main(String[] args) {
        new CalcApp();
    }
}
