package ru.mirea.practice.s0000001.task1;

public abstract class Main {
    public static void main(String[] args) {
        String inn = "7707083893"; // Пример ИНН

        try {
            InnValidator.validateInn(inn);
            System.out.println("ИНН действителен");
        } catch (InnValidator.InvalidInnException e) {
            System.err.println(e.getMessage());
        }
    }
}
