package ru.mirea.practice.s23k0169.t2;

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
