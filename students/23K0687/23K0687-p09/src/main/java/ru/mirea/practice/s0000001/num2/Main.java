package ru.mirea.practice.s0000001.num2;

import java.util.List;
import java.util.ArrayList;

public final class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Misha", 85));
        students.add(new Student("Dasha", 90));
        students.add(new Student("Ivan", 78));
        students.add(new Student("Olga", 92));

        QuickSort.quickSort(students, 0, students.size() - 1);

        for (Student s : students) {
            System.out.println(s.name + ": " + s.score);
        }
    }

    private Main() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }
}
