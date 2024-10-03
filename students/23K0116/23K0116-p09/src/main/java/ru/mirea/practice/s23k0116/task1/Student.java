package ru.mirea.practice.s23k0116.task1;

public class Student implements Comparable<Student> {
    int iDNumber;

    public Student(int idNumber) {
        this.iDNumber = idNumber;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.iDNumber, other.iDNumber);
    }

    @Override
    public String toString() {
        return "Student:"
                + "iDNumber=" + iDNumber + "\n";
    }

}
