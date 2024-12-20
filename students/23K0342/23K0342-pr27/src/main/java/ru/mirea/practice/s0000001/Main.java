package ru.mirea.practice.s0000001;

public abstract class Main {
    public static void main(String[] args) {
        HashTab hashtable = new HashTab();
        hashtable.hashtabInit();

        hashtable.hashtabAdd("апельсин", "фрукты");
        hashtable.hashtabAdd("огурец", "овощи");
        hashtable.hashtabAdd("мандарин", "фрукты");

        System.out.println("Поиск 'апельсин': " + hashtable.hashtabLookup("апельсин"));
        System.out.println("Поиск 'огурец': " + hashtable.hashtabLookup("огурец"));
        System.out.println("Поиск 'мандарин': " + hashtable.hashtabLookup("мандарин"));

        hashtable.printTable();

        hashtable.hashtabDelete("огурец");
        System.out.println("После удаления 'огурец':");
        hashtable.printTable();
    }
}
//

