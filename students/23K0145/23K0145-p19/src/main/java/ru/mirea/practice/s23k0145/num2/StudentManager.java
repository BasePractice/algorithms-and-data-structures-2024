package ru.mirea.practice.s23k0145.num2;

import java.util.ArrayList;
import java.util.List;

class StudentManager implements StudentCollection {
    private List<Student> students = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public Student findStudentByName(String name) throws StudentNotFoundException {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        throw new StudentNotFoundException(name);
    }

    @Override
    public void sortStudentsByGpa() {
        Student[] studentArray = students.toArray(new Student[0]);
        SortingStudentsByGpa.quickSort(studentArray, 0, studentArray.length - 1, new SortingStudentsByGpa());
        students = List.of(studentArray);
    }

    @Override
    public void printStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
