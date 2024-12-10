package ru.mirea.practice.s23k0215.task2;


import java.util.ArrayList;
import java.util.List;

public class LabClass {
    private List<Student> students;

    public LabClass() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student findStudent(String fullName) throws StudentNotFoundException, EmptyStringException {
        if (fullName == null || fullName.trim().isEmpty()) {
            throw new EmptyStringException("ФИО не может быть пустым.");
        }
        for (Student student : students) {
            if (student.getFullName().equalsIgnoreCase(fullName)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Студент с ФИО '" + fullName + "' не найден.");
    }

    public List<Student> sortStudentsByAverageGrade() {
        students.sort((s1, s2) -> Double.compare(s2.getAverageGrade(), s1.getAverageGrade()));
        return students;
    }
}

