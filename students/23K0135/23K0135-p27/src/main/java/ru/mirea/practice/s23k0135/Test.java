package ru.mirea.practice.s23k0135;

public abstract class Test {
    public static void main(String[] args) {
        HashTable hashtab = new HashTable();
        hashtab.hashtabInit();
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
        System.out.println("Хэш-таблица после добавления элементов:");
        hashtab.printTable();
        System.out.println("\nПоиск по ключу 'banana': " + hashtab.hashtabLookup("banana"));
        System.out.println("Поиск по ключу 'onion': " + hashtab.hashtabLookup("onion"));
        System.out.println("Поиск по ключу 'peach': " + hashtab.hashtabLookup("peach"));
        System.out.println("\nУдаление элемента с ключом 'kiwi'.");
        hashtab.hashtabDelete("kiwi");
        hashtab.printTable();
    }
}
