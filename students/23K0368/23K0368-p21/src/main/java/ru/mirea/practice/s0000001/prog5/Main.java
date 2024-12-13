package ru.mirea.practice.s0000001.prog5;

import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class Main {
    public static void main(String[] args) {
        List<Integer> list = Solution.newArrayList(1, 2, 3, 4);
        System.out.println("Integer elements(ArrayList)" + list);

        Set<String> set = Solution.newHashSet("T90", "T80", "T54", "T72Б3");
        System.out.println("String elements(HashSet)" + set);

        Map<String, Integer> map = Solution.newHashMap(
                new Pair<>("T90", 90),
                new Pair<>("T80", 80),
                new Pair<>("T54", 54),
                new Pair<>("T72Б3", 72)
        );
        System.out.println("Map<String, Integer>" + map);
    }
}
