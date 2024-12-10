package ru.mirea.practice.s23k0116.task;

public abstract class LinkedListTester {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertSorted("яблоко");
        list.insertSorted("банан");
        list.insertSorted("вишня");
        list.insertSorted("груша");
        list.insertSorted("абрикос");

        System.out.println("Отсортированный список строк:");
        list.printList();

        list.clear();
    }
}
