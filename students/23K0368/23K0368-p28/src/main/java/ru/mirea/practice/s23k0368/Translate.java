package ru.mirea.practice.s23k0368;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public abstract class Translate {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<Student>();
        hashSet.add(new Student("Иван", 19));
        hashSet.add(new Student("Олег", 18));
        hashSet.add(new Student("Вадим", 20));

        Comparator<Student> ageComparator = (student1, student2) -> student1.age() - student2.age();

        TreeSet<Student> treeSet = new TreeSet<>(ageComparator);
        treeSet.addAll(hashSet);

        System.out.println("Объект TreeSet с сортировкой по возрасту:" + treeSet);

    }
}
