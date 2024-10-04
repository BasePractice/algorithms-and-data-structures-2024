package ru.mirea.practice.s0000001.task3;

import java.util.Arrays;

class ComparableStudent implements Comparable<ComparableStudent> {
    private int idNumber;
    private String name;

    public ComparableStudent(int idNumber, String name) {
        this.idNumber = idNumber;
        this.name = name;
    }

    @Override
    public int compareTo(ComparableStudent other) {
        return Integer.compare(this.idNumber, other.idNumber);
    }

    @Override
    public String toString() {
        return "ComparableStudent{idNumber=" + idNumber + ", name='" + name + "'}";
    }
}

class ComparableStudentTest {
    public static void main(String[] args) {
        ComparableStudent[] students = {
                new ComparableStudent(3, "Alice"),
                new ComparableStudent(1, "Bob"),
                new ComparableStudent(2, "Charlie")
        };

        Arrays.sort(students);

        System.out.println("Отсортированные студенты по ID:");
        System.out.println(Arrays.toString(students));
    }
}