package ru.mirea.practice.s23f0011.task2;

public abstract class Tester {
    public static void main(String[] args) {
        Integer[] array = {10, 20, 30, 40, 50};
        MyListIterator<Integer> iterator = new MyListIterator<>(array);

        System.out.println("Перебор элементов с помощью итератора:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
