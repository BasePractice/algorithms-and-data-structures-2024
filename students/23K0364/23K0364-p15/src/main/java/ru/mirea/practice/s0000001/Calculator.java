package ru.mirea.practice.s0000001;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    private JTextField input1;
    private JTextField input2;
    private JTextField result;
    private JButton addButton;
    private JButton subtractButton;
    private JButton multiplyButton;
    private JButton divideButton;

    public Calculator() {
        setTitle("Calculator");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        input1 = new JTextField(5);
        input2 = new JTextField(5);
        result = new JTextField(10);
        result.setEditable(false);

        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");

        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);

        JPanel panel = new JPanel();
        panel.add(new JLabel("Num1:"));
        panel.add(input1);
        panel.add(new JLabel("Num2:"));
        panel.add(input2);
        panel.add(addButton);
        panel.add(subtractButton);
        panel.add(multiplyButton);
        panel.add(divideButton);
        panel.add(new JLabel("Result:"));
        panel.add(result);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(input1.getText());
            double num2 = Double.parseDouble(input2.getText());
            double res = 0;

            if (e.getSource().equals(addButton)) {
                res = num1 + num2;
            } else if (e.getSource().equals(subtractButton)) {
                res = num1 - num2;
            } else if (e.getSource().equals(multiplyButton)) {
                res = num1 * num2;
            } else if (e.getSource().equals(divideButton)) {
                res = num1 / num2;
            }

            result.setText(String.valueOf(res));
        } catch (NumberFormatException ex) {
            result.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}

