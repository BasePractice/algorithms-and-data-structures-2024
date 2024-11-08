package ru.mirea.practice.s23k0114.lab1.task2;


public abstract class Main {
    public static void main(String[] args) {
        CircularLinkedList circularList = new CircularLinkedList();
        circularList.append(1);
        circularList.append(2);
        circularList.append(3);

        circularList.display(); // Вывод: 1 2 3

        circularList.delete(2);
        circularList.display(); // Вывод: 1 3
    }
}
