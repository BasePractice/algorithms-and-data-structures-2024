package ru.mirea.practice.s23k0690.task2;

import java.util.ArrayList;
import java.util.List;

class SortingStudentsBygpa {
    private List<Student> students;

    public SortingStudentsBygpa() {
        students = new ArrayList<>();
    }

    public void setArray() {
        students.add(new Student("Алиса", 3.5, 18));
        students.add(new Student("Егор", 3.8, 19));
        students.add(new Student("Олег", 3.2, 20));
        students.add(new Student("Давид", 3.9, 22));
    }

    public void quickSort(int low, int high) {
        if (low < high) {
            int pi = partition(low, high);
            quickSort(low, pi - 1);
            quickSort(pi + 1, high);
        }
    }

    private int partition(int low, int high) {
        double pivot = students.get(high).getGpa();
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (students.get(j).getGpa() >= pivot) {
                i++;
                swap(i, j);
            }
        }
        swap(i + 1, high);
        return i + 1;
    }

    private void swap(int i, int j) {
        Student temp = students.get(i);
        students.set(i, students.get(j));
        students.set(j, temp);
    }

    public void mergeSort() {
        students = mergeSort(students);
    }

    private List<Student> mergeSort(List<Student> list) {
        if (list.size() <= 1) {
            return list;
        }
        int mid = list.size() / 2;
        List<Student> left = mergeSort(list.subList(0, mid));
        List<Student> right = mergeSort(list.subList(mid, list.size()));
        return merge(left, right);
    }

    private List<Student> merge(List<Student> left, List<Student> right) {
        List<Student> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < left.size() && j < right.size()) {
            if (left.get(i).getGpa() >= right.get(j).getGpa()) {
                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }
        while (i < left.size()) {
            result.add(left.get(i));
            i++;
        }
        while (j < right.size()) {
            result.add(right.get(j));
            j++;
        }
        return result;
    }

    public void outArray() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void sortByName() {
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = 0; j < students.size() - 1 - i; j++) {
                if (students.get(j).getName().compareTo(students.get(j + 1).getName()) > 0) {
                    swap(j, j + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        SortingStudentsBygpa sorting = new SortingStudentsBygpa();
        sorting.setArray();

        System.out.println("Студенты сортировка по баллам (Quick Sort):");
        sorting.quickSort(0, sorting.students.size() - 1);
        sorting.outArray();

        System.out.println("\nСтуденты сортировка по баллам (Merge Sort):");
        sorting.mergeSort();
        sorting.outArray();

        System.out.println("\nСтуденты отсортированные по имени");
        sorting.sortByName();
        sorting.outArray();
    }
}