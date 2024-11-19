package ru.mirea.practice.s23k0823.task1.task1.task2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.Component;

public class RpnCalculatorView {
    private JFrame frame;
    private JTextField inputField;
    private JTextArea historyArea;
    private JTextArea resultArea;
    private JPanel buttonPanel;

    public RpnCalculatorView() {
        frame = new JFrame("RPN Calculator");
        inputField = new JTextField(20);
        historyArea = new JTextArea(10, 20);
        resultArea = new JTextArea(5, 20);
        resultArea.setEditable(false);
        historyArea.setEditable(false);

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        setupUI();
    }

    private void setupUI() {
        frame.setLayout(new BorderLayout());
        frame.add(inputField, BorderLayout.NORTH);
        addButtons();
        frame.add(buttonPanel, BorderLayout.CENTER);

        JPanel outputPanel = new JPanel();
        outputPanel.setLayout(new BorderLayout());
        outputPanel.add(new JScrollPane(historyArea), BorderLayout.CENTER);
        outputPanel.add(new JScrollPane(resultArea), BorderLayout.SOUTH);
        frame.add(outputPanel, BorderLayout.EAST);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void addButtons() {
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            buttonPanel.add(button);
        }
    }

    public String getInput() {
        return inputField.getText();
    }

    public void setInput(String input) {
        inputField.setText(input);
    }

    public void addToHistory(String expression) {
        historyArea.append(expression + "\n");
    }

    public void setResult(String result) {
        resultArea.setText(result);
    }

    public void addButtonListener(ActionListener listener) {
        for (Component component : buttonPanel.getComponents()) {
            if (component instanceof JButton) {
                ((JButton) component).addActionListener(listener);
            }
        }
    }

    public void clearInput() {
        inputField.setText("");
    }
}



