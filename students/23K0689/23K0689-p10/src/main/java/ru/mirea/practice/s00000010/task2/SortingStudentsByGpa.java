package ru.mirea.practice.s00000010.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingStudentsByGpa {
    private List<Student> idnumber;

    public SortingStudentsByGpa() {
        idnumber = new ArrayList<>();
    }

    // Заполнение массива
    public void setArray() {
        idnumber.add(new Student("Alice", "Johnson", "Computer Science", 2, "CS2", 3.5));
        idnumber.add(new Student("Bob", "Smith", "Mathematics", 3, "MATH3", 3.8));
        idnumber.add(new Student("Charlie", "Brown", "Engineering", 1, "ENG1", 2.9));
        idnumber.add(new Student("David", "Wilson", "Physics", 3, "PHYS3", 3.2));
        idnumber.add(new Student("Eve", "Davis", "Biology", 2, "BIO2", 3.9));
    }

    // Сортировка студентов по GPA с помощью QuickSort
    public void quickSort() {
        quickSort(idnumber, 0, idnumber.size() - 1);
    }

    private void quickSort(List<Student> students, int low, int high) {
        if (low < high) {
            int pi = partition(students, low, high);
            quickSort(students, low, pi - 1);
            quickSort(students, pi + 1, high);
        }
    }

    private int partition(List<Student> students, int low, int high) {
        double pivot = students.get(high).getGpa();
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (students.get(j).getGpa() > pivot) {
                i++;
                Student temp = students.get(i);
                students.set(i, students.get(j));
                students.set(j, temp);
            }
        }
        Student temp = students.get(i + 1);
        students.set(i + 1, students.get(high));
        students.set(high, temp);

        return i + 1;
    }

    // Метод для сортировки студентов по другим полям
    public void sortByLastName() {
        idnumber.sort(Comparator.comparing(Student::getLastName));
    }

    // Метод вывода массива студентов
    public void outArray() {
        for (Student student : idnumber) {
            System.out.println(student);
        }
    }

    // Метод сортировки слиянием
    public void mergeSort() {
        idnumber = mergeSort(idnumber);
    }

    private List<Student> mergeSort(List<Student> students) {
        if (students.size() <= 1) {
            return students;
        }

        int mid = students.size() / 2;
        List<Student> left = mergeSort(students.subList(0, mid));
        List<Student> right = mergeSort(students.subList(mid, students.size()));

        return merge(left, right);
    }

    private List<Student> merge(List<Student> left, List<Student> right) {
        List<Student> merged = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).getGpa() > right.get(j).getGpa()) {
                merged.add(left.get(i));
                i++;
            } else {
                merged.add(right.get(j));
                j++;
            }
        }

        while (i < left.size()) {
            merged.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            merged.add(right.get(j));
            j++;
        }

        return merged;
    }

    public static void main(String[] args) {
        SortingStudentsByGpa sortingStudentsByGpa = new SortingStudentsByGpa();
        sortingStudentsByGpa.setArray();

        System.out.println("Before sorting by GPA:");
        sortingStudentsByGpa.outArray();

        sortingStudentsByGpa.quickSort();
        System.out.println("\nAfter sorting by GPA using QuickSort:");
        sortingStudentsByGpa.outArray();

        sortingStudentsByGpa.sortByLastName();
        System.out.println("\nAfter sorting by Last Name:");
        sortingStudentsByGpa.outArray();

        sortingStudentsByGpa.mergeSort();
        System.out.println("\nAfter sorting by GPA using MergeSort:");
        sortingStudentsByGpa.outArray();
    }
}