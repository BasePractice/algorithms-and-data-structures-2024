package ru.mirea.practice.s25k0112;

import java.util.ArrayList;
import java.util.List;

public final class GpaSorting {
    private GpaSorting() {

    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20, 3.5));
        students.add(new Student("Bob", 10, 3.8));
        students.add(new Student("Charlie",103,  2.9));

        SortingStudentsByGpa sorter = new SortingStudentsByGpa();
        sorter.quickSort(students, 0, students.size() - 1);

        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getGpa());
        }
    }
}
