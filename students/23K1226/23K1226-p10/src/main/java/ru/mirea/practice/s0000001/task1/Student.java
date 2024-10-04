package ru.mirea.practice.s0000001.task1;

class Student {
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

    public String getLastName() {
        return lastName;
    }

    public String getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", Major: " + major + ", Year: " + year + ", Group: " + group;
    }
}
