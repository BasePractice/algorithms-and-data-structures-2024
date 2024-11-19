package ru.mirea.practice.s0000001.task2;

public abstract class Main {
    public static void main(String[] args) {
        MyList list = new MyList();

        // Добавляем элементы в список
        list.addItem(new Item("Item 1"));
        list.addItem(new Item("Item 2"));
        list.addItem(new Item("Item 3"));

        // Выводим все элементы списка
        System.out.println("Все элементы списка:");
        list.printAllItems();

        // Выводим элемент по индексу
        System.out.println("\nЭлемент по индексу 1:");
        list.printItem(1);

        // Удаляем элемент из списка
        list.removeItem(new Item("Item 2"));
        System.out.println("\nПосле удаления элемента 'Item 2':");
        list.printAllItems();

        // Проверяем, пуст ли список
        System.out.println("\nСписок пуст? " + list.isEmpty());

        // Очищаем список
        list.clearList();
        System.out.println("\nПосле очистки списка:");
        list.printAllItems();

        // Проверяем, пуст ли список
        System.out.println("\nСписок пуст? " + list.isEmpty());
    }
}
