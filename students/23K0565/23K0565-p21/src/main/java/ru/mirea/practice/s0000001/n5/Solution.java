package ru.mirea.practice.s0000001.n5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class Solution {
    private Solution() {
    }

    public static <T> List<T> newArrayList(T... items) {
        List<T> list = new ArrayList<>();
        for (T item : items) {
            list.add(item);
        }
        return list;
    }

    public static <T> Set<T> newHashSet(T... items) {
        Set<T> set = new HashSet<>();
        for (T item : items) {
            set.add(item);
        }
        return set;
    }

    public static <K, V> Map<K, V> newHashMap(K[] keys, V[] values) {
        if (keys.length != values.length) {
            throw new RuntimeException("Ключи и значения имеют разный размер:(");
        }
        Map<K, V> map = new HashMap<>();
        for (int i = 0; i < keys.length; i++) {
            map.put(keys[i], values[i]);
        }
        return map;
    }
}
