package ru.mirea.practice.s0000001;

public class Main {
    public static void main(String[] args) {
        StringManipulator stringManipulator = new StringManipulatorImpl();

        String testString = "Hello, World!";

        int characterCount = stringManipulator.countCharacters(testString);
        String oddPositionChars = stringManipulator.getOddPositionCharacters(testString);
        String reversedString = stringManipulator.reverseString(testString);

        System.out.println("Количество символов: " + characterCount);
        System.out.println("Символы на нечетных позициях: " + oddPositionChars);
        System.out.println("Инвертированная строка: " + reversedString);
    }
}