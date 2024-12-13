package ru.mirea.practice.s23k0130.task12;

public abstract class Main {
    public static void main(String[] args) {
        HashTab hashtab = new HashTab(10);
        hashtab.add("key0", "value0");
        hashtab.add("key1", "value1");
        hashtab.add("key2", "value2");
        hashtab.add("key3", "value3");
        hashtab.add("key4", "value4");
        hashtab.add("key5", "value5");
        hashtab.add("key6", "value6");
        hashtab.add("key7", "value7");
        hashtab.add("key8", "value8");
        hashtab.add("key9", "value9");
        System.out.println("Содержимое хеш-таблицы:");
        hashtab.printTable();
        String value = hashtab.lookup("key2");
        System.out.println("Поиск key2: " + (value != null ? value : "not found"));
        hashtab.delete("key2");
        System.out.println("После удаления key2:");
        hashtab.printTable();
        value = hashtab.lookup("key2");
        System.out.println("Поиск key2 после удаления: " + (value != null ? value : "not found"));
    }
}
