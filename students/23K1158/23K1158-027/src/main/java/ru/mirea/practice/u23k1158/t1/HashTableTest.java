package ru.mirea.practice.u23k1158.t1;

public abstract class HashTableTest {
    public static void main(String[] args) {
        // Задание 2: Тестирование созданных функций
        HashTable hashTab = new HashTable();
        hashTab.hashtabInit();
        // Добавление элементов
        for (int i = 1; i <= 10; i++) {
            hashTab.hashtabAdd("key" + i, "value" + i);
        }
        System.out.println("Элементы хеш-таблицы после добавления:");
        hashTab.printHashTable();
        // Задание 3: Поиск и удаление элементов
        String keyToFind = "key5";
        String keyToDelete = "key8";
        System.out.println("\nПоиск элемента с ключом '" + keyToFind + "':");
        String lookupResult = hashTab.hashtabLookup(keyToFind);
        System.out.println("Найдено значение: " + lookupResult);
        System.out.println("\nУдаление элемента с ключом '" + keyToDelete + "':");
        hashTab.hashtabDelete(keyToDelete);
        System.out.println("\nЭлементы хеш-таблицы после удаления:");
        hashTab.printHashTable();
    }
}
