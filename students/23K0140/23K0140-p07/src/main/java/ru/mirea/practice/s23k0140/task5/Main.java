package ru.mirea.practice.s23k0140.task5;

public abstract class Main {
    public static void main(String[] args) {
        StringChanging manipulator = new StringChanging();

        String testString = "Hello World!";

        int count = manipulator.countCharacters(testString);
        System.out.println("Количество символов в строке: " + count);

        StringBuilder oddChars = new StringBuilder(manipulator.oddPositions(testString));
        System.out.println("Символы на нечётных индексах: " + oddChars);

        String reversed = manipulator.reverseString(testString);
        System.out.println("Инвертированная строка: " + reversed);
    }
}