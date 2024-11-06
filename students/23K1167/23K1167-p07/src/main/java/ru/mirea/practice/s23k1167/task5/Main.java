package ru.mirea.practice.s23k1167.task5;


public abstract class Main {
    public static void main(String[] args) {
        StringProcessor stringProcessor = new StringProcessor();

        String input = "Hello, World!";
        int characterCount = stringProcessor.countCharacters(input);
        System.out.println("Количество символов: " + characterCount);

        String oddIndexedCharacters = stringProcessor.getOddIndexedCharacters(input);
        System.out.println("Символы на нечетных позициях: " + oddIndexedCharacters);

        String reversed = stringProcessor.reverseString(input);
        System.out.println("Перевернутая строка: " + reversed);
    }
}
