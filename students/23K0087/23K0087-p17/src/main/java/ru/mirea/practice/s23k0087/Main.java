package ru.mirea.practice.s23k0087;

public abstract class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertSorted("Арбуз");
        list.insertSorted("Бочка");
        list.insertSorted("Вилка");
        list.insertSorted("Граница");
        list.insertSorted("Дыня");

        System.out.println("Отсортированный список строк:");
        list.printList();

        list.clear();
    }
}
