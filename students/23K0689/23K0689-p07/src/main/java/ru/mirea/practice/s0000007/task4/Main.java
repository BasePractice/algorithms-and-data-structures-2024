package ru.mirea.practice.s0000007.task4;

public final class Main {

    private Main() {

    }

    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();

        String testString = "Hello, World!";

        // Подсчет символов
        int count = manipulator.countCharacters(testString);
        System.out.println("Number of characters: " + count);

        // Получение символов на нечетных позициях
        String oddChars = manipulator.getOddPositionCharacters(testString);
        System.out.println("Characters at odd positions: " + oddChars);

        // Инвертирование строки
        String invertedString = manipulator.invertString(testString);
        System.out.println("Inverted string: " + invertedString);
    }
}
