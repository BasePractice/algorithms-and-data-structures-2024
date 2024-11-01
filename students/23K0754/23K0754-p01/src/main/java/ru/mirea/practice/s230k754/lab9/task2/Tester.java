package ru.mirea.practice.s230k754.lab9.task2;

import ru.mirea.practice.s230k754.lab9.task1.Student;
import java.util.Arrays;

public final class Tester {
    private Tester() {}

    public static void main(String[] args) {
        Student[] students = {
            new Student("name3", 3),
            new Student("name1", 1),
            new Student("name2", 2)
        };

        Arrays.sort(students, new SortingStudentsByGpa());
        System.out.println(Arrays.toString(students));
    }
}
