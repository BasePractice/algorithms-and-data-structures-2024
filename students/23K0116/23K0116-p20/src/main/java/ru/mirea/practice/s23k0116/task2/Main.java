package ru.mirea.practice.s23k0116.task2;

public abstract class Main {
    public static void main(String[] args) {
        // Создаем объект Trio с разными типами данных
        Trio<String, Integer, Double> trio = new Trio<>("Hello", 42, 3.14);

        // Выводим значения переменных
        System.out.println("Первый: " + trio.getFirst());
        System.out.println("Второй: " + trio.getSecond());
        System.out.println("Третий: " + trio.getThird());

        // Выводим имена классов переменных
        trio.printClassNames();
    }
}
