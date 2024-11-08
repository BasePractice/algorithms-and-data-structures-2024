package ru.mirea.practice.s0000001.task1;

import javax.swing.SwingUtilities;

public final class CalculatorApp {
    private CalculatorApp() {
        // Приватный конструктор предотвращает создание экземпляра
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculatorGui calculator = new CalculatorGui();
            calculator.createAndShowGui();
        });
    }
}
