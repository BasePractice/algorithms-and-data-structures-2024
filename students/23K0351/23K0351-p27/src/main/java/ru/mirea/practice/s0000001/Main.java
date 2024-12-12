package ru.mirea.practice.s0000001;




public abstract class Main {
    public static void main(String[] args) {
        HashTab hashTab = new HashTab();
        hashTab.hashtabInit(10);


        hashTab.hashtabAdd("ключ1", "значение1");
        hashTab.hashtabAdd("ключ2", "значение2");
        hashTab.hashtabAdd("ключ3", "значение3");
        hashTab.hashtabAdd("ключ4", "значение4");
        hashTab.hashtabAdd("ключ5", "значение5");
        hashTab.hashtabAdd("ключ6", "значение6");
        hashTab.hashtabAdd("ключ7", "значение7");
        hashTab.hashtabAdd("ключ8", "значение8");
        hashTab.hashtabAdd("ключ9", "значение9");
        hashTab.hashtabAdd("ключ10", "значение10");


        System.out.println("Поиск ключа 'ключ5': " + hashTab.hashtabLookup("ключ5"));
        System.out.println("Поиск ключа 'ключ11': " + hashTab.hashtabLookup("ключ11"));


        hashTab.hashtabDelete("ключ3");
        System.out.println("После удаления ключа 'ключ3':");
        hashTab.display();
    }
}
