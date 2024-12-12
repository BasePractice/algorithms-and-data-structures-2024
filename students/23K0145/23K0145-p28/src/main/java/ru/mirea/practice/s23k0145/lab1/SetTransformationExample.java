package ru.mirea.practice.s23k0145.lab1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public final class SetTransformationExample {

    private SetTransformationExample() {}

    public static Set<String> transformHashSetToTreeSet(Set<String> hashSet) {
        return new TreeSet<>(hashSet);
    }

    public static Set<String> createHashSet() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("яблоко");
        hashSet.add("апельсин");
        hashSet.add("банан");
        hashSet.add("виноград");
        return hashSet;
    }

    public static void main(String[] args) {
        Set<String> hashSet = createHashSet();

        Set<String> treeSet = transformHashSetToTreeSet(hashSet);

        for (String item : treeSet) {
            System.out.println(item);
        }
    }
}
