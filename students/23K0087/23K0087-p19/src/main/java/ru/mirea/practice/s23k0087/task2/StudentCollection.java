package ru.mirea.practice.s23k0087.task2;

interface StudentCollection {
    void addStudent(Student student);

    Student findStudentByName(String name) throws StudentNotFoundException;

    void sortStudentsByGpa();

    void printStudents();
}

