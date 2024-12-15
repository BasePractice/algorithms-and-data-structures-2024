package ru.mirea.practice.s23k0145.lab2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

public class RpnCalculatorView {
    private final JFrame frame;
    private final JTextField inputField;
    private final JTextArea historyArea;
    private final JTextArea resultArea;
    private final JPanel buttonPanel;

    public RpnCalculatorView() {
        frame = new JFrame("RPN Calculator");
        inputField = new JTextField(20);
        historyArea = new JTextArea(10, 20);
        resultArea = new JTextArea(5, 20);

        buttonPanel = new JPanel(new GridLayout(4, 4));
        initializeUI();
    }

    private void initializeUI() {
        resultArea.setEditable(false);
        historyArea.setEditable(false);

        frame.setLayout(new BorderLayout());
        frame.add(inputField, BorderLayout.NORTH);
        createButtons();
        frame.add(buttonPanel, BorderLayout.CENTER);

        JPanel outputPanel = new JPanel(new BorderLayout());
        outputPanel.add(new JScrollPane(historyArea), BorderLayout.CENTER);
        outputPanel.add(new JScrollPane(resultArea), BorderLayout.SOUTH);
        frame.add(outputPanel, BorderLayout.EAST);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createButtons() {
        String[] buttons = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"};
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

    public void updateHistory(String expression) {
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

