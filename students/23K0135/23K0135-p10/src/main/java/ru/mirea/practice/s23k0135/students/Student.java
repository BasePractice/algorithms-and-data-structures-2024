package ru.mirea.practice.s23k0135.students;

public class Student {
    private String name;
    private String surname;
    private String spec;
    private int course;
    private String group;
    private int idNumber;
    private double gpa;

    public Student(String name, String surname, String spec, int course, String group, int idNumber, double gpa) {
        this.name = name;
        this.surname = surname;
        this.spec = spec;
        this.course = course;
        this.group = group;
        this.idNumber = idNumber;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
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

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Студент: " + name + " " + surname + ", специальность: " + spec + ", курс: " + course
                + ", группа: " + group + ", IDNumber: " + idNumber + ", GPA: " + gpa;
    }
}
