package ru.mirea.practices0000001.task1;

class StudentGpa {
    private String name;
    private double gpa;

    public StudentGpa(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "StudentGPA{"
                +
                "name='" + name + '\''
                +
                ", gpa=" + gpa
                +
                '}';
    }
}
