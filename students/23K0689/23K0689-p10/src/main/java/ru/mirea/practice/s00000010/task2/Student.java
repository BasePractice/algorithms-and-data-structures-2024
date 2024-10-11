package ru.mirea.practice.s00000010.task2;

public final class Student {

    private Student() {

    }


    private String firstName;
    private String lastName;
    private String major;
    private int course;
    private String group;
    private double gpa;

    public Student(String firstName, String lastName, String major, int course, String group, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
    }

    // Геттеры
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMajor() {
        return major;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", major='" + major + '\''
                + ", " + "course=" + course + ", group='" + group + '\'' + ", gpa=" + gpa + '}';
    }
}