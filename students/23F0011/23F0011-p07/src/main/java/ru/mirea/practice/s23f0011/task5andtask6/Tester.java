package ru.mirea.practice.s23f0011.task5andtask6;

public abstract class Tester {
    public static void main(String[] args) {
        StringProcessorable processor = new ProcessStrings();
        String text = "Hello Java!";
        System.out.println("Количество символов в строке: " + processor.countCharacters(text));
        System.out.println("Символы на нечетных позициях: " + processor.oddPositions(text));
        System.out.println("Инвертированная строка: " + processor.reverse(text));
    }
}
