package ru.mirea.practice.s23k0120.task10;

public abstract class Main {
    public static void main(String[] args) {
        OneLinkedList<String> listStr = new OneLinkedList<String>();

        listStr.addOrdered("Иванов Алексей");
        listStr.addOrdered("Смирнова Ольга");
        listStr.addOrdered("Борисова Марина");
        listStr.addOrdered("Петров Владимир");
        listStr.addOrdered("Кузнецова Анна");
        listStr.addOrdered("Соколов Дмитрий");
        listStr.addOrdered("Александров Игорь");
        System.out.println(listStr);
    }
}
