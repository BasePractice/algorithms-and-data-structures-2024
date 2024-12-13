package ru.mirea.practice.s230k754.lab11.task2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import java.util.Stack;

public final class Calculator extends JFrame implements ActionListener {
    private JTextField display;
    private String currentInput = "";

    private Calculator() {
        setTitle("MyCalculator");
        setSize(250, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(4, 4));

        String[] buttons = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "+", "="};

        for (String button : buttons) {
            JButton button1 = new JButton(button);
            button1.addActionListener(this);
            panel.add(button1);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public double algo(String expression) {
        String[] str = expression.split("");
        Stack<Double> stack = new Stack<>();

        for (String t1 : str) {
            try {
                double num = Double.parseDouble(t1);
                stack.push(num);
            } catch (NumberFormatException e) {
                switch (t1) {
                    case "+":
                        stack.push(stack.pop() + stack.pop());
                        break;
                    case "-": {
                        double operand2 = stack.pop();
                        double operand1 = stack.pop();
                        stack.push(operand1 - operand2);
                        break;
                    }
                    case "*":
                        stack.push(stack.pop() * stack.pop());
                        break;
                    case "/": {
                        double operand2 = stack.pop();
                        double operand1 = stack.pop();
                        if (operand2 == 0) {
                            System.out.println("Деление на 0");
                            System.exit(1);
                        }
                        stack.push(operand1 / operand2);
                        break;
                    }
                    default:
                        System.out.println("Неизвестная операция");
                        System.exit(1);
                        break;
                }
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Некорректное выражение");
        }

        return stack.pop();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (Objects.equals(command, "=")) {
            try {
                double result = algo(currentInput);
                display.setText(String.valueOf(result));
                currentInput = "";
            } catch (Exception ex) {
                display.setText("Ошибка");
                currentInput = "";
            }
        } else {
            currentInput += command;
            display.setText(currentInput);
        }
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Calculator().setVisible(true));
    }
}
