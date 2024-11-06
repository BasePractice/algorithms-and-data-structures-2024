package ru.mirea.practice.s0000001;

public class Student1 implements Comparable<Student1> {
    private String id;
    private String name;

    public Student1(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student1 student) {
        return this.id.compareTo(student.id);
    }

    public String toString() {
        return "Student1{id:" + id + ", name:" + name + "}";
    }
}
