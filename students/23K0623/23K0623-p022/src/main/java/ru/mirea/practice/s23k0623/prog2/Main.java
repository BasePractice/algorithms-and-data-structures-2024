package ru.mirea.practice.s23k0623.prog2;

import javax.swing.*;

public abstract class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(CalculatorView::new);
    }
}
