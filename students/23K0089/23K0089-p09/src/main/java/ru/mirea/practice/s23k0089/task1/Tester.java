package ru.mirea.practice.s23k0089.task1;

import java.util.Arrays;
import java.util.Random;

public abstract class Tester {
    public static Comparable[] insertSort(Comparable[] array) {
        for (int i = 1; i < array.length; i++) {
            Comparable key = array[i];
            int j = i;
            while (j > 0 && key.compareTo(array[j - 1]) != 1) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = key;
        }
        return array;
    }

    public static void main(String[] args) {
        Random random = new Random();
        String[] name = {"Студент", "Студентка", "Студентишка", "Студенчёнок", "Студентик"};

        Student[] students = new Student[5];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(name[random.nextInt(name.length - 1)],
                    String.format("23K%04d", students.length - i - 1), 18 + random.nextInt(3));
        }

        System.out.println(Arrays.toString(students));
        System.out.println();
        System.out.println(Arrays.toString(insertSort(students)));
    }
}
