package ru.mirea.practice.s23L0908.prog2;

import java.util.ArrayList;
import java.util.List;


public abstract class SortingStudentsByGpA {
    public static <T extends Comparable<T>> List<T> qsort(List<T> students) {
        if (students.size() <= 1) {
            return students;
        }
        T tmp = students.get(0);
        List<T> prList = new ArrayList<>();
        List<T> lvList = new ArrayList<>();
        for (int i = 1; i < students.size(); i++) {
            if (students.get(i).compareTo(tmp) <= 0) {
                prList.add(students.get(i));
            }
            if (students.get(i).compareTo(tmp) >= 0) {
                lvList.add(students.get(i));
            }
        }
        List<T> result = new ArrayList<>();
        result.addAll(qsort(prList));
        result.add(tmp);
        result.addAll(qsort(lvList));
        return result;
    }
}
