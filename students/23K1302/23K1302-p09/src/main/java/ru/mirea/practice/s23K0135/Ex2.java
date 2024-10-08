package ru.mirea.practice.s23K0135;

import java.util.Comparator;

class Ex2 implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.gpa, s1.gpa);
    }

    public static void quickSort(Student[] array, int low, int high, Comparator<Student> comparator) {
        if (low < high) {
            int pi = partition(array, low, high, comparator);
            quickSort(array, low, pi - 1, comparator);
            quickSort(array, pi + 1, high, comparator);
        }
    }

    private static int partition(Student[] array, int low, int high, Comparator<Student> comparator) {
        Student pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (comparator.compare(array[j], pivot) > 0) {
                i++;
                Student temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        Student temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        Student[] students = {
            new Student(3, "Таня", 3.5),
            new Student(1, "Аня", 3.9),
            new Student(2, "Маня", 3.7)
        };

        System.out.println("До сортировки:");
        for (Student student : students) {
            System.out.println(student);
        }

        quickSort(students, 0, students.length - 1, new Ex2());

        System.out.println("\nПосле сортировки:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
