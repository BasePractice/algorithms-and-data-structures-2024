package mirea.lab9;

/* Напишите класс SortingStudentsByGPA который реализует
интерфейс Comparator таким образом, чтобы сортировать список студентов по их
итоговым баллам в порядке убывания с использованием алгоритма быстрой
сортировки. */

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Prac9p2 {
    public static void quickSort(Object[] array, int high, int low) {
        SortingStudentsBygpa co = new SortingStudentsBygpa();
        if (array == null || array.length == 0) {
            return;
        }
        if (high <= low) {
            return;
        }

        Object middle = array[(low + high) / 2];
        ArrayList<Object> left = new ArrayList<>();
        ArrayList<Object> right = new ArrayList<>();
        ArrayList<Object> eq = new ArrayList<>();
        for (int i = low; i <= high; i++) {
            if (co.compare(array[i], middle) > 0) {
                right.add(array[i]);
            } else if (co.compare(array[i], middle) < 0) {
                left.add(array[i]);
            } else {
                eq.add(array[i]);
            }
        }
        Object[] leftArr;
        Object[] rightArr;
        if (!left.isEmpty()) {
            leftArr = left.toArray();
            quickSort(leftArr, left.size() - 1, 0);
            System.arraycopy(leftArr, 0, array, low, left.size());
        }
        System.arraycopy(eq.toArray(), 0, array, low + left.size(), eq.size());

        if (!right.isEmpty()) {
            rightArr = right.toArray();
            quickSort(rightArr, right.size() - 1, 0);
            System.arraycopy(rightArr, 0, array, low + left.size() + eq.size(), right.size());

        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[]{
            new Student(289, 3),
            new Student(190, 5),
            new Student(111, 1),
            new Student(100, 11)
        };
        quickSort(students, students.length - 1, 0);
        System.out.println(Arrays.toString(students));
    }
}
