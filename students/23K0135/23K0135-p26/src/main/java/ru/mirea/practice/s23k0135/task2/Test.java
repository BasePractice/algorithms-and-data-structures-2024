package ru.mirea.practice.s23k0135.task2;

public abstract class Test {
    public static void main(String[] args) {
        Integer[] array = {30, 40, 65, 12};
        MyListIterator<Integer> iterator = new MyListIterator<>(array);

        System.out.println("Перебор элементов с помощью итератора:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
