package ru.mirea.practice.s23k0114.lab1;


import java.util.Arrays;
import java.util.Comparator;

public class SortingStudentsByGpA {
    private Student[] students;

    public void setArray(Student[] students) {
        this.students = students;
    }

    public void quicksort() {
        Arrays.sort(students, new Comparator<>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.getGpa(), s1.getGpa());
            }
        });
    }

    public void mergeSort() {
        mergeSort(students, 0, students.length - 1);
    }

    private void mergeSort(Student[] array, int left, int right) {
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
        Student[] l = new Student[n1];
        Student[] r = new Student[n2];
        System.arraycopy(array, left, l, 0, n1);
        System.arraycopy(array, middle + 1, r, 0, n2);

        int i = 0;
        int j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (l[i].getGpa() >= r[j].getGpa()) {
                array[k] = l[i];
                i++;
            } else {
                array[k] = r[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            array[k] = l[i];
            i++;
            k++;
        }
        while (j < n2) {
            array[k] = r[j];
            j++;
            k++;
        }
    }

    public void outArray() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void mergeAndSort(Student[] array1, Student[] array2) {
        int totalLength = array1.length + array2.length;
        students = new Student[totalLength];

        System.arraycopy(array1, 0, students, 0, array1.length);
        System.arraycopy(array2, 0, students, array1.length, array2.length);

        quicksort(); // Можно использовать mergeSort() или quicksort()
    }

    public void sortByLastName() {
        Arrays.sort(students, new Comparator<>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getLastName().compareTo(s2.getLastName());
            }
        });
    }
}
