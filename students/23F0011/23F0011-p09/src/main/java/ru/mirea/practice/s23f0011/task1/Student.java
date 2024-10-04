package ru.mirea.practice.s23f0011.task1;

class Student {
    private final int idNumber;
    private final String name;

    public Student(int idNumber, String name) {
        this.idNumber = idNumber;
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Student{" + "idNumber=" + idNumber + ", name='" + name + '\'' + '}';
    }
}