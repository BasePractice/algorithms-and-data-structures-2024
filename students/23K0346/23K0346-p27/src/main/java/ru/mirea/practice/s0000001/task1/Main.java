package ru.mirea.practice.s0000001.task1;

public abstract class Main {
    public static void main(String[] args) {
        HashTab hashtable = new HashTab();
        hashtable.hashtabInit();

        hashtable.hashtabAdd("яблоко", "фрукты");
        hashtable.hashtabAdd("морковка", "овощи");
        hashtable.hashtabAdd("банан", "фрукты");

        System.out.println("Поиск 'яблоко': " + hashtable.hashtabLookup("яблоко"));
        System.out.println("Поиск 'морковка': " + hashtable.hashtabLookup("морковка"));
        System.out.println("Поиск 'банан': " + hashtable.hashtabLookup("банан"));

        hashtable.printTable();

        hashtable.hashtabDelete("морковка");
        System.out.println("После удаления 'морковка':");
        hashtable.printTable();
    }
}

