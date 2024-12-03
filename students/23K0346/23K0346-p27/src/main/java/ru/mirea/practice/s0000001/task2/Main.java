package ru.mirea.practice.s0000001.task2;

public abstract class Main {
    public static void main(String[] args) {
        HashTab hashtable = new HashTab();
        hashtable.hashtabInit();

        hashtable.hashtabAdd("яблоко", "фрукт");
        hashtable.hashtabAdd("морковь", "овощ");
        hashtable.hashtabAdd("банан", "фрукт");
        hashtable.hashtabAdd("виноград", "ягода");
        hashtable.hashtabAdd("картошка", "овощ");
        hashtable.hashtabAdd("помидор", "овощ");
        hashtable.hashtabAdd("клубника", "ягода");
        hashtable.hashtabAdd("огурец", "овощ");
        hashtable.hashtabAdd("черника", "ягода");
        hashtable.hashtabAdd("лук", "овощ");

        System.out.println("Содержимое хеш-таблицы после добавления 10 элементов:");
        hashtable.printTable();

        System.out.println("\nПоиск элементов:");
        System.out.println("Поиск 'яблоко': " + hashtable.hashtabLookup("яблоко"));
        System.out.println("Поиск 'лук': " + hashtable.hashtabLookup("лук"));
        System.out.println("Поиск 'черника': " + hashtable.hashtabLookup("черника"));
        System.out.println("Поиск 'морковь': " + hashtable.hashtabLookup("морковь"));
        System.out.println("Поиск 'nonexistent': " + hashtable.hashtabLookup("nonexistent"));

        hashtable.hashtabDelete("морковь");
        hashtable.hashtabDelete("банан");
        hashtable.hashtabDelete("помидор");

        System.out.println("\nСодержимое хеш-таблицы после удаления 'морковь', 'банан', и 'помидор':");
        hashtable.printTable();
    }
}


