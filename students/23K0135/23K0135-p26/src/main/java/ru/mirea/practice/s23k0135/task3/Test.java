package ru.mirea.practice.s23k0135.task3;

public abstract class Test {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>(10);
        list.add("Заяц");
        list.add("Волк");
        list.add("Лиса");

        System.out.println("Перебор элементов с помощью итератора:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
