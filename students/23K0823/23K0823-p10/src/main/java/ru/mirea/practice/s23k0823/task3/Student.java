package ru.mirea.practice.s23k0823.task3;

public class Student {
    private String name;
    private String surname;
    private String specialty;
    private int course;
    private String group;
    private double gpa;

    public Student(String name, String surname, String specialty, int course, String group, double gpa) {
        this.name = name;
        this.surname = surname;
        this.specialty = specialty;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Студент: "
                +
                name
                +
                " "
                +
                surname
                +
                ", Специальность: "
                +
                specialty
                +
                ", Курс: "
                +
                course
                +
                ", Группа: "
                +
                group
                +
                ", Средний балл: "
                +
                gpa;
    }
}
