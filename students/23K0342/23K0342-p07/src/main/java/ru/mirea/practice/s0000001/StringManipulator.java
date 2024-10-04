package ru.mirea.practice.s0000001;

public interface StringManipulator {

    // Метод для подсчета символов в строке
    int countCharacters(String s);

    // Метод для получения строки с символами на нечетных позициях
    String getOddPositionCharacters(String s);

    // Метод для инвертирования строки
    String reverseString(String s);
}