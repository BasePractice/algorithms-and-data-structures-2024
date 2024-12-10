package ru.mirea.practice.s23f0011;

public abstract class Tester {
    public static void main(String[] args) {
        HashTable hashtab = new HashTable();
        hashtab.hashtabInit();  // Инициализация хэш-таблицы

        // Задание 2: Добавление 10 элементов
        hashtab.hashtabAdd("apple", "fruit");
        hashtab.hashtabAdd("carrot", "vegetable");
        hashtab.hashtabAdd("banana", "fruit");
        hashtab.hashtabAdd("kiwi", "fruit");
        hashtab.hashtabAdd("tomato", "vegetable");
        hashtab.hashtabAdd("grape", "fruit");
        hashtab.hashtabAdd("onion", "vegetable");
        hashtab.hashtabAdd("pineapple", "fruit");
        hashtab.hashtabAdd("lettuce", "vegetable");
        hashtab.hashtabAdd("mango", "fruit");

        // Печать хэш-таблицы после добавления элементов
        System.out.println("Хэш-таблица после добавления элементов:");
        hashtab.printTable();

        // Задание 3: Поиск элемента по ключу
        System.out.println("\nПоиск по ключу 'banana': " + hashtab.hashtabLookup("banana"));  // Ожидается "fruit"
        System.out.println("Поиск по ключу 'onion': " + hashtab.hashtabLookup("onion"));  // Ожидается "vegetable"
        System.out.println("Поиск по ключу 'peach': " + hashtab.hashtabLookup("peach"));  // Ожидается null (не найдено)

        // Удаление элемента по ключу
        System.out.println("\nУдаление элемента с ключом 'kiwi'.");
        hashtab.hashtabDelete("kiwi");

        // Печать хэш-таблицы после удаления элемента
        hashtab.printTable();
    }
}
