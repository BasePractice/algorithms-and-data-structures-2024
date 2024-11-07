package ru.mirea.practice.s23k0823.task1.task1.students;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class LabClass {
    private List<Student> students;

    public LabClass() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student searchStudentByFio(String fio) throws StudentNotFoundException, EmptyStringException {
        if (fio.isEmpty()) {
            throw new EmptyStringException("ФИО не может быть пустым");
        }
        for (Student student : students) {
            if (student.getFio().equals(fio)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Студент с ФИО " + fio + " не найден");
    }

    public void sortStudentsByAverageMark() {
        Collections.sort(students, (s1, s2) -> Double.compare(s2.getAverageMark(), s1.getAverageMark()));
    }

    public List<Student> getStudents() {
        return students;
    }
}
