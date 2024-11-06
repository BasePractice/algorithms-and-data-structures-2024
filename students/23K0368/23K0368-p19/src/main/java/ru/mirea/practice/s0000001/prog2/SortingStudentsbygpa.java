package ru.mirea.practice.s0000001.prog2;

import java.util.ArrayList;
import java.util.List;

public abstract class SortingStudentsbygpa {
    public static <T extends Comparable<T>> List<T> qsort(List<T> students) {
        if (students.size() <= 1) {
            return students;
        }

        T pivot = students.get(0);  // Опорный элемент
        List<T> less = new ArrayList<>();
        List<T> greater = new ArrayList<>();

        // Разделение элементов на две группы
        for (int i = 1; i < students.size(); i++) {
            if (students.get(i).compareTo(pivot) < 0) {
                less.add(students.get(i));
            } else {
                greater.add(students.get(i));
            }
        }

        // Рекурсивная сортировка подсписков и объединение результатов
        List<T> result = new ArrayList<>(qsort(less));
        result.add(pivot);
        result.addAll(qsort(greater));

        return result;
    }
}
