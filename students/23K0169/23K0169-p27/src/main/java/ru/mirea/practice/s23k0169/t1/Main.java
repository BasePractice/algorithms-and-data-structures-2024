package ru.mirea.practice.s23k0169.t1;

public abstract class Main {
    public static void main(String[] args) {
        HashTab hashtable = new HashTab();
        hashtable.hashtabInit();

        hashtable.hashtabAdd("Example1", "type1");
        hashtable.hashtabAdd("Example2", "type2");
        hashtable.hashtabAdd("Example3", "type1");

        System.out.println("Поиск 'Example1': " + hashtable.hashtabLookup("Example1"));
        System.out.println("Поиск 'Example2': " + hashtable.hashtabLookup("Example2"));
        System.out.println("Поиск 'Example3': " + hashtable.hashtabLookup("Example3"));

        hashtable.printTable();

        hashtable.hashtabDelete("Example1");
        System.out.println("После удаления 'Example1':");
        hashtable.printTable();
    }
}
