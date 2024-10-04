package ru.mirea.practice.s23k0087.task2;

public class Student {
    private final String name;
    private final String surname;
    private final double gpa;

    public Student(String name, String surname, double gpa) {
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" + "name = '" + name + ", surname = " + surname + ", gpa = " + gpa + '}';
    }
}
