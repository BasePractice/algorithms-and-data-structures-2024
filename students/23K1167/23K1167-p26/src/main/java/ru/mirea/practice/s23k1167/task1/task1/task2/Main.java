package ru.mirea.practice.s23k1167.task1.task1.task2;

public abstract class Main {
    public static void main(String[] args) {
        CustomList<String> list = new CustomList<>();
        list.add("Первый");
        list.add("Второй");
        list.add("Третий");

        System.out.println("Элементы списка:");
        for (String element : list) {
            System.out.println(element);
        }
    }
}
