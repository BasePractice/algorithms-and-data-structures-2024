package ru.mirea.practice.s23k0087.task2;

public final class Main {

    private Main() {

    }

    public static void main(String[] args) {

        Triple<String, Integer, Double> triple = new Triple<>("Пример", 100, 99.99);

        System.out.println("Первый элемент: " + triple.getFirst());
        System.out.println("Второй элемент: " + triple.getSecond());
        System.out.println("Третий элемент: " + triple.getThird());

        triple.printClassNames();
    }
}

