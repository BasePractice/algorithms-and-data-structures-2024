package ru.mirea.practice.s23k0164.t1;

import java.util.HashMap;
import java.util.Map;

public final class DictionaryExample {

    private DictionaryExample() {

    }

    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("key1", "value1");
        dictionary.put("key2", "value2");
        dictionary.put("key3", "value3");
        dictionary.put("key4", "value4");
        dictionary.put("key5", "value5");
        dictionary.put("key6", "value6");
        dictionary.put("key7", "value7");
        dictionary.put("key8", "value8");
        dictionary.put("key9", "value9");
        dictionary.put("key10", "value10");
        System.out.println("Содержимое словаря:");
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        String keyToSearch = "key3";
        String value = dictionary.get(keyToSearch);
        System.out.println("Значение для " + keyToSearch + ": " + value);
        String keyToCheck = "key11";
        if (dictionary.containsKey(keyToCheck)) {
            System.out.println("Ключ " + keyToCheck + " присутствует в словаре.");
        } else {
            System.out.println("Ключ " + keyToCheck + " отсутствует в словаре.");
        }
    }
}
