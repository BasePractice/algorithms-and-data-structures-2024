package ru.mirea.practice.s0000001.task5;

import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class Main {
    public static void main(String[] args) {
        List<Integer> list = Solution.newArrayList(1, 2, 3, 4, 5);
        System.out.println("ArrayList: " + list);

        Set<String> set = Solution.newHashSet("a", "b", "c");
        System.out.println("HashSet: " + set);

        Map<String, Integer> map = Solution.newHashMap("key1", 100);
        System.out.println("HashMap: " + map);
    }
}
