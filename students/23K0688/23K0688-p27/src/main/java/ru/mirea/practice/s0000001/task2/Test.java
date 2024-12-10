package ru.mirea.practice.s0000001.task2;

public abstract class Test {
    public static void main(String[] args) {
        Hashtab hashtab = new Hashtab();
        hashtab.hashtabInit(10);
        hashtab.hashtabAdd("gnome", "short");
        hashtab.hashtabAdd("human", "normal");
        hashtab.hashtabAdd("giant", "big");
        hashtab.hashtabAdd("horse", "animal");
        hashtab.hashtabAdd("dog", "pet");
        hashtab.hashtabAdd("cat", "pet");
        hashtab.hashtabAdd("fish", "food");
        hashtab.hashtabAdd("apple", "fruit");
        hashtab.hashtabAdd("cucumber", "vegetable");
        hashtab.hashtabAdd("salt", "spice");
        System.out.println("gnome: " + hashtab.hashtabLookup("gnome"));
        System.out.println("human: " + hashtab.hashtabLookup("human"));
        System.out.println("cat: " + hashtab.hashtabLookup("cat"));
        System.out.println("dog: " + hashtab.hashtabLookup("dog"));
        hashtab.hashtabDelete("gnome");
        System.out.println("gnome: " + hashtab.hashtabLookup("gnome"));
        System.out.println("human: " + hashtab.hashtabLookup("human"));
    }
}
