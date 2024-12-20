package ru.mirea.practice.s0000001.task2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame {
    private final JTextField display = new JTextField();

    public CalculatorView() {
        setTitle("Калькулятор");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        String[] buttons = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"};
        for (String text : buttons) {
            JButton button = new JButton(text);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    public String getDisplayText() {
        return display.getText();
    }

    public void setDisplayText(String text) {
        display.setText(text);
    }

    public void addButtonListener(ActionListener listener) {
        for (Component component : ((JPanel) getContentPane().getComponent(1)).getComponents()) {
            if (component instanceof JButton) {
                ((JButton) component).addActionListener(listener);
            }
        }
    }
}
