package ru.mirea.practice.s0000001.task1;

class Student implements Comparable<Student> {
    private int idNumber;
    private String name;
    private double gpa;

    public Student(int idNumber, String name, double gpa) {
        this.idNumber = idNumber;
        this.name = name;
        this.gpa = gpa;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public double getGpa() {
        return gpa;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.idNumber, other.idNumber);
    }

    @Override
    public String toString() {
        return "Student{idNumber=" + idNumber + ", name='" + name + "', gpa=" + gpa + "}";
    }
}
