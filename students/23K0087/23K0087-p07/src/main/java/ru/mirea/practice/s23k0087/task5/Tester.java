package ru.mirea.practice.s23k0087.task5;

public abstract class Tester {
    public static void main(String[] args) {
        StringProcessor processor = new StringProcessor();

        String testString = "Hand it over, that thing. Your dark soul";

        int count = processor.countCharacters(testString);
        System.out.println("Количество символов в строке: " + count);

        System.out.println("Символы на нечётных индексах: " + processor.oddPositions(testString));

        String reversed = processor.reverseString(testString);
        System.out.println("Инвертированная строка: " + reversed);
    }
}
