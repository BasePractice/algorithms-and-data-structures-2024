package ru.mirea.practice.s23k0169.t1;

public class Student {

    private int idNumber;
    private String name;

    public Student(int idNumber, String name) {
        this.idNumber = idNumber;
        this.name = name;
    }

    public int getidNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" + "iDNumber=" + idNumber + ", name=" + name + '}';
    }

}
