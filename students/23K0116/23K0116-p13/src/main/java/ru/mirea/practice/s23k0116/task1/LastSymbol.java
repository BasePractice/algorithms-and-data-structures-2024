package ru.mirea.practice.s23k0116.task1;

public class LastSymbol {
    public void printLastSymbol(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("Строка пустая или равна null.");
            return;
        }

        int lastIndex = input.length() - 1;

        char lastChar = input.charAt(lastIndex);

        System.out.println("Последний символ строки: " + lastChar);
    }
}
