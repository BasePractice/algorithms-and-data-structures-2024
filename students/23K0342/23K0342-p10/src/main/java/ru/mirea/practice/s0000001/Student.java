package ru.mirea.practice.s0000001;

public class Student {
    private String firstName;  // Имя
    private String lastName;   // Фамилия
    private String major;      // Специальность
    private int year;          // Курс
    private String group;      // Группа

    // Конструктор класса Student
    public Student(String firstName, String lastName, String major, int year, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.year = year;
        this.group = group;
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

    public int getYear() {
        return year;
    }

    public String getGroup() {
        return group;
    }

    // Сеттеры
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{"
                +
                "firstName='" + firstName
                + '\''
                +
                ", lastName='" + lastName
                + '\''
                +
                ", major='" + major
                + '\''
                +
                ", year=" + year
                +
                ", group='" + group + '\''
                +
                '}';
    }
}