package ru.mirea.practice.s0000001.num1;

import java.util.List;
import java.util.ArrayList;

public final class Main { // Сделаем класс final
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();

        list1.add(new Student("Misha", 85));
        list1.add(new Student("Dasha", 90));

        list2.add(new Student("Ivan", 78));
        list2.add(new Student("Olga", 92));

        list1.addAll(list2);

        list1.sort((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()));

        for (Student s : list1) {
            System.out.println(s.name + ": " + s.score);
        }
    }

    private Main() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }
}
