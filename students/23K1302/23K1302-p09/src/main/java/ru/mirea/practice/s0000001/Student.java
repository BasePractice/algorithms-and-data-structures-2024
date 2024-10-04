package ru.mirea.practice.s0000001;

class Student {
    int id;
    String name;
    double gpa;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public int getiDNumber() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{"
                + "iDNumber=" + id
                + ", name='" + name + '\''
                + ", gpa=" + gpa
                + '}';
    }
}





