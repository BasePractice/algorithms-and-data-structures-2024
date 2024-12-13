package ru.mirea.practice.s23k0169.t2;

public abstract class Main {
    public static void main(String[] args) {
        HashTab hashtable = new HashTab();
        hashtable.hashtabInit();

        hashtable.hashtabAdd("Example1", "type1");
        hashtable.hashtabAdd("Example2", "type2");
        hashtable.hashtabAdd("Example3", "type3");
        hashtable.hashtabAdd("Example4", "type1");
        hashtable.hashtabAdd("Example5", "type5");
        hashtable.hashtabAdd("Example6", "type2");
        hashtable.hashtabAdd("Example7", "type2");
        hashtable.hashtabAdd("Example8", "type4");
        hashtable.hashtabAdd("Example9", "type3");
        hashtable.hashtabAdd("Example10", "type5");

        System.out.println("Содержимое хеш-таблицы после добавления 10 элементов:");
        hashtable.printTable();

        System.out.println("\nПоиск элементов:");
        System.out.println("Поиск 'Example1': " + hashtable.hashtabLookup("Example1"));
        System.out.println("Поиск 'Example4': " + hashtable.hashtabLookup("Example4"));
        System.out.println("Поиск 'Example3': " + hashtable.hashtabLookup("Example3"));
        System.out.println("Поиск 'Example6': " + hashtable.hashtabLookup("морковь"));
        System.out.println("Поиск 'nonexistent': " + hashtable.hashtabLookup("nonexistent"));

        hashtable.hashtabDelete("Example1");
        hashtable.hashtabDelete("Example4");
        hashtable.hashtabDelete("Example3");

        System.out.println("\nСодержимое хеш-таблицы после удаления 'Example1', 'Example4', и 'Example3':");
        hashtable.printTable();
    }
}
