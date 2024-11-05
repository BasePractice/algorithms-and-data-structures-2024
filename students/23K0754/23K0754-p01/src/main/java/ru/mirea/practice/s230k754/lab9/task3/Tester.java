package ru.mirea.practice.s230k754.lab9.task3;

import ru.mirea.practice.s230k754.lab9.task1.Student;

public final class Tester {
    private Tester() {}

    public static void main(String[] args) {
        Student[] students1 = {
            new Student("name3", 3),
            new Student("name1", 1),
            new Student("name2", 2)
        };

        Student[] students2 = {
            new Student("name4", 4),
            new Student("name5", 5),
            new Student("name6", 6)
        };

        Student[] mergedStudents = Merge.merge(students1, students2);
        for (Student obj: mergedStudents) {
            System.out.println(obj.toString());
        }
    }
}
