package ru.mirea.practice.s0000001;

public class program5 {
    public static void main(String[] args) {
        // Проверка, если аргументы переданы
        if (args.length > 0) {
            System.out.println("Аргументы командной строки:");

            // Цикл for для вывода каждого аргумента
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("Аргументы командной строки отсутствуют.");
        }
    }
}