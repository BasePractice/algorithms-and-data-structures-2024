package ru.mirea.practice.s23k0623.prog2;

import javax.swing.*;
import java.awt.*;

// View
class CalculatorView {
    private JTextField inputField;
    private JTextArea resultArea;
    @SuppressWarnings("PMD.SingularField")
    private JButton calculateButton;


    public CalculatorView() {
        inputField = new JTextField(20);
        resultArea = new JTextArea(5, 20);
        resultArea.setEditable(false);
        calculateButton = new JButton("Вычислить");

        JFrame frame = new JFrame("RPN Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(new JLabel("Введите выражение в ОПН:"), BorderLayout.NORTH);
        panel.add(inputField, BorderLayout.CENTER);
        panel.add(calculateButton, BorderLayout.EAST);
        panel.add(new JScrollPane(resultArea), BorderLayout.SOUTH);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        CalculatorController controller = new CalculatorController(this, new CalculatorModel()); // Создаём controller локально
        calculateButton.addActionListener(controller);
    }

    public String getInputExpression() {
        return inputField.getText();
    }

    public void setResult(String result) {
        resultArea.setText(result);
    }
}
