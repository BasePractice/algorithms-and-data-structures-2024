package ru.mirea.practice.s0000001.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Fiona", "Shrekovna", "Computer Science", 2, "CS-202"));
        students.add(new Student("Biba", "Bobov", "Physics", 3, "PH-301"));
        students.add(new Student("Boba", "Bibov", "Mathematics", 1, "MA-101"));
        students.add(new Student("Lupa", "Pupov", "Chemistry", 4, "CH-401"));
        students.add(new Student("Pupa", "Lupov", "Biology", 2, "BI-202"));

        Collections.sort(students, Student.compareByLastName());

        System.out.println("Сортировка по фамилии:");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students, Student.compareByYear());

        System.out.println("\nСортировка по курсу:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

