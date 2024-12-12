package ru.mirea.practice.s23k0145.lab2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RpnCalculatorController {
    private final RpnCalculatorView view;
    private final RpnCalculatorModel model;

    public RpnCalculatorController(RpnCalculatorView view, RpnCalculatorModel model) {
        this.view = view;
        this.model = model;
        this.view.addButtonListener(new ButtonClickListener());
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if ("=".equals(command)) {
                handleCalculation();
            } else {
                appendToInput(command);
            }
        }

        private void handleCalculation() {
            String input = view.getInput().trim();
            if (input.isEmpty()) {
                view.setResult("Ошибка: пустой ввод.");
                return;
            }
            try {
                double result = model.evaluateExpression(input);
                view.updateHistory(input);
                view.setResult("Результат: " + result);
                view.clearInput();
            } catch (Exception ex) {
                view.setResult("Ошибка: " + ex.getMessage());
            }
        }

        private void appendToInput(String command) {
            String currentInput = view.getInput();
            view.setInput(currentInput + (currentInput.isEmpty() ? "" : " ") + command);
        }
    }
}
