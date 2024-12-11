package ru.mirea.practice.s23k0087.task1;

public class Student {
    private String name;
    private int idnumber;

    public Student(String name, int idnumber) {
        this.name = name;
        this.idnumber = idnumber;
    }

    public int getIdNumber() {
        return idnumber;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", iDNumber=" + idnumber + '}';
    }
}
