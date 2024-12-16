package ru.mirea.practice.s0000001.task2;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    public CalculatorController(CalculatorModel model, CalculatorView view) {
        view.addButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton source = (JButton) e.getSource();
                String buttonText = source.getText();

                if ("=".equals(buttonText)) {
                    String expression = view.getDisplayText();
                    String result = model.calculate(expression);
                    view.setDisplayText(result);
                } else {
                    view.setDisplayText(view.getDisplayText() + buttonText + " ");
                }
            }
        });
    }
}
