package ru.mirea.practice.s23k0155;

public class Student {
    private int iDNumber;
    private String name;

    public Student(int idNumber, String name) {
        this.iDNumber = idNumber;
        this.name = name;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    @Override
    public String toString() {
        return "Student" + "id = " + iDNumber
                + ", name: " + name;
    }
}
