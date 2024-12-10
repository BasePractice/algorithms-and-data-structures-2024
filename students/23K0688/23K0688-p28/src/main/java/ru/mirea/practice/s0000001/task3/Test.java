package ru.mirea.practice.s0000001.task3;

public abstract class Test {
    public static void main(String[] args) {
        Hashtab hashtab = new Hashtab();
        hashtab.hashtabInit(10);
        hashtab.hashtabAdd(150.0, "short");
        hashtab.hashtabAdd(180.0, "normal");
        hashtab.hashtabAdd(200.0, "big");
        hashtab.hashtabAdd(1.0, "animal");
        hashtab.hashtabAdd(2.0, "pet");
        hashtab.hashtabAdd(3.0, "pet");
        hashtab.hashtabAdd(4.0, "food");
        hashtab.hashtabAdd(5.0, "fruit");
        hashtab.hashtabAdd(6.0, "vegetable");
        hashtab.hashtabAdd(7.0, "spice");
        System.out.println("150.0: " + hashtab.hashtabLookup(150.0));
        System.out.println("180.0: " + hashtab.hashtabLookup(180.0));
        System.out.println("1.0: " + hashtab.hashtabLookup(1.0));
        System.out.println("2.0: " + hashtab.hashtabLookup(2.0));
        hashtab.hashtabDelete(150.0);
        System.out.println("150.0: " + hashtab.hashtabLookup(150.0));
        System.out.println("180.0: " + hashtab.hashtabLookup(180.0));
    }
}
