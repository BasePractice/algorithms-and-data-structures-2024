package ru.mirea.practice.s23k0565.n2;

import java.util.Arrays;

public final class N2test {
    private N2test() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        Student[] students = {
            new Student(3.6),
            new Student(4.0),
            new Student(2.8),
            new Student(3.2),
            new Student(3.9)
        };

        Sorti sorter = new Sorti();
        sorter.quickSort(students, 0, students.length - 1);

        Arrays.stream(students).map(s -> s.getGPa()).forEach(System.out::println);
    }
}