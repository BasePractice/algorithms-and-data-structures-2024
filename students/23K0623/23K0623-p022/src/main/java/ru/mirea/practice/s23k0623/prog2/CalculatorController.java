package ru.mirea.practice.s23k0623.prog2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Controller
class CalculatorController implements ActionListener {
    private CalculatorView view;
    private CalculatorModel model;

    public CalculatorController(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String expression = view.getInputExpression();
        String result = model.evaluateRpn(expression);
        view.setResult(result);
    }
}
