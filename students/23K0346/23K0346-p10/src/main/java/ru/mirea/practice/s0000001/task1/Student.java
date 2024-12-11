package ru.mirea.practice.s0000001.task1;

import java.util.Comparator;

public class Student {
    private String firstName;
    private String lastName;
    private String major;
    private int year;
    private String group;

    public Student(String firstName, String lastName, String major, int year, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.year = year;
        this.group = group;
    }

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

    public String getMajor() {
        return major;
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
        return "Student{"
                + "firstName='" + firstName + '\''
                + ", lastName='" + lastName + '\''
                + ", major='" + major + '\''
                + ", year=" + year
                + ", group='" + group + '\''
                + '}';
    }

    public static Comparator<Student> compareByLastName() {
        return new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getLastName().compareTo(s2.getLastName());
            }
        };
    }

    public static Comparator<Student> compareByYear() {
        return new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getYear(), s2.getYear());
            }
        };
    }

    public static Comparator<Student> compareByFirstName() {
        return new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getFirstName().compareTo(s2.getFirstName());
            }
        };
    }
}

