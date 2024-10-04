package ru.mirea.practice.s0000001.task1;

import java.util.Arrays;

class Student {
    private int idNumber;
    private String name;

    public Student(int idNumber, String name) {
        this.idNumber = idNumber;
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    @Override
    public String toString() {
        return "Student{idNumber=" + idNumber + ", name='" + name + "'}";
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student[] students = {
                new Student(3, "Alice"),
                new Student(1, "Bob"),
                new Student(2, "Charlie")
        };

        // Сортировка вставками
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getIdNumber() > key.getIdNumber()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = key;
        }

        // Вывод отсортированного массива
        System.out.println("Отсортированные студенты по ID:");
        System.out.println(Arrays.toString(students));
    }
}