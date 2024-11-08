package ru.mirea.practice.s0000001.task1;

public final class Main {
    private Main() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }

    public static void main(String[] args) {
        ItemList itemList = new ItemList();

        itemList.addItem(new Item("Item1", 1));
        itemList.addItem(new Item("Item2", 2));
        itemList.addItem(new Item("Item3", 3));

        System.out.println("Вывод элементов списка:");
        itemList.displayItems();

        System.out.println("Список пуст? " + itemList.isEmpty());

        itemList.removeItem(2);

        System.out.println("\nОбновленный список:");
        itemList.displayItems();

        itemList.clearList();
        System.out.println("\nПосле очистки:");
        itemList.displayItems();

        itemList.addItem(new Item("Item4", 4));
        itemList.writeToFile("itemList.txt");

        ItemList newItemList = new ItemList();
        newItemList.readFromFile("itemList.txt");

        System.out.println("\nЗагруженный список:");
        newItemList.displayItems();
    }
}
