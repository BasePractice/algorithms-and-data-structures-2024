package ru.mirea.practice.s23k0114.lab1;

public final class SortStudents {

    private SortStudents() {

    }

    public static void main(String[] args) {
        Student[] students = {
            new Student(102, "Alice"),
            new Student(101, "Bob"),
            new Student(104, "Charlie"),
            new Student(103, "David")
        };

        insertionSort(students);
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getIdNumber() > key.getIdNumber()) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
    }
}
