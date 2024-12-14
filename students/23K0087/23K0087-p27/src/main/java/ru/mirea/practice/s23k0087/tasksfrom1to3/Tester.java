package ru.mirea.practice.s23k0087.tasksfrom1to3;

public abstract class Tester {
    public static void main(String[] args) {
        Hashtab hashtab = new Hashtab(10);
        hashtab.add("key 0", "value 0");
        hashtab.add("key 1", "value 1");
        hashtab.add("key 2", "value 2");
        hashtab.add("key 3", "value 3");
        hashtab.add("key 4", "value 4");
        hashtab.add("key 5", "value 5");
        hashtab.add("key 6", "value 6");
        hashtab.add("key 7", "value 7");
        hashtab.add("key 8", "value 8");
        hashtab.add("key 9", "value 9");
        System.out.println("Hashmap:");
        hashtab.printTable();
        String value = hashtab.lookup("key 2");
        System.out.println("Looking for key 2... " + (value != null ? "Bingo! the value is: " + value : "not found"));
        hashtab.delete("key 2");
        hashtab.printTable();
        value = hashtab.lookup("key 2");
        System.out.println("Looking for key 2... " + (value != null ? "Bingo! the value is: " + value : "not found"));
    }
}
