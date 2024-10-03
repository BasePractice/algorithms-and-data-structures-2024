package ru.mirea.practice.s23k0823.task1;

class Student implements Comparable<Student> {
    private String name;
    private int idNumber;

    public Student(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.idNumber, other.idNumber);
    }

    @Override
    public String toString() {
        return "Student{"
                +
                "name='"
                +
                name
                +
                '\''
                +
                ", idNumber="
                +
                idNumber
                +
                '}';
    }
}
