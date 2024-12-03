package ru.mirea.practice.s0000001.task2;

public class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Студент{"
                + "id=" + id
                + ", имя='" + name + '\''
                + '}';
    }
}