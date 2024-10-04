package ru.mirea.practice.s0000001.task2;

public class Studentgpa implements Comparable<Studentgpa> {
    private int gpa;

    Studentgpa(int gpa) {
        this.gpa = gpa;
    }

    public int getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(Studentgpa s) {
        return this.getGpa() - s.getGpa();
    }

    @Override
    public String toString() {
        return "Student{GPA=" + gpa + "}";
    }


}
