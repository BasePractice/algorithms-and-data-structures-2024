package ru.mirea.practice.s0000001.task1;

public class Student {
    int idNumber;
    String name;

    public Student(int idNumber, String name) {
        this.idNumber = idNumber;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Студент{"
            + "id=" + idNumber
            + ", имя='" + name + '\''
            + '}';
    }
}