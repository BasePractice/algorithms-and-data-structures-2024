package ru.mirea.practice.s00000022.task2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class SimpleCalculatorView extends JFrame {
    private JTextField display;
    private JButton[] buttons;
    private JButton clearButton;
    private JButton equalsButton;

    public SimpleCalculatorView() {
        display = new JTextField();
        buttons = new JButton[16];
        clearButton = new JButton("C");
        equalsButton = new JButton("=");

        String[] labels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        setLayout(new BorderLayout());
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(4, 4));
        for (int i = 0; i < 16; i++) {
            buttons[i] = new JButton(labels[i]);
            panel.add(buttons[i]);
        }
        add(panel, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(clearButton);
        bottomPanel.add(equalsButton);
        add(bottomPanel, BorderLayout.SOUTH);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void setListener(CalculatorListener listener) {
        for (JButton button : buttons) {
            button.addActionListener(e -> listener.onButtonClicked(e.getActionCommand()));
        }
        clearButton.addActionListener(e -> listener.onClearClicked());
        equalsButton.addActionListener(e -> listener.onEqualsClicked());
    }

    public void setDisplay(String text) {
        display.setText(text);
    }

    public String getDisplay() {
        return display.getText();
    }
}
