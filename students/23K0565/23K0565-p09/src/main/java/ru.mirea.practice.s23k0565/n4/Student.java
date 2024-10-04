package ru.mirea.practice.s23k0565.n4;

public final class Student implements Comparable<Student> {
    private int iDnumber;
    private String name;

    public Student(int id, String name) {
        this.iDnumber = id;
        this.name = name;
    }

    public int getIDnumber() {
        return iDnumber;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.iDnumber, other.iDnumber);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', iDNumber=" + iDnumber + "}";
    }
}