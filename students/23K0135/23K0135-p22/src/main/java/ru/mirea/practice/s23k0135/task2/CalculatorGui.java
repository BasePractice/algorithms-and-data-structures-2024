package ru.mirea.practice.s23k0135.task2;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class CalculatorGui extends JFrame {
    CalculatorModel model;
    CalculatorView view;
    CalculatorController controller;

    public CalculatorGui() {
        model = new CalculatorModel();
        view = new CalculatorView(model);
        controller = new CalculatorController(model, view);

        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(view.getPanel());
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculatorGui());
    }
}
