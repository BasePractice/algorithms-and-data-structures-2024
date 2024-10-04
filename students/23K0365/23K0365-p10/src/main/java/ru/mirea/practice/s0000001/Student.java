package ru.mirea.practice.s0000001;

public class Student {
    private String firstName;
    private String secondName;
    private String speciality;
    private int course;
    private String group;
    private int gpa;

    public Student(String firstName, String secondName, String speciality, int course, String group, int gpa) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student:\n" 
                + "firstName - " + firstName
                + ", secondName - " + secondName
                + ", speciality - " + speciality
                + ", course: " + course
                + ", group: " + group
                + ", gpa = " + gpa;
    }

    public int getgpa() {
        return gpa;
    }

    public void setgpa(int gpa) {
        this.gpa = gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
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
}
