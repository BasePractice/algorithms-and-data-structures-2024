package ru.mirea.practice.s23k0690;

public class SortId {
    public Student[] sortStudentsByAverageScore(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].compareTo(students[j + 1]) > 0) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        return students;
    }

    public Student findStudent(Student[] students, String fio) {
        for (Student student : students) {
            if (student != null && student.getFio().equals(fio)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Student with name: " + fio + ", is not found");
    }

    public void listStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println("N" + (i + 1) + " - " + students[i]);
            }
        }
    }
}
