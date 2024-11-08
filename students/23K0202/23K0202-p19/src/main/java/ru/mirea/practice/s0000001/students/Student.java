package ru.mirea.practice.s0000001.students;

public class Student {
    private String name;
    private String major;
    private int year;
    private String group;
    private final double gpa;

    public Student(String name, String major, int year, String group, double gpa) {
        this.name = name;
        this.major = major;
        this.year = year;
        this.group = group;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }


    @Override
    public String toString() {
        return "Student{" + "Name='" + name + '\'' + ", major='" + major + '\'' + ", year=" + year
                + ", group='" + group + '\'' + ", GPA='" + gpa + '\'' + '}';
    }
}
