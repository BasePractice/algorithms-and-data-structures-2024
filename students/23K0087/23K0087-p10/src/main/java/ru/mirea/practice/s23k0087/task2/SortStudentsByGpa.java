package ru.mirea.practice.s23k0087.task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class SortStudentsByGpa {
    private Student[] students;

    public void setArray(int size, Scanner sc) {
        students = new Student[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Введите имя студента: ");
            final String name = sc.nextLine();
            System.out.print("Введите фамилию студента: ");
            final String surname = sc.nextLine();
            System.out.print("Введите GPA студента: ");
            final double gpa = sc.nextDouble();
            sc.nextLine();
            students[i] = new Student(name, surname, gpa);
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

    public void sortBySurname() {
        Arrays.sort(students, Comparator.comparing(Student::getSurname));
    }
}