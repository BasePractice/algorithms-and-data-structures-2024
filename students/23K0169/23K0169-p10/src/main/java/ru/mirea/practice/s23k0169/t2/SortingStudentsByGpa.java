package ru.mirea.practice.s23k0169.t2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class SortingStudentsByGpa {
    private Student[] students;

    public void setArray(int size) {
        students = new Student[size];
        try (Scanner scanner = new Scanner(System.in)) {

            for (int i = 0; i < size; i++) {
                System.out.print("Введите имя студента: ");
                final String firstName = scanner.nextLine();
                System.out.print("Введите фамилию студента: ");
                final String lastName = scanner.nextLine();
                System.out.print("Введите GPA студента: ");
                final double gpa = scanner.nextDouble();
                scanner.nextLine(); // consume newline
                students[i] = new Student(firstName, lastName, gpa);
            }
        }
    }

    public void quicksort() {
        Arrays.sort(students, Comparator.comparingDouble(Student::getGpa).reversed());
    }

    public void mergeSort() {
        students = mergeSort(students);
    }

    private Student[] mergeSort(Student[] array) {
        if (array.length <= 1) {
            return array;
        }

        int mid = array.length / 2;
        Student[] left = mergeSort(Arrays.copyOfRange(array, 0, mid));
        Student[] right = mergeSort(Arrays.copyOfRange(array, mid, array.length));

        return merge(left, right);
    }

    private Student[] merge(Student[] left, Student[] right) {
        Student[] result = new Student[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i].getGpa() > right[j].getGpa()) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }

    public void outArray() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void sortByLastName() {
        Arrays.sort(students, Comparator.comparing(Student::getLastName));
    }
}