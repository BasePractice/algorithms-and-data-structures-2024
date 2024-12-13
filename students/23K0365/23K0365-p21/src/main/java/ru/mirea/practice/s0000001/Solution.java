package ru.mirea.practice.s0000001;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;

public class Solution<T, K, V> { // Integer, String, Boolean
    public List<T> newList(T... elements) {
        return new ArrayList<>(java.util.Arrays.asList(elements));
    }

    public Set<T> newHS(T... elements) {
        return new HashSet<>(java.util.Arrays.asList(elements));
    }

    public Map<K, V> newHM(K[] keys, V[] values) {
        if (keys.length != values.length) {
            System.exit(0);
        }
        Map<K, V> a = new HashMap<>();
        for (int i = 0; i < keys.length; i++) {
            a.put(keys[i], values[i]);
        }
        return a;
    }

    public static void main(String[] args) {
        Solution<Integer, String, Boolean> me = new Solution<>();
        String[] k = {"0", "wow", "yeah", "etc"};
        Boolean[] v = {true, false, true, true};
        List<Integer> myLst = me.newList(12, 15, 523, 235);
        Set<Integer> urSet = me.newHS(12, 15, 523, 235);
        Map<String, Boolean> ourMap = me.newHM(k, v);
        System.out.println(urSet.contains(124));
        System.out.println(myLst.get(0));
        System.out.println(ourMap.get("wow"));
    }
}

