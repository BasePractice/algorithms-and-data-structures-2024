package ru.mirea.practice.s23k0140.tasks;

public class Student {
    private final String firstName;
    private final String lastName;
    private final String speciality;
    private final int course;
    private final String group;
    private final double gpa;

    public Student(String firstName, String lastName, String speciality, int course, String group, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public String toString() {
        return "Student{FirstName: " + firstName + ", LastName: " + lastName + ", Speciality: "
                + speciality + ", Course: " + course + ", Group: " + group + ", gpa: " + gpa + "}";
    }
}