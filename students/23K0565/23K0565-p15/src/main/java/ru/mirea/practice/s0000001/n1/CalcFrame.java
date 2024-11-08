package ru.mirea.practice.s0000001.n1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcFrame extends JFrame {
    private JTextField display = new JTextField();
    private double firstNum = 0;
    private double secondNum = 0;
    private String operator = "";

    public CalcFrame() {
        setTitle("Калькулятор");
        setSize(400, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

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
            switch (cmd) {
                case "+":
                case "-":
                case "*":
                case "/":
                    operator = cmd;
                    firstNum = Double.parseDouble(display.getText());
                    display.setText("");
                    break;
                case "=":
                    secondNum = Double.parseDouble(display.getText());
                    display.setText(calculateResult());
                    break;
                default:
                    display.setText(display.getText() + cmd);
                    break;
            }
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
