package ru.mirea.practice.s0000001;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingStudentsbygpa implements Comparator<Student2> {

    private List<Student2> students;

    public SortingStudentsbygpa() {
        this.students = new ArrayList<>();
    }

    public void setArray() {
        students.add(new Student2(101, "Ivan", "Ivanov", 3.5));
        students.add(new Student2(102, "Maria", "Petrova", 4.0));
        students.add(new Student2(103, "Peter", "Sidorov", 3.7));
        students.add(new Student2(104, "Anna", "Smirnova", 3.8));
        students.add(new Student2(105, "John", "Doe", 3.2));
    }

    public void quicksort(int low, int high) {
        if (low < high) {
            int pi = partition(low, high);
            quicksort(low, pi - 1);
            quicksort(pi + 1, high);
        }
    }

    private int partition(int low, int high) {
        Student2 pivot = students.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (compare(students.get(j), pivot) > 0) {
                i++;
                Student2 temp = students.get(i);
                students.set(i, students.get(j));
                students.set(j, temp);
            }
        }
        Student2 temp = students.get(i + 1);
        students.set(i + 1, students.get(high));
        students.set(high, temp);
        return i + 1;
    }

    public void mergeSort(int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(left, mid);
            mergeSort(mid + 1, right);
            merge(left, mid, right);
        }
    }

    private void merge(int left, int mid, int right) {
        List<Student2> leftList = new ArrayList<>(students.subList(left, mid + 1));
        List<Student2> rightList = new ArrayList<>(students.subList(mid + 1, right + 1));

        int i = 0;
        int j = 0;
        int k = left;
        while (i < leftList.size() && j < rightList.size()) {
            if (compare(leftList.get(i), rightList.get(j)) > 0) {
                students.set(k++, leftList.get(i++));
            } else {
                students.set(k++, rightList.get(j++));
            }
        }

        while (i < leftList.size()) {
            students.set(k++, leftList.get(i++));
        }

        while (j < rightList.size()) {
            students.set(k++, rightList.get(j++));
        }
    }

    public void outArray() {
        for (Student2 student : students) {
            System.out.println(student);
        }
    }

    public void sortByIdNumber() {
        students.sort(Comparator.comparingInt(Student2::getIdNumber));
    }

    @Override
    public int compare(Student2 s1, Student2 s2) {
        return Double.compare(s2.getGpa(), s1.getGpa());
    }

    public static void main(String[] args) {
        SortingStudentsbygpa sortingStudents = new SortingStudentsbygpa();
        sortingStudents.setArray();

        System.out.println("Before sorting by GPA (quick sort):");
        sortingStudents.outArray();
        sortingStudents.quicksort(0, sortingStudents.students.size() - 1);

        System.out.println("\nAfter sorting by GPA (quick sort):");
        sortingStudents.outArray();

        sortingStudents.setArray();

        System.out.println("\nBefore sorting by GPA (merge sort):");
        sortingStudents.outArray();
        sortingStudents.mergeSort(0, sortingStudents.students.size() - 1);

        System.out.println("\nAfter sorting by GPA (merge sort):");
        sortingStudents.outArray();

        System.out.println("\nSorting by ID number:");
        sortingStudents.sortByIdNumber();
        sortingStudents.outArray();
    }
}
