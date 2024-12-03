package ru.mirea.practice.s0000001;

import java.util.ArrayList;
import java.util.List;

public abstract class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", "Smith", "Computer Science", 2, "CS-21"));
        students.add(new Student("Bob", "Johnson", "Mathematics", 1, "MATH-20"));
        students.add(new Student("Charlie", "Williams", "Physics", 3, "PHYS-19"));

        for (Student student : students) {
            System.out.println(student);
        }
    }
}