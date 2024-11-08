package ru.mirea.practice.s0000001.task2;

public class Student implements Comparable<Student> {
    private int id;
    private String fio;

    Student(int id,String fio) {
        this.id = id;
        this.fio = fio;
    }

    public int getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    @Override
    public int compareTo(Student s) {
        return this.getId() - s.getId();
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ",fio=" + fio + "}";
    }


}
