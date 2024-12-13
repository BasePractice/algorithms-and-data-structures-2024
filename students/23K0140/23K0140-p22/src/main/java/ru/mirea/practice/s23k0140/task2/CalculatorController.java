package ru.mirea.practice.s23k0140.task2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorView view;
    private CalculatorModel model;

    public CalculatorController(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;

        this.view.addButtonListener(new ButtonClickListener());
    }

    class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if ("=".equals(command)) {
                String input = view.getInput().trim();
                if (input.isEmpty()) {
                    view.setResult("Ошибка: пустой ввод.");
                    return;
                }
                try {
                    double result = model.evaluateRpn(input);
                    view.addToHistory(input);
                    view.setResult("Результат: " + result);
                    view.clearInput();
                } catch (Exception ex) {
                    view.setResult("Ошибка: " + ex.getMessage());
                }
            } else {
                String currentInput = view.getInput();
                view.setInput(currentInput + (currentInput.isEmpty() ? "" : " ") + command);
            }
        }
    }
}