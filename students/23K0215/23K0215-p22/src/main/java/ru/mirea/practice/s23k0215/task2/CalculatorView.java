package ru.mirea.practice.s23k0215.task2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

public class CalculatorView {
    private final JTextField inputField;
    private final JTextArea resultArea;
    private final JButton[] numberButtons;
    private final JButton[] operationButtons;
    private final JButton calculateButton;
    private final String[] operations = {"+", "-", "*", "/", "C"};

    public CalculatorView() {
        final JFrame frame = new JFrame("RPN Calculator"); // Объявление как final и инициализация
        inputField = new JTextField(20);
        resultArea = new JTextArea(10, 30);
        calculateButton = new JButton("Вычислить");

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
        }

        operationButtons = new JButton[operations.length];
        for (int i = 0; i < operations.length; i++) {
            operationButtons[i] = new JButton(operations[i]);
        }

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4));

        panel.add(new JLabel("Введите выражение (RPN):"));
        panel.add(inputField);
        panel.add(calculateButton);
        panel.add(resultArea);

        for (JButton numberButton : numberButtons) {
            panel.add(numberButton);
        }

        for (JButton operationButton : operationButtons) {
            panel.add(operationButton);
        }

        resultArea.setEditable(false);
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); // Первое использование переменной frame
    }

    public String getInput() {
        return inputField.getText();
    }

    public void setInput(String input) {
        inputField.setText(input);
    }

    public void setResult(String result) {
        resultArea.setText(result);
    }

    public void addCalculateListener(ActionListener listenForCalcButton) {
        calculateButton.addActionListener(listenForCalcButton);
    }

    public void addNumberButtonListener(ActionListener listener) {
        for (JButton numberButton : numberButtons) {
            numberButton.addActionListener(listener);
        }
    }

    public void addOperationButtonListener(ActionListener listener) {
        for (JButton operationButton : operationButtons) {
            operationButton.addActionListener(listener);
        }
    }
}
