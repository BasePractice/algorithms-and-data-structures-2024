package ru.mirea.practice.s23f0011.task3;

public abstract class Tester {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>(10);
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("Перебор элементов с помощью итератора:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
