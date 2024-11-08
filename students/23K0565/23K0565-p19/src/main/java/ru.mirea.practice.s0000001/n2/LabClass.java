package ru.mirea.practice.s0000001.n2;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LabClass {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void sortStudentsByScore() {
        Collections.sort(students, Comparator.comparingDouble(Student::getAverageScore).reversed());
    }

    public Student findStudentByFio(String fio) throws NStudent, EmpString {
        if (fio == null || fio.trim().isEmpty()) {
            throw new EmpString("ФИО не может быть пустым:(");
        }
        return students.stream()
            .filter(student -> student.getFio().equalsIgnoreCase(fio))
            .findFirst()
            .orElseThrow(() -> new NStudent("Студент с ФИО " + fio + " не найден"));
    }

    public List<Student> getStudents() {
        return students;
    }
}
