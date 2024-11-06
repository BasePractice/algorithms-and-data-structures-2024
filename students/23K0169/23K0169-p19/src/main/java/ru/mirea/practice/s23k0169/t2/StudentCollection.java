package ru.mirea.practice.s23k0169.t2;

interface StudentCollection {
    void addStudent(Student student);

    Student findStudentByName(String name) throws StudentNotFoundException;

    void sortStudentsByGpa();

    void printStudents();
}

