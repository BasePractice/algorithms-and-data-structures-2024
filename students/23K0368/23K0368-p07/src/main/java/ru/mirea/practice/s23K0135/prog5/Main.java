package ru.mirea.practice.s23K0135.prog5;

public abstract class Main {
    public static void main(String[] args) {
        StringProcessor processor = new StringProcessorRealize();
        String text = "Hello, world!";

        // Подсчет  символов
        int count = processor.countSymbols(text);
        System.out.println("Количество символов: " + count);

        //  Получение  нечетных  символов
        String oddSymbols = processor.getOddSymbols(text);
        System.out.println("Символы на нечетных позициях: " + oddSymbols);

        //  Инвертирование  строки
        String reversedText = processor.reverseString(text);
        System.out.println("Инвертированная строка: " + reversedText);
    }
}
