package ru.mirea.practice.s0000001;

import java.util.Arrays;
import java.util.Comparator;

public class SortingStudents implements Comparator<Student> {
    private Student[] students;

    public void setArray(Student[] studentsArray) {
        this.students = studentsArray;
    }

    public void outArray() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getGpa(), s1.getGpa());
    }


    public void quicksort(int low, int high) {
        if (low < high) {
            int pivotIndex = partition(low, high);
            quicksort(low, pivotIndex - 1);
            quicksort(pivotIndex + 1, high);
        }
    }

    private int partition(int low, int high) {
        Student pivot = students[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (compare(students[j], pivot) < 0) {
                i++;
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }
        Student temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;
        return i + 1;
    }

    public void mergeSort(Student[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }

    private void merge(Student[] array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        Student[] leftArray = new Student[n1];
        Student[] rightArray = new Student[n2];

        System.arraycopy(array, left, leftArray, 0, n1);
        System.arraycopy(array, middle + 1, rightArray, 0, n2);

        int i = 0;
        int j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (compare(leftArray[i], rightArray[j]) <= 0) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public void sortByName() {
        Arrays.sort(students, Comparator.comparing(Student::getFirstName));
    }

    public static void main(String[] args) {
        Student[] studentsArray = {new Student("Anna", "Valko", "Math", 5, "A", 3.9), new Student("Mariya", "Chapaeva", "Physics", 4, "B", 3.7),};

        SortingStudents sorter = new SortingStudents();
        sorter.setArray(studentsArray);

        System.out.println("Before sorting by GPA:");
        sorter.outArray();

        sorter.quicksort(0, studentsArray.length - 1);
        System.out.println("\nAfter quicksort by GPA:");
        sorter.outArray();

        System.out.println("\nSorting by name:");
        sorter.sortByName();
        sorter.outArray();
    }
}