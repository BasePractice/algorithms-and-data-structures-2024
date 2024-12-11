package ru.mirea.practice.s23k0143;

public abstract class TestCustomList {
    public static void main(String[] args) {
        CustomList<String> list = new CustomList<>();
        list.add("Первый");
        list.add("Второй");
        list.add("Третий");

        System.out.println("Элементы списка:");
        for (String item : list) {
            System.out.println(item);
        }
    }
}
