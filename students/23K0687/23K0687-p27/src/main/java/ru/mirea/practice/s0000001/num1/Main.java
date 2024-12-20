package ru.mirea.practice.s0000001.num1;

import java.util.HashMap;
import java.util.Map;

public final class Main {
    private Main() {
        throw new UnsupportedOperationException("Этот класс не предназначен для создания экземпляров");
    }

    public static void main(String[] args) {
        Map<String, String> dict = new HashMap<>();

        dict.put("key1", "value1");
        dict.put("key2", "value2");
        dict.put("key3", "value3");
        dict.put("key4", "value4");
        dict.put("key5", "value5");
        dict.put("key6", "value6");
        dict.put("key7", "value7");
        dict.put("key8", "value8");
        dict.put("key9", "value9");
        dict.put("key10", "value10");

        System.out.println("Размер словаря: " + dict.size());

        for (Map.Entry<String, String> entry : dict.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + ", Значение: " + entry.getValue());
        }

        String key = "key5";
        if (dict.containsKey(key)) {
            System.out.println("Значение для " + key + ": " + dict.get(key));
        } else {
            System.out.println("Ключ " + key + " не найден в словаре.");
        }

        dict.remove("key10");
        System.out.println("После удаления key10:");
        for (Map.Entry<String, String> entry : dict.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + ", Значение: " + entry.getValue());
        }
    }
}
