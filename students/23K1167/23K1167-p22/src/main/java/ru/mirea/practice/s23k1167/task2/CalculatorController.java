package ru.mirea.practice.s23k1167.task2;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private final CalculatorModel model; // Instance variable
    private final CalculatorView view; // Instance variable

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;

        this.view.addCalculateListener(new CalculateListener());
        this.view.addNumberButtonListener(new NumberButtonListener());
        this.view.addOperationButtonListener(new OperationButtonListener());
    }

    private class CalculateListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String input = view.getInput();
            try {
                double result = model.evaluate(input);
                view.setResult("Результат: " + result);
            } catch (Exception ex) {
                view.setResult("Ошибка: " + ex.getMessage());
            }
        }
    }

    private class NumberButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            view.setInput(view.getInput() + source.getText());
        }
    }

    private class OperationButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            String operation = source.getText();
            if ("C".equals(operation)) {
                view.setInput("");
            } else {
                view.setInput(view.getInput() + " " + operation + " ");
            }
        }
    }
}
