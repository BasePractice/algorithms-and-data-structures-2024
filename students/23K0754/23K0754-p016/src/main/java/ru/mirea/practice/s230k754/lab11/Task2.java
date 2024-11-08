package ru.mirea.practice.s230k754.lab11;

import javax.swing.SwingUtilities;

public final class Task2 {
    private Task2() {}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MouseEvents().setVisible(true));
    }
}
