package ru.mirea.practice.s23k0116.task5;

public abstract class TestStringManipulator {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();

        String testString = "Want_to_be_kind";

        int count = manipulator.countCharacters(testString);
        System.out.println("Количество символов в строке: " + count);

        StringBuilder oddChars = new StringBuilder(manipulator.oddPositions(testString));
        System.out.println("Символы на нечётных индексах: " + oddChars);

        String reversed = manipulator.reverseString(testString);
        System.out.println("Инвертированная строка: " + reversed);
    }
}
