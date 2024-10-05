package ru.mirea.practice.s23L0908.prog5;

public interface StringProcessor {
    // Функция для подсчета символов в строке
    int countSymbols(String s);

    // Функция для получения строки из символов на нечетных позициях
    String getOddSymbols(String s);

    // Функция для инвертирования строки
    String reverseString(String s);
}
