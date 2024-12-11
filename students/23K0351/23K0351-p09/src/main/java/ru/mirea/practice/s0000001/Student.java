package ru.mirea.practice.s0000001;

public class Student {
    int idNumber;
    String name;

    public Student(int idNumber, String name) {
        this.idNumber = idNumber;
        this.name = name;
    }

    public int getidNumber() {
        return idNumber;
    }

    @Override
    public String toString() {
        return "Student{" + "iDNumber=" + idNumber + ", name='" + name + '\'' + '}';
    }



}
