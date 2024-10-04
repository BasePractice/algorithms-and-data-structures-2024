package ru.mirea.practice.s0000001;

class Student {
    int idNumber;
    String name;
    double finalGrade;


    Student(int idNumber, String name, double finalGrade) {
        this.idNumber = idNumber;
        this.name = name;
        this.finalGrade = finalGrade;
    }

    public String toString() {
        return "Student{Name: " + name + ", ID: " + idNumber + ", Final Grade: " + finalGrade + "}";
    }
}
