package ru.mirea.practice.s23k0755.task2;

import javax.swing.SwingUtilities;

public abstract class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PasswordChecker checker = new PasswordChecker();
            checker.setVisible(true);
        });
    }
}
