package ru.mirea.practice.pr9;

public class Student {
    private int idNumber;
    private String name;

    public Student(int idNumber, String name) {
        this.idNumber = idNumber;
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{idNumber=" + idNumber + ", name='" + name + "'}";
    }
}
