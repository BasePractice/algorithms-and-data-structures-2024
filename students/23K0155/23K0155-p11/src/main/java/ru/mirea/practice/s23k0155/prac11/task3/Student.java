package ru.mirea.practice.s23k0155.prac11.task3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Student {
    private String firstName;
    private String lastName;
    private String specialty;
    private int course;
    private String group;
    private double gpa;
    private Calendar dateOfBirth;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(String firstName, String lastName, String specialty,
                   int course, String group, double gpa, Calendar dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
        this.dateOfBirth = dateOfBirth;
    }

    // Геттеры и сеттеры
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Date getDateOfBirth() {
        return dateOfBirth.getTime();
    }

    public void setDateOfBirth(Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    final SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");

    @Override
    public String toString() {
        return "\n\nФИ: " + firstName + " " + lastName
                + "\nспециальность: " + specialty
                + "\nкурс: " + course
                + "\nгруппа: " + group
                + "\ngpa: " + gpa
                + "\nДата рождения: " + sdf.format(dateOfBirth.getTime());
    }
}

