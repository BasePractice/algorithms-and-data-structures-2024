package ru.mirea.practice.s23f0011.task2;

import java.util.Arrays;

class LabClass {
    private Student[] students;
    private int count;

    public LabClass(int size) {
        students = new Student[size];
        count = 0;
    }

    public void addStudent(Student student) throws ArrayIndexOutOfBoundsException {
        if (count < students.length) {
            students[count++] = student;
        } else {
            throw new ArrayIndexOutOfBoundsException("Массив студентов переполнен");
        }
    }

    public Student findStudent(String fullName) throws StudentNotFoundException, EmptyStringException {
        if (fullName == null || fullName.trim().isEmpty()) {
            throw new EmptyStringException("ФИО не может быть пустым");
        }

        for (Student student : students) {
            if (student != null && student.getFullName().equalsIgnoreCase(fullName)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Студент с ФИО '" + fullName + "' не найден");
    }

    public void sortStudentsByAverageScore() {
        Arrays.sort(students, 0, count, (s1, s2) -> {
            if (s1 == null || s2 == null) {
                return 0;
            }
            return Double.compare(s1.getAverageScore(), s2.getAverageScore());
        });
    }

    public Student[] getStudents() {
        return Arrays.copyOf(students, count);
    }
}
