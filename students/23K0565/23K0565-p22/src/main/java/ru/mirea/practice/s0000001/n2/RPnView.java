package ru.mirea.practice.s0000001.n2;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;


public class RPnView extends JFrame {
    private final JTextField inputField = new JTextField();
    private final JButton calcButton = new JButton("Вычислить");
    private final JLabel resultLabel = new JLabel("Результат ");

    public RPnView() {
        setTitle("RPN Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new GridLayout(2, 1));
        topPanel.add(new JLabel("Введите выражение RPN:"));
        topPanel.add(inputField);

        JPanel centerPanel = new JPanel();
        centerPanel.add(calcButton);

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(resultLabel);

        add(topPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
    }

    public String getInput() {
        return inputField.getText();
    }

    public void setResult(String result) {
        resultLabel.setText("Результат: " + result);
    }

    public void addCalculateListener(ActionListener listener) {
        calcButton.addActionListener(listener);
    }
}
