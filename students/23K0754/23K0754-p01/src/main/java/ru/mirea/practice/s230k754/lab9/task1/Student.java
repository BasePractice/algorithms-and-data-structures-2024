package ru.mirea.practice.s230k754.lab9.task1;

import org.jetbrains.annotations.NotNull;

public class Student implements Comparable<Student> {
    private int idNumber;
    private String name;

    public Student(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }

    @Override
    public int compareTo(@NotNull Student other) {
        return Integer.compare(this.idNumber, other.idNumber);
    }

    @Override
    public String toString() {
        return "Student: idNumber=" + idNumber + ", name=" + name;
    }

    public int getIdNumber() {
        return idNumber;
    }
}
