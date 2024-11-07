package ru.mirea.practice.s0000001.task1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGui {
    private JTextArea display;
    private Calculator calculator;

    public CalculatorGui() {
        calculator = new Calculator();
    }

    public void createAndShowGui() {
        final JFrame frame = new JFrame("Calculator");
        display = new JTextArea(2, 20);
        display.setEditable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        String[] buttons = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"};

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.addActionListener(new ButtonClickListener());
            panel.add(button);
        }

        frame.add(display, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        final JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenuItem item = new JMenuItem("Exit");

        item.addActionListener(e -> System.exit(0));
        menu.add(item);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String text = e.getActionCommand();
            String currentText = display.getText();

            if ("=".equals(text)) {
                String[] operands = currentText.split(" ");
                double num1 = Double.parseDouble(operands[0]);
                double num2 = Double.parseDouble(operands[2]);
                double result = 0;

                switch (operands[1]) {
                    case "+":
                        result = calculator.add(num1, num2);
                        break;
                    case "-":
                        result = calculator.subtract(num1, num2);
                        break;
                    case "*":
                        result = calculator.multiply(num1, num2);
                        break;
                    case "/":
                        result = calculator.divide(num1, num2);
                        break;
                    default:
                        display.setText("Invalid operation");
                        return;
                }
                display.setText(String.valueOf(result));
            } else {
                display.append(text);
            }
        }
    }
}
