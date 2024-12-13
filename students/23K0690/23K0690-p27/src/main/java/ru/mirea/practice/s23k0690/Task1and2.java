package ru.mirea.practice.s23k0690;

public final class Task1and2 {

    private Task1and2() {}

    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.hashtabInit(10);
        hashTable.hashtabAdd("key1", "value1");
        hashTable.hashtabAdd("key2", "value2");
        hashTable.hashtabAdd("key3", "value3");
        hashTable.hashtabAdd("key4", "value4");
        hashTable.hashtabAdd("key5", "value5");
        hashTable.hashtabAdd("key6", "value6");
        hashTable.hashtabAdd("key7", "value7");
        hashTable.hashtabAdd("key8", "value8");
        hashTable.hashtabAdd("key9", "value9");
        hashTable.hashtabAdd("key10", "value10");

        System.out.println("Проверка добавленных элементов:");
        for (int i = 1; i <= 10; i++) {
            String key = "key" + i;
            System.out.println(key + " : " + hashTable.hashtabLookup(key));
        }

        System.out.println("\nУдаление key5...");
        hashTable.hashtabDelete("key5");

        System.out.println("Проверка значения для key5 после удаления: " + hashTable.hashtabLookup("key5")); //должно вернуть null

        System.out.println("Текущий размер хеш-таблицы: " + hashTable.size());
    }
}
