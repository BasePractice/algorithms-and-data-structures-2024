package ru.mirea.practice.s23k0135.task2;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.BorderLayout;

class CalculatorView extends JPanel {
    CalculatorModel model;
    private JTextField display;

    public CalculatorView(CalculatorModel model) {
        this.model = model;
        setLayout(new BorderLayout());

        display = new JTextField(model.getExpression());
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(5, 4));
        String[] buttons = {"C", ".", "BackSpace", "/", "7", "8", "9", "*", "4", "5", "6", "-", "1", "2", "3", "+", "(", "0", ")", "="};

        for (String buttonLabel : buttons) {
            JButton button = new JButton(buttonLabel);
            button.addActionListener(e -> {
                String command = e.getActionCommand();
                if (command.matches("\\d+")) {
                    model.appendDigit(command);
                } else if (command.matches("[+\\-*/()]")) {
                    model.appendOperator(command);
                } else if ("C".equals(command)) {
                    model.clear();
                } else if ("BackSpace".equals(command)) {
                    if (!model.getExpression().isEmpty()) {
                        model.expression = model.getExpression().substring(0, model.getExpression().length() - 1);
                    }
                } else if ("=".equals(command)) {
                    model.calculate();
                }
                display.setText(model.getExpression().isEmpty() ? ""
                    : model.getExpression().endsWith("=") ? String.valueOf(model.getResult())
                    : model.getExpression());
            });
            buttonPanel.add(button);
        }
        add(buttonPanel, BorderLayout.CENTER);
    }

    public JPanel getPanel() {
        return this;
    }
}
