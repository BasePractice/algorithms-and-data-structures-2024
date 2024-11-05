package ru.mirea.practice.s0000001.task3;

public class Student {
    // Переменные экземпляра
    private String firstName;
    private String lastName;
    private String specialty;
    private int course;
    private String group;
    private double gpa; // Средний балл

    // Конструктор
    public Student(String firstName, String lastName, String specialty, int course, String group, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
    }

    // Геттеры и сеттеры для каждой переменной

    // Имя
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Фамилия
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Специальность
    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    // Курс
    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    // Группа
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

    // Переопределение метода toString для удобного вывода информации о студенте
    @Override
    public String toString() {
        return "Student{"
                + "firstName='" + firstName + '\''
                + ", lastName='" + lastName + '\''
                + ", specialty='" + specialty + '\''
                + ", course=" + course
                + ", group='" + group + '\''
                + ", gpa=" + gpa
                + '}';
    }
}
