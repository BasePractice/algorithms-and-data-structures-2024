package ru.mirea.practice.s23k0116.task1;

public abstract class Main {
    public static void main(String[] args) {
        // Пример использования с разными типами данных
        Trio<String, Integer, Double> trio = new Trio<>("Hello", 42, 3.14);

        System.out.println(trio); // Выводит: Trio{first=Hello, second=42, third=3.14}

        System.out.println(trio); // Выводит тип данных

        // Доступ к отдельным значениям
        System.out.println("First: " + trio.getFirst()); // Hello
        System.out.println("Second: " + trio.getSecond()); // 42
        System.out.println("Third: " + trio.getThird()); // 3.14
    }
}
