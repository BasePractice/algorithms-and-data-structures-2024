package ru.mirea.practice.s23k0145.num2;

interface StudentCollection {
    void addStudent(Student student);

    Student findStudentByName(String name) throws StudentNotFoundException;

    void sortStudentsByGpa();

    void printStudents();
}
