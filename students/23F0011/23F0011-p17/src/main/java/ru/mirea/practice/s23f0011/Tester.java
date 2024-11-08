package ru.mirea.practice.s23f0011;

public abstract class Tester {
    public static void main(String[] args) {
        CyclicDoublyLinkedList list = new CyclicDoublyLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.println("Исходный список:");
        list.printList();

        list.removeFirst();

        System.out.println("Список после удаления первого элемента:");
        list.printList();

        CyclicDoublyLinkedList newList = list.excludeAndCreateNew(3);

        System.out.println("Новый список без элемента 3:");
        newList.printList();
    }
}
