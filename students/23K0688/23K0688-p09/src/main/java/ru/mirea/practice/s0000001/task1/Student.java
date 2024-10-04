package ru.mirea.practice.s0000001.task1;

public class Student implements Comparable<Student> {
    private int id;

    Student(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Student s) {
        return this.getId() - s.getId();
    }

    @Override
    public String toString() {
        return "Student{id=" + id + "}";
    }


}
