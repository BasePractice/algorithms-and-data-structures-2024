package ru.mirea.practice.s23k0755.task;

public class Student {
    private String name;
    private String firstname;
    private String specialization;
    private int course;
    private String group;
    private double gpa;
    private int id;

    public Student(String name, String firstname, String specialization, int course, String group, double gpa, int id) {
        this.name = name;
        this.firstname = firstname;
        this.specialization = specialization;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSpecialization() {
        return specialization;
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

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int setId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{"
                + "name='" + name + '\''
                + ", firstname=" + firstname + '\''
                + ", specialization=" + specialization + '\''
                + ", course=" + course + '\''
                + ", group=" + group + '\''
                + ", gpa=" + gpa + '\''
                + ", id=" + id + '\''
                + '}';
    }
}
