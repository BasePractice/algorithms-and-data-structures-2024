package ru.mirea.practice.s0000001.prog5;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Solution<T, K, V> {
    public static <T> List<T> newArrayList(T... elements) {
        List<T> list = new ArrayList<>();
        for (T element : elements) {
            list.add(element);
        }
        return list;
    }

    public static <T> Set<T> newHashSet(T... elements) {
        Set<T> set = new HashSet<>();
        for (T element : elements) {
            set.add(element);
        }
        return set;
    }

    public static <K, V> Map<K, V> newHashMap(Pair<K,V>... entries) {
        Map<K, V> map = new HashMap<>();
        for (Pair<K,V> entry : entries) {
            map.put(entry.getK(), entry.getV());
        }
        return map;
    }

}
