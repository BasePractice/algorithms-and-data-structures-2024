package ru.mirea.practice.s0000001.task1and4;

public class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Student s) {
        return this.id - s.getId();
    }

    @Override
    public String toString() {
        return "Student:\n"
                + "id=" + id
                + ", name - " + name;
    }
}
