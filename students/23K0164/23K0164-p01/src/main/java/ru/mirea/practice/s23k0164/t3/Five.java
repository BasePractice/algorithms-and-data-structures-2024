package ru.mirea.practice.s23k0164.t3;

public final class Five {

    private Five(){

    }
    public static void main(String[] args) {
        StringManipulator stringManipulator = new StringManipulator();

        String testString = "Hello, World!";

        int charCount = stringManipulator.countCharacters(testString);
        System.out.println("Количество символов в строке: " + charCount);

        String oddChars = stringManipulator.getOddPositionCharacters(testString);
        System.out.println("Символы на нечетных позициях: " + oddChars);

        String reversedString = stringManipulator.reverseString(testString);
        System.out.println("Инвертированная строка: " + reversedString);
    }
}
