package ru.mirea.practice.s230k754.lab9.task1;

import java.util.Arrays;

public final class Task1 {
    private Task1() {}

    public static void main(String[] args) {
        Student[] students = {
            new Student("name3", 3),
            new Student("name2", 1),
            new Student("name1", 2)
        };

        System.out.println(students[0].compareTo(students[2]));

        System.out.println("Студенты до сортироваки");
        for (Student obj: students) {
            System.out.println(obj.toString());
        }

        Arrays.sort(students);

        System.out.println("Студенты после сортироваки");
        for (Student obj: students) {
            System.out.println(obj.toString());
        }
    }
}
