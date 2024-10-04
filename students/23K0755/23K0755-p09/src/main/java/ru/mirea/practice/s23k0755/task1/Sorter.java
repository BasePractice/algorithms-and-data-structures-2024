package ru.mirea.practice.s23k0755.task1;

import java.util.Arrays;

public abstract class Sorter {
    public static void insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;

            // Перемещаем элементы, которые больше ключа, на одну позицию вперед
            while (j >= 0 && students[j].compareTo(key) > 0) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            // Вставляем key в правильную позицию
            students[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student(85);
        students[1] = new Student(102);
        students[2] = new Student(11);
        students[3] = new Student(144);
        students[4] = new Student(133);

        System.out.println("Массив до сортировки:");
        System.out.println(Arrays.toString(students));

        insertionSort(students);

        System.out.println("Массив после сортировки:");
        System.out.println(Arrays.toString(students));
    }
}
