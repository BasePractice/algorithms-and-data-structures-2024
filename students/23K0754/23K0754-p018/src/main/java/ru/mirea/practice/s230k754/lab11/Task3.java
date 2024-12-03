package ru.mirea.practice.s230k754.lab11;

public final class Task3 {
    private Task3() {}

    public static void main(String[] args) {
        // В данном случае нельзя после вывода Exception event вывести дочерние ошибки
        // Полсе фиксации ошибки класс выводит e.getMessage For input string: "qwrety"
        Exception2.exceptionDemoReplacedForTask3();
    }
}
